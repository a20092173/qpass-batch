package com.unionpay.batch.base;

public class QpCupsN01File extends QpCupsFileFieldMap{

    public QpCupsN01File() {
        super.setHeadEndFlag("3");
        super.setHeadLine(2);
        super.setEndLine(1);
    }

//    @Override
//    public String toString() {
//        return "QpCupsN01File{" +
//                "headEndFlag='" + headEndFlag + '\'' +
//                ", headLine=" + headLine +
//                ", endLine=" + endLine +
//                '}';
//    }
}
