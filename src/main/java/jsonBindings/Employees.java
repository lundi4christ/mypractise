package jsonBindings;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Employees {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private BigDecimal salary;
    private String married;
}
