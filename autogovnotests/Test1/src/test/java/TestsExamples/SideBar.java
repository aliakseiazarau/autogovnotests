package TestsExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SideBar {
    private WebDriver webDriver;

    public SideBar(WebDriver driver){
        webDriver = driver;
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "//span[@class='text-type__large']")
    WebElement FontSizeLarge;
    @FindBy (xpath = "//span[@class='text-type__medium']")
    WebElement FontSizeMedium;
    @FindBy (xpath = "//span[@class='text-type__small']")
    WebElement FontSizeSmall;


    @FindBy (xpath = "//*[@class='sidebar-element-wrapper' and contains(. , 'Font Color')]//div[@class='drop-color-picker-wrap']")
    WebElement FontColorDropDown;
    @FindBy (xpath = "//*[@class='sidebar-element-wrapper' and contains(. , 'Input font Color')]//a[@href='#']")
    WebElement TextAreaFontColorDropDown;
    @FindBy (xpath = "//*[@class='sidebar-element-wrapper' and contains(. , 'Text Color')]//div[@class='drop-color-picker-wrap']")
    WebElement ParagraphFontColorDropDown;

    @FindBy (xpath = "//*[@class='sidebar-img-soc-title' and contains(.,'DROPDOWN MENUS')]/following-sibling::*[@class='sidebarEitem ']//*[@class='colorPicker']/i")
    WebElement DropDownAllColorFont;

    @FindBy (xpath = "//nav[@class='heroSidebarMenu']//div[@class='sidebar-title']//div[@class='sidebar-title__inner']//div[contains(@class,'sidebar-popup-menu')]//a[@href='#']//i[@class='icon-dot-3']")
    WebElement ThreeDotsSections;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Preview Page')]")
    WebElement PreviewPageSections;




    @FindBy (xpath = "//*[@class='sidebar-element-wrapper' and contains(. , 'Input field border color')]//div[@class='drop-color-picker-wrap']")
    WebElement InputFieldBorder;

    @FindBy (xpath = "//a[@href='#'][text()='Adjust Text Style']")
    WebElement AjustFontStyle;
    @FindBy (xpath = "//div[@class='globalLock']")
    WebElement GlobalLock;
    @FindBy (xpath = "//div[@class='animationSidebar']//div[@class='pageMenu__item']//span[@class='pageMenu__date']")
    WebElement FirstPage;
    @FindBy (xpath = "//html//div[@class='colorPicker']//div[@class='drop-color-picker-wrap']")
    WebElement SectionCustomColor;
    @FindBy (xpath = "//div[@class='active-item-icon-input__child-item']")
    WebElement SecondColumn;
    @FindBy (xpath = "//button[@class='button-pallete'][contains(text(),'Save')]")
    WebElement Save;
    @FindBy (xpath = "//i[@class='icon-align-left']")
    WebElement AlignLeft;
    @FindBy (xpath = "//li[contains(@id,'navItem')]")
    WebElement NavItem;
    @FindBy (xpath = "//div[@class='sidebar-properties-column__section-column']")
    WebElement SectionSetup;
    @FindBy (xpath = "//div[@class='button accordionButton'][(text() ='Column Setup')]")
    WebElement ColumnSetup;
    @FindBy (xpath = "//i[@class='icon-left-open']")
    WebElement BackArrow;
    @FindBy (xpath = "//i[@class='icon-sidebar-menu-settings']")
    WebElement Settings;
    @FindBy (xpath = "//button[@class='sidebar-tabs__tab active']")
    WebElement FontColorNormal;

    @FindBy (xpath = "//html//div[@class='sidebarElement sidebarElement__field_group_switch']//i[1]")
    WebElement Color1;
    @FindBy (xpath = "//html//div[@class='sidebarElement sidebarElement__field_group_switch']//i[2]")
    WebElement Color2;
    @FindBy (xpath = "//html//div[@class='sidebarElement sidebarElement__field_group_switch']//i[3]")
    WebElement Color3;
    @FindBy (xpath = "//html//div[@class='sidebarElement sidebarElement__field_group_switch']//i[4]")
    WebElement Color4;
    @FindBy (xpath = "//html//div[@class='sidebarElement sidebarElement__field_group_switch']//i[5]")
    WebElement Color5;
    @FindBy (xpath = "//html//div[@class='sidebarElement sidebarElement__field_group_switch']//i[6]")
    WebElement Color6;
    @FindBy (xpath = "//html//div[@class='sidebarElement sidebarElement__field_group_switch']//i[7]")
    WebElement Color7;


    @FindBy (xpath = "//div[@class='header-name-action header-name-action-top header-name-action_active']")
    WebElement CustomColor;

    @FindBy (xpath = "//html//div[@class='sidebarElement sidebarElement__colorpicker']//i[1]")
    WebElement HeaderSectionColor1;
    @FindBy (xpath = "//html//div[@class='sidebarElement sidebarElement__colorpicker']//i[2]")
    WebElement HeaderSectionColor2;
    @FindBy (xpath = "//html//div[@class='sidebarElement sidebarElement__colorpicker']//i[3]")
    WebElement HeaderSectionColor3;
    @FindBy (xpath = "//html//div[@class='sidebarElement sidebarElement__colorpicker']//i[4]")
    WebElement HeaderSectionColor4;
    @FindBy (xpath = "//html//div[@class='sidebarElement sidebarElement__colorpicker']//i[5]")
    WebElement HeaderSectionColor5;
    @FindBy (xpath = "//html//div[@class='sidebarElement sidebarElement__colorpicker']//i[6]")
    WebElement HeaderSectionColor6;
    @FindBy (xpath = "//html//div[@class='sidebarElement sidebarElement__colorpicker']//i[7]")
    WebElement HeaderSectionColor7;



    @FindBy (xpath = "//html//div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/i[2]")
    WebElement TextAreaFontColor1;


    @FindBy (xpath = "//html//div[@class='sidebar-properties-column__content-column']//div[@class='sidebarElement sidebarElement__colorpicker']//i[1]")
    WebElement ColumnColor1;
    @FindBy (xpath = "//html//div[@class='sidebar-properties-column__content-column']//div[@class='sidebarElement sidebarElement__colorpicker']//i[2]")
    WebElement ColumnColor2;
    @FindBy (xpath = "//html//div[@class='sidebar-properties-column__content-column']//div[@class='sidebarElement sidebarElement__colorpicker']//i[3]")
    WebElement ColumnColor3;
    @FindBy (xpath = "//html//div[@class='sidebar-properties-column__content-column']//div[@class='sidebarElement sidebarElement__colorpicker']//i[4]")
    WebElement ColumnColor4;
    @FindBy (xpath = "//html//div[@class='sidebar-properties-column__content-column']//div[@class='sidebarElement sidebarElement__colorpicker']//i[5]")
    WebElement ColumnColor5;
    @FindBy (xpath = "//html//div[@class='sidebar-properties-column__content-column']//div[@class='sidebarElement sidebarElement__colorpicker']//i[6]")
    WebElement ColumnColor6;
    @FindBy (xpath = "//html//div[@class='sidebar-properties-column__content-column']//div[@class='sidebarElement sidebarElement__colorpicker']//i[7]")
    WebElement ColumnColor7;


    /*********** PREBUILTS ***********/
    @FindBy (xpath = "//button[@class='sidebar-main-menu__icon']//i[@class='icon-sidebar-menu-modules']")
    WebElement Prebuilts;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Navigation Headers')]")
    WebElement NavigationHeaders;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Banners')]")
    WebElement Banners;
    @FindBy (xpath = "//html//li[3]/a[1]")
    WebElement Text;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Text & Image')]")
    WebElement TextAndImage;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'CTA')]")
    WebElement CTA;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Testimonials')]")
    WebElement Testimonais;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Blog')]")
    WebElement Blog;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Footer')]")
    WebElement Footer;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'My Custom Prebuilts')]")
    WebElement MyCustomPrebuilts;

    /*********** SETTINGS ***********/

    @FindBy (xpath = "//a[@href='#'][contains(text(),'Page settings')]")
    WebElement PageSettings;
    @FindBy (xpath = "//ul[@class='pageMenu page-menu-dots']//li[@class='active pageMenu__list-item']")
    WebElement Page;
    @FindBy (xpath = "//h4[@class='title'][contains(text(),'Page status')]")
    WebElement AssertForPageSettings;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Site Settings')]")
    WebElement SiteSettings;
    @FindBy (xpath = "//h3[@class='group-title'][contains(text(),'Basic Details')]")
    WebElement AssertForSiteSettings;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Blog Settings')]")
    WebElement BlogSettings;
    @FindBy (xpath = "//div[@class='sidebar-element-wrapper']//button[@class='hero-btn-add-new']")
    WebElement AssertForBlogSettings;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Style')]")
    WebElement Style;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Fonts')]")
    WebElement Fonts;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Buttons & Fields')]")
    WebElement ButtondAndFields;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Colors')]")
    WebElement Colors;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Custom CSS')]")
    WebElement CustomCSS;
    @FindBy (xpath = "//textarea[@class='sidebarTextarea custom-css-settings__textarea']")
    WebElement AssertForCustomCSS;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Images & Media')]")
    WebElement ImagesAndMedia;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Your Images')]")
    WebElement AssertForImagesAndMedia;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Social Accounts')]")
    WebElement SocialAccounts;
    @FindBy (xpath = "//h4[@class='title'][contains(text(),'Twitter')]")
    WebElement AssertForSocialAccounts;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Integrations')]")
    WebElement Integrations;
    @FindBy (xpath = "//div[@class='sidebar-integration']//button[@class='hero-btn-add-new']")
    WebElement AssertForIntegrations;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Domains')]")
    WebElement Domains;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'New Domain')]")
    WebElement NewDomains;
    @FindBy (xpath = "//div[@class='fieldLabelElement inputDomainName']//input[@type='text']")
    WebElement AssertForDomains;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'My Account Details')]")
    WebElement MyAccountDetals;
    @FindBy (xpath = "//h4[@class='sidebar-full-add-list__top-label']")
    WebElement AssertForMyAccountDetals;
    @FindBy (xpath = "//a[@href='#'][contains(text(),'Preview Page')]")
    WebElement PreviewPage;

    @FindBy (xpath = "//nav[@class='heroSidebarMenu']//div[@class='sidebar-title']//div[@class='sidebar-title__inner']//a[@href='#']//i[@class='icon-left-open']")
    WebElement Back;
}

