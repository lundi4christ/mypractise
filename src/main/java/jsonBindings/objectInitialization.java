package jsonBindings;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.security.auth.login.Configuration;
import java.util.ArrayList;
import java.util.List;

public class objectInitialization {

    public static void main (String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        nestedPojo nestedpojo = new nestedPojo();
        nestedpojo.setCompanyCEO("MSE");
        nestedpojo.setCompanyHOCity("Bana");
        nestedpojo.setCompanyName("USL");

        List<String> supportSalary = new ArrayList<>();
        supportSalary.add("HDFC");
        supportSalary.add("ICICI");
        supportSalary.add("AXIS");
        nestedpojo.setSupportedSalaryBanks(supportSalary);

        List<Integer> pinCodes = new ArrayList<>();
        pinCodes.add(2203020);
        pinCodes.add(203020);
        pinCodes.add(2030203);
        nestedpojo.setPincodesOfCityOffice(pinCodes);

        Employees na1 = new Employees();
        na1.setAge(40);
        na1.setFirstName("Wisdom");
        na1.setGender("Male");
        na1.setLastName("Understanding");
        na1.setMarried("Married");
        //na1.setSalary(600000);

        Employees na2 = new Employees();
        na2.setAge(40);
        na2.setFirstName("Wisdom");
        na2.setGender("Male");
        na2.setLastName("Understanding");
        na2.setMarried("Married");

        List<Employees> employees = new ArrayList<>();
        employees.add(na1);
        employees.add(na2);
        nestedpojo.setEmployees(employees);

        Contractors contractors = new Contractors();
        contractors.setContractFrom("alsoeowoe");
        contractors.setContractTo("alsodlelw");
        contractors.setFirstName("Mark");
        contractors.setLastName("Luke");

        Contractors contractors2 = new Contractors();
        contractors2.setContractFrom("alsoeowoe");
        contractors2.setContractTo("alsodlelw");
        contractors2.setFirstName("Mark");
        contractors2.setLastName("Luke");

        List<Contractors> cont = new ArrayList<>();
        cont.add(contractors);
        cont.add(contractors2);

        nestedpojo.setContractors(cont);

        CompanyPFDeails company = new CompanyPFDeails();
        company.setNoOfEmployees("20");
        company.setPfCity("Lagos");
        company.setPfName("Lagos");
        company.setPfYear("2002");

        nestedpojo.setCompanyPFDeails(company);

        String getjson = mapper.writeValueAsString(nestedpojo);

        System.out.println(getjson);
    }
}
