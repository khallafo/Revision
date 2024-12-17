package Test;

import org.example.HomePage;

import org.example.LoginPage;
import org.example.AUserRegisterationPage;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AUserRegistrationTest extends TestBase {
    HomePage home;
    AUserRegisterationPage register;
    LoginPage Login;
    @DataProvider(name = "testData")
    public static Object[][] userdata()
    {

        return new Object[][] {
                {"mahmoud" ,"khallaf","lofa288@gmail.com","123456"},
                {"ahmed" ,"khallaf","lofa277@gmail.com","1234567"}
        };
    }

    @Test(priority = 1,dataProvider = "testData")
    public void UserCanRegisterSuccessfully(String fname ,String lname,String email,
    String password) throws InterruptedException {
        home = new HomePage(driver);
        home.openRegistrationPage();
        register = new AUserRegisterationPage(driver);
        register.userRegister(fname,lname,email,password);
      Assert.assertTrue(register.registerDone.getText().contains("Your registration completed"));
    }



    }

