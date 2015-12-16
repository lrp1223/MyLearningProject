package com.rongpengli.test.xmltest;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.time.DateFormatUtils;

@XmlRootElement(name = "ROOT")
@XmlAccessorType(XmlAccessType.FIELD)
public class OfflineClaim {
    public OfflineClaim() {
    }

    private MainInfo Main_Info;
    private ApplicantInfo Applicant_Info;
    private ClaimantInfo Claimant_Info;

    @XmlElementWrapper(name = "tests")
    @XmlElement(name = "test")
    private List<String> test;

    public MainInfo getMain_Info() {
        return Main_Info;
    }

    public void setMain_Info(MainInfo main_Info) {
        Main_Info = main_Info;
    }

    public ApplicantInfo getApplicant_Info() {
        return Applicant_Info;
    }

    public void setApplicant_Info(ApplicantInfo applicant_Info) {
        Applicant_Info = applicant_Info;
    }

    public ClaimantInfo getClaimant_Info() {
        return Claimant_Info;
    }

    public void setClaimant_Info(ClaimantInfo claimant_Info) {
        Claimant_Info = claimant_Info;
    }

    public List<String> getTest() {
        return test;
    }

    public void setTest(List<String> test) {
        this.test = test;
    }

}

class MainInfo {
    @XmlElement
    String Os_Batch_No;
    @XmlElement
    String Os_Biz_No;
    @XmlElement
    String Os_External_No;
    @XmlElement
    String Os_Source;
    @XmlElement
    String Finish_Process_State;
    @XmlElement
    String Os_Register_Time;
    @XmlElement
    String Os_Accept_Date;
    @XmlElement
    String Is_Survey;

    MainInfo(String Os_Batch_No, String Os_Biz_No, String Os_External_No) {
        this.Os_Batch_No = Os_Batch_No;
        this.Os_Biz_No = Os_Biz_No;
        this.Os_External_No = Os_External_No;
        Os_Source = "EB";
        Finish_Process_State = "OSCA";
        String lDate = DateFormatUtils.format(new Date(), "yyyy-MM-dd");
        Os_Register_Time = lDate;
        Os_Accept_Date = lDate;
        Is_Survey = "0";
    }
}

class ApplicantInfo {
    @XmlElement
    String Applicant_Name;
    @XmlElement
    String Relation_Code;
    @XmlElement
    String Applicant_Certificate_Type;
    @XmlElement
    String Applicant_Certificate_No;
    @XmlElement
    String Applicant_Phone;
    @XmlElement
    String Applicant_Address;

    ApplicantInfo(String Applicant_Name, String Relation_Code, String Applicant_Certificate_Type,
            String Applicant_Certificate_No, String Applicant_Phone, String Applicant_Address) {
        this.Applicant_Name = Applicant_Name;
        this.Relation_Code = Relation_Code;
        this.Applicant_Certificate_Type = Applicant_Certificate_Type;
        this.Applicant_Certificate_No = Applicant_Certificate_No;
        this.Applicant_Phone = Applicant_Phone;
        this.Applicant_Address = Applicant_Address;
    }
}

class ClaimantInfo {

}
