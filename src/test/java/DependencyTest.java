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
    @Test
    public void bactest(){
        System.out.println("DependencyTest -> bactest");
    }
}
