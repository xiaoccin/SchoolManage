package com.xiaocc.pojo;

import lombok.Data;

@Data
public class QrCodeInfo {

    private String name;
    private String number;
    private String schoolNumber;
    private String telNumber;
    //是否去过疫区
    private String isEpidemuc;
    //是否去过国外
    private String isAborad;
    //是否接触过确证病人
    private String isPatient;
    //是否被确诊
    private String isDefinite;
    //是否打过疫苗,疫苗数量
    private String Vaccines;
    //是否健康
    private String isHealth[];
    //症状数量
    private String symptoms;

}
