package testNG_examples;
import org.testng.annotations.Test;
public class TestNGexamples {
	@Test
	public void login(){
	System.out.println("login completed");
	}
	@Test(dependsOnMethods="login")
	public void logout(){
	System.out.println("Logout completed");
	}

}
