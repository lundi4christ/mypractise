package collarrayprac;

import lombok.Data;

@Data
public class employee {

    private String firstname;
    private String lastname;
    private int age;
    private String email;

    public employee(){

    }

    public employee(String firstname, String lastname, int age, String email){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.email=email;
    }

}
