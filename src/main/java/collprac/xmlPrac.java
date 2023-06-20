package collprac;

public class xmlPrac {

    public static void main(String[] args) throws Exception {
        String json = "{\"firstname\":\"Mary\",\"addressone\":\"Isolo Lagos\",\"state\":\"Lagos\",\"Age\":30,\"email\":\"mary@gmail.com\"}";

        ObjectMapper objectMapper = new ObjectMapper();
        UserMsg userMsg = objectMapper.readValue(json, UserMsg.class);

        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(userMsg);

        System.out.println(xml);
    }
}
