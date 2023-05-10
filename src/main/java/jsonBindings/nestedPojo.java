package jsonBindings;

import lombok.Data;

import java.util.List;

@Data
public class nestedPojo {

    private String companyName;
    private String companyHOCity;
    private String companyCEO;
    private List<String> supportedSalaryBanks;
    private List<Integer> pincodesOfCityOffice;
    private List<Employees> employees;
    private List<Contractors> contractors;
    CompanyPFDeails companyPFDeails;


}
