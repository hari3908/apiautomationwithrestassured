package restapitest;

public class Payloads {

    public  static  String getUsersPayload(String name,String email,String pass){
        return "{\n" +
                "  \"name\": \""+name+"\"," +
                "  \"email\": \""+email+"\"," +
                "  \"password\": \""+pass+"\",\n" +
                "  \"avatar\": \"https://picsum.photos/800\"\n" +
                "}";
    }
}
