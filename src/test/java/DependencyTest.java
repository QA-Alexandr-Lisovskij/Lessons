import data.StaticProvider;
import org.testng.annotations.Test;

public class DependencyTest {

    @Test
    public void abctest(){
        System.out.println("DependencyTest -> abctest");
    }
    @Test
    public void cbatest(){
        System.out.println("DependencyTest -> cbatest");
    }
    @Test(dataProvider = "dataForSum",dataProviderClass = StaticProvider.class)
    public void bactest(int a,int b,int expectedResult){
        System.out.println(a);
        System.out.println(b);
        System.out.println(expectedResult);
    }
}
