package Pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;

public class AutomationPracticePage {

  private Integer timeout = 2000;
  private SelenideElement firstNameField = $("input[name=firstname]");
  private SelenideElement lastNameField = $("input[name=lastname]");
  private SelenideElement maleButton = $("sex-0");
  private SelenideElement femaleButton = $("#sex-1");
  private SelenideElement manualTesterButton = $("#profession-0");
  private SelenideElement automationTesterButton = $("#profession-1");



  public void load() {
    open("https://www.toolsqa.com/automation-practice-form/");
  }

  public void fillForm(String firstName, String lastName, String sex) {
    this.firstNameField
        .setValue(firstName)
        .waitUntil(value(firstName), this.timeout);
    this.lastNameField
        .setValue(lastName)
        .waitUntil(value(lastName), this.timeout);

    if(sex.toLowerCase().equals("female")) {
      this.femaleButton.setSelected(true);
      this.femaleButton.waitUntil(selected, this.timeout);
    } else {
      this.maleButton.setSelected(true);
      this.maleButton.waitUntil(selected, this.timeout);
    }

    this.manualTesterButton.setSelected(true);
    this.automationTesterButton.setSelected(true);
    this.manualTesterButton.waitUntil(selected, this.timeout);
    this.automationTesterButton.waitUntil(selected, this.timeout);
  }

}
