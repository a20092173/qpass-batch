package com.unionpay.batch.service.imp;

import com.unionpay.batch.dao.TblQpbatFileFtpCfgMapper;
import com.unionpay.batch.entity.TblQpbatFileFtpCfg;
import com.unionpay.batch.entity.TblQpbatFileFtpCfgExample;
import com.unionpay.batch.service.TblQpbatFileFtpCfgService;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDataMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.Arrays;
import java.util.List;


@Slf4j
@Service
@Transactional

public class TblQpbatFileFtpCfgServiceImpl implements TblQpbatFileFtpCfgService {
    @Autowired
    TblQpbatFileFtpCfgMapper TblQpbatFileFtpCfgDao;

    TblQpbatFileFtpCfg tblQpbatFileFtpCfg;

    private String getPath(String TblPathName, String Sep,JobDataMap datMap){
        String FilePathEnv = TblPathName.substring(TblPathName.indexOf("=")+1);
        String FilePath = null;

        String [] arrs = null;
        String str1 = null;
        arrs = FilePathEnv.split(Sep);

        int i = 0;
        int idx;
        for(String au : arrs){
            log.info("au = " + au);
            if(au.startsWith("$")) {
                if((idx =au.indexOf(".")) != -1){
                    str1 = datMap.getString(au.substring(au.indexOf("$")+1, idx));
                    arrs[i] = str1.concat(au.substring(idx));
                }else {
                    arrs[i] = datMap.getString(au.substring(au.indexOf("$") + 1));
                }
            }
            log.info("arrs[" + i + "] = " + arrs[i]);
            if(FilePath != null) {
                FilePath = FilePath+ Sep + arrs[i];
            }else{
                FilePath = arrs[i];
            }
            i++;
        }
        log.info("FilePath = " +FilePath);
        return FilePath;
    }

    public TblQpbatFileFtpCfg getFtpCfgFileExampInf(JobDataMap datMap, String fileIndex){

        String bussCd = datMap.get("BussCd").toString();
        List<String> list = Arrays.asList("d","D");

        TblQpbatFileFtpCfgExample qpbatFileFtpCfgExample = new TblQpbatFileFtpCfgExample();
        TblQpbatFileFtpCfgExample.Criteria criteriaFtpCfgExample = qpbatFileFtpCfgExample.createCriteria();
        criteriaFtpCfgExample.andBussCdEqualTo(bussCd);
        criteriaFtpCfgExample.andFileIdxEqualTo(fileIndex);
        criteriaFtpCfgExample.andOperInNotIn(list);

        try {
             List <TblQpbatFileFtpCfg> tblQpbatFileFtpCfgs=TblQpbatFileFtpCfgDao.selectByExample(qpbatFileFtpCfgExample);
             if(tblQpbatFileFtpCfgs.size() == 1){
                 tblQpbatFileFtpCfg = tblQpbatFileFtpCfgs.get(0);
             }
        }catch (Exception e){
            log.error("selectByPrimaryKey查询文件配置信息表发生异常，bussCd:" + bussCd + ",fileIndex:" + fileIndex,e);
            return null;
        }
        return tblQpbatFileFtpCfg;
    }


    public String getRemoteFilePath(JobDataMap datMap, String fileIndex){

        tblQpbatFileFtpCfg = getFtpCfgFileExampInf(datMap, fileIndex);
        String TblRmtDir = tblQpbatFileFtpCfg.getRmtDir();

        return getPath(TblRmtDir, File.separator,datMap);
    }
    public String getLocalFilePath(JobDataMap datMap, String fileIndex){

        tblQpbatFileFtpCfg = getFtpCfgFileExampInf(datMap, fileIndex);
        String TblLocalDir = tblQpbatFileFtpCfg.getLocDir();
        return getPath(TblLocalDir, File.separator,datMap);
    }
    public String getFileName(JobDataMap datMap, String fileIndex){

        tblQpbatFileFtpCfg = getFtpCfgFileExampInf(datMap, fileIndex);
        String TblFileNm = tblQpbatFileFtpCfg.getFileNm();
        return getPath(TblFileNm, "_",datMap);
    }

    public String getServiceIP(JobDataMap datMap, String fileIndex){
        return getFtpCfgFileExampInf(datMap, fileIndex).getSerIp();
    }

    public String getServicePort(JobDataMap datMap, String fileIndex){
        return getFtpCfgFileExampInf(datMap, fileIndex).getSerPort();
    }

    public String getServicePtl(JobDataMap datMap, String fileIndex){
        return getFtpCfgFileExampInf(datMap, fileIndex).getSerPtl();
    }

    public String getLoginUser(JobDataMap datMap, String fileIndex){
        return getFtpCfgFileExampInf(datMap, fileIndex).getLoginUser();
    }

    public String getLoginPwd(JobDataMap datMap, String fileIndex){
        return getFtpCfgFileExampInf(datMap, fileIndex).getLoginPwd();
    }

    public String getGpFlg(JobDataMap datMap, String fileIndex){
        return getFtpCfgFileExampInf(datMap, fileIndex).getGpFlg();
    }
}
