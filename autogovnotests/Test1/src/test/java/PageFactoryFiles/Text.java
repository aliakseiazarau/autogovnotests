package PageFactoryFiles;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.support.PageFactory;
        import org.openqa.selenium.support.ui.WebDriverWait;

public class Text {
    public WebDriver webDriver;


    public Text (WebDriver driver) {
        webDriver = driver;
        WebDriverWait wait;
        PageFactory.initElements(webDriver, this);
    }



    //Site address

    public static String site = "https://app.heroicnow.com";



    //Editor loading

    public static String siteLoading = "Powering Up ";



    //Create Account (heroicnow.com)

    public static String createAccountPageHeader = "BE HEROIC";



    //Registration page

    public static String createAccount = "https://heroicnow.com/step1.php?id=1&site=46";

    public static String emptyNames = "";

    public static String firstNameEmpty = "PLEASE ENTER YOUR FIRSTNAME";

    public static String firstName = "Aliaksei";

    public static String lastNameEmpty = "PLEASE ENTER YOUR LASTNAME";

    public static String lastName = "Azarau";

    public static String alertInvalid = "aria-invalid";

    public static String alertInvalidTrue = "true";

    public static String alertInvalidFalse = "false";

    public static String firstNameOverMax = "Aliaksei1717171717171717171717171717";

    public static String firstNameSpecial = "`~!@#$%^&*()-_=+[]}{'\"\\|/?.,<>";

    public static String lastNameOverMax = "Azarau1717171717171717171717171717";

    public static String lastNameSpecial = "`~!@#$%^&*()-_=+[]}{'\"\\|/?.,<>";

    public static String nameOnlySpaces = "     ";

    public static String emailEmptyAlert = "PLEASE ENTER YOUR EMAIL ADDRESS.";

    public static String emailExists = "aliaksei.azarau@qweeco.com";

    public static String emailExistsAlert = "emailExists";

    public static String emailValid = "aliaksei.azarau@autotest.com";

    public static String emailNoDomain = "aliaksei.azarau@autotest";

    public static String emailInvalidAlert = "PLEASE ENTER A VALID EMAIL ADDRESS.";

    public static String emailGlobalSpecial = "aliaksei@`~!@#$%^&*()-_=+[]}{'\"\\|/?.,<>.com";

    public static String emailLocalSpecial = "\"(),:;<>@[\\]@gmail.com";

    public static String emailGlobalOverMax = "aliakseiazarau@aaabbbcccdddeeefffggghhhiiijjjaaabbbcccdddeeefffggghhhiiijjjkkkk.com";

    public static String emailGlobalMax = "aliakseiazarau@aaabbbcccdddeeefffggghhhiiijjjaaabbbcccdddeeefffggghhhiiijjjkkk.com";

    public static String emailLocalOverMax = "aaabbbcccdddeeefffggghhhiiijjj@aaabbbcccdddeeefffggghhhiiijjj.com";

    public static String passEmptyAlert = "PLEASE PROVIDE A PASSWORD";

    public static String passLessMin = "1234";

    public static String passLessMinAlert = "YOUR PASSWORD MUST BE AT LEAST 5 CHARACTERS LONG";

    public static String passOverMax = "111bbbcccdddeeefffggghhhi";

    public static String passOverMaxAlert = "PLEASE ENTER NO MORE THAN 24 CHARACTERS.";

    public static String passMax = "111bbbcccdddeeefffggghhh";

    public static String passMin = "123ab";

    public static String passValidSpec = "1aB~!`@#$%^&*(-_=+[}/|<";

    public static String termOfUseAlert = "PLEASE ACCEPT OUR TERMS OF SERVICE";

    public static String validNames = "Autotest";

    public static String validMail = "autotest@autotest1.com";



    // Login page

    public static String validPass = "111bbbcccdddeeefffggghhh";

    public static String invalidPass = "12345";

    public static String validLogin = "aliakseiazarautest@gmail.com";

    public static String invalidLogin = "aliakseiazarau546345345346312@gmail.com";

    public static String blankField = "This field may not be blank.";

    public static String incorrectLogin = "Oops. Incorrect email";

    public static String incorrectPass = "Oops. Incorrect password";

    public static String passReset = "Hey Superhero! We just emailed you a link to reset your password. You should receive that immediately. Of course, make sure to check your spam folder if the email doesn't arrive.";

    public static String invalidPassReset = "Sorry - we don't have any accounts for this email address. Try another?";




    //Profile Settings

    public static String nameProfile = "Aliaksei17";

    public static String phoneProfile = "171717";

    public static String emailProfile = "aliaksei@test.com";

    public static String emailEmptyError = "This field may not be blank.";

    public static String emailExistsError = "user with this email address already exists.";

    public static String emailInvalidError ="Enter a valid email address.";

    public static String currentPassWrong = "999999";

    public static String currentPassWrongAlert = "Current Password is wrong!";

    public static String currentPassEmptyAlert = "Current Password field is empty!";

    public static String newPassEmptyAlert = "New Password field is empty!";

    public static String repeatNewPassEmptyAlert = "Repeat New Password field is empty!";

    public static String repeatNewPassWrongAlert = "Repeat New Password is wrong!";



}
