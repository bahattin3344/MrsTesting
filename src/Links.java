import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Links  extends Parents{
public Links(){
    PageFactory.initElements(BaseDriver.driver, this);
}
    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement username;
    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement password;
    @FindBy(xpath = "//*[@id=\"loginButton\"]")
    public WebElement loginBtn;
    @FindBy(xpath = "//*[@id=\"Inpatient Ward\"]")
    public WebElement area;
    @FindBy(xpath = "//*[@id=\"error-message\"]")
    public WebElement loginWarning;
    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")
    public WebElement logOut;
    @FindBy(xpath = "//*[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]")
    public WebElement registerPatient;
    @FindBy(xpath = "/html/body/div/div[3]/form/section[1]/div/fieldset[1]/div[1]/p[1]/input")
    public WebElement givenName;
    @FindBy(xpath = "/html/body/div/div[3]/form/section[1]/div/fieldset[1]/div[1]/p[2]/input")
    public WebElement middleName;
    @FindBy(xpath = "/html/body/div/div[3]/form/section[1]/div/fieldset[1]/div[1]/p[3]/input")
    public WebElement familyName;
    @FindBy(xpath = "//*[@id=\"next-button\"]")
    public WebElement nextBtn;
    @FindBy(xpath = "//*[@id=\"gender-field\"]/option[1]")
    public WebElement gender;
    @FindBy(xpath = "//*[@id=\"birthdateDay-field\"]")
    public WebElement birthDay;
    @FindBy(xpath = "//*[@id=\"birthdateMonth-field\"]")
    public WebElement birthMonth;
    @FindBy(xpath = "//*[@id=\"birthdateYear-field\"]")
    public WebElement birthYear;
    @FindBy(xpath = "//*[@id=\"address1\"]")
    public WebElement address1;
    @FindBy(xpath = "/html/body/div/div[3]/form/section[2]/div/fieldset[2]/p/input")
    public WebElement phone;
    @FindBy(xpath = "//*[@id=\"submit\"]")
    public WebElement sumbit;
    @FindBy(css = "PersonName-middleName")
    public WebElement approval;
    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]")
    public WebElement admin;
    @FindBy(xpath = "//*[@id=\"user-account-menu\"]/li/a")
    public WebElement myAccount;
    @FindBy(xpath = "/html/body/header/nav/div[1]/a")
    public WebElement mainBack;
    @FindBy(xpath = "//*[@id=\"coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension\"]")
    public WebElement findPatient;
    @FindBy(xpath = "//*[@id=\"patient-search\"]")
    public WebElement findName;
    @FindBy(xpath = "//*[@id=\"patient-search-results-table\"]/tbody/tr/td[1]")
    public WebElement patientClick;
    @FindBy(xpath = "//*[@id=\"org.openmrs.module.coreapps.deletePatient\"]/div/div[2]")
    public WebElement patientDelete;
    @FindBy(xpath = "//*[@id=\"delete-reason\"]")
    public WebElement deleteReason;
    @FindBy(xpath = "//*[@id=\"delete-patient-creation-dialog\"]/div[2]/button[1]")
    public WebElement deleteConfirm;


}
