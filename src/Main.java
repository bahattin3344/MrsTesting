import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.security.Key;

public class Main extends BaseDriver {



    @Test(groups = {"Smoke Test"},dataProvider = "UserData")
    public void Us1_2(String username, String password){
        Links link=new Links();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        link.username.sendKeys(username);
        link.password.sendKeys(password);
        link.clickFunction(link.area);
        link.clickFunction(link.loginBtn);

    }
    @DataProvider
    public Object[][] UserData(){
        Object[][] data={
                {"ad4min","122334"},
                {"ad3min", "rustem5"},
                {"ad2min","zeynep111"},
                {"ad1min","serkan500"},
                {"ad5min","serkan500"},
                {"ad6min","serkan500"},
                {"admin","Admin123"}
        };

        return data;
    }
    @Test(groups = {"Smoke"})
    public void Us3(){
        Links link=new Links();
        MyFunction.wait(1);
        link.clickFunction(link.logOut);
        MyFunction.wait(1);
        link.sendKeys(link.username,"admin");
        link.sendKeys(link.password,"Admin123");
        link.clickFunction(link.area);
        link.clickFunction(link.loginBtn);
    }
    @Test(groups = {"Regression"})
    public void Us4_5(){
        Links link=new Links();
        link.clickFunction(link.registerPatient);
        link.givenName.sendKeys("deniz",Keys.ENTER);
        link.middleName.sendKeys("aydın",Keys.ENTER);
        link.familyName.sendKeys("denizdeniz", Keys.ENTER);
        link.nextBtn.click();
        link.gender.click();
        link.nextBtn.click();
        link.birthDay.sendKeys("15");
        Select monthSelection=new Select(link.birthMonth);
        monthSelection.selectByIndex(1);
        link.birthYear.sendKeys("1998");
        link.nextBtn.click();
        link.address1.sendKeys("İstanbul");
        link.nextBtn.click();
        link.phone.sendKeys("35353535");
        link.nextBtn.click();
        link.nextBtn.click();
        link.sumbit.click();
        link.admin.click();
        link.myAccount.click();
        link.mainBack.click();
    }
    @Test
    public void Us6_7(){
        Links link=new Links();
        link.findPatient.click();
        link.findName.sendKeys("deniz");
        link.patientClick.click();
        link.patientDelete.click();
        link.deleteReason.sendKeys("YES");
        link.deleteConfirm.click();
    }



}


