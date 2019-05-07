import Pages.AutomationPracticePage;
import org.junit.Before;
import org.junit.Test;

public class ToolsQaTest {

  private AutomationPracticePage automationPracticePage = new AutomationPracticePage();

  @Before
  public void openAutomationPracticeForm() {
    this.automationPracticePage.load();
  }

  @Test
  public void fillInPracticeForm() {
    this.automationPracticePage.fillForm("Jain", "Waldrip", "Female");
  }
}
