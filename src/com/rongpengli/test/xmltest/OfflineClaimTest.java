package com.rongpengli.test.xmltest;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class OfflineClaimTest {
    public static void main(String[] args) {
        OfflineClaim lOfflineClaim = new OfflineClaim();
        MainInfo lMainInfo = new MainInfo("李荣鹏", "test2", "test3");
        lOfflineClaim.setMain_Info(lMainInfo);

        ApplicantInfo lApplicantInfo = new ApplicantInfo("Applicant_Name", "Relation_Code",
                "Applicant_Certificate_Type", "Applicant_Certificate_No", "Applicant_Phone",
                "Applicant_Address");
        lOfflineClaim.setApplicant_Info(lApplicantInfo);

        List<String> lList = new ArrayList<String>();
        lList.add("lrp");
        lOfflineClaim.setTest(lList);

        try {
            JAXBContext lJAXBContext = JAXBContext.newInstance(OfflineClaim.class);
            Marshaller lMarshaller = lJAXBContext.createMarshaller();
            lMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            lMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);// Format
            lMarshaller.marshal(lOfflineClaim, System.out);
        } catch (Exception e) {

        }
    }
}
