package jsonBindings2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class dinitialization {

    public static void main (String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        Dobjects obj = new Dobjects();
        obj.setCompanyName2("MSE");
        obj.setCompanyHOCity2("Lagos");
        obj.setCompanyCEO2("Steve");

        List<String> supportedsalarybnk = new ArrayList<>();
        supportedsalarybnk.add("HDFC");
        supportedsalarybnk.add("ICICI");
        supportedsalarybnk.add("AXIS");
        obj.setSupportedSalaryBanks2(supportedsalarybnk);

        List<Integer> pincodesofcity = new ArrayList<>();
        pincodesofcity.add(20302030);
        pincodesofcity.add(23022932);
        pincodesofcity.add(203020302);
        obj.setPinCodesofCity2(pincodesofcity);

        Employees2 employees1 = new Employees2();
        employees1.setFirstname("Emmy");
        employees1.setLastname("Jones");
        employees1.setGender("Male");
        employees1.setSalary(200000);
        employees1.setMarried(false);
        employees1.setAge(30);

        Employees2 employees2 = new Employees2();
        employees2.setFirstname("Tony");
        employees2.setLastname("Mayor");
        employees2.setGender("Male");
        employees2.setSalary(200000);
        employees2.setMarried(true);
        employees2.setAge(40);

        List<Employees2> employeess = new ArrayList<>();
        employeess.add(employees1);
        employeess.add(employees2);

        obj.setEmployees2(employeess);


        Contractors2 contractors1 = new Contractors2();
        contractors1.setFirstname("Hari");
        contractors1.setLastname("Jay");
        //contractors1.getContractfrom("Jan-2022");
        contractors1.setContractto("Jan-2023");

        Contractors2 contractors2 = new Contractors2();
        contractors2.setFirstname("Godwin");
        contractors2.setLastname("Jones");
        //contractors2.getContractfrom("Jan-2022");
        contractors2.setContractto("Jan-2023");

        List<Contractors2> contractors = new ArrayList<>();
        contractors.add(contractors1);
        contractors.add(contractors2);

        obj.setContractors2(contractors);


        CompanyPFDetails2 companydetails = new CompanyPFDetails2();
        companydetails.setPfname("XYZ");
        companydetails.setPfcity("Lagos");
        companydetails.setPfyear("2022");
        companydetails.setNoofemployees(80);
        obj.setCompanyDetails2(companydetails);


        String getmapper = mapper.writeValueAsString(obj);
        System.out.println(getmapper);

    }
}
