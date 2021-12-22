import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {

    @Parameters({"login-value","psw-value"})
    @Test
    public void paramTest( String login, String psw){
        System.out.println("login is: "+login);
        System.out.println("password is: "+psw);
    }
}
