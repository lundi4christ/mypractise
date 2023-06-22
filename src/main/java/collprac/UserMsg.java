package collprac;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@JacksonXmlRootElement(localName = "UserMsg")
public class UserMsg {
    @JacksonXmlProperty(localName = "UserName")
    private String firstName;

    @JacksonXmlProperty(localName = "EmailAddress")
    private String email;

    @JacksonXmlProperty(localName = "Location")
    private String state;

    @JacksonXmlProperty(localName = "Address")
    private String addressOne;

    @JacksonXmlProperty(localName = "Age")
    private int age;

    // Getters and Setters (you can generate them using an IDE)
}
