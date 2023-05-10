package jsonBindings3;

import lombok.Data;

import java.util.List;

@Data
public class Obsini {

    private String bankName;
    private String bankBranch;
    private String countryName;
    List<String> countryCodes;
    List<String> bankCodes;
    List<Client> client;
    List<Operations> operations;
    ContactDetails contactdetails;
}
