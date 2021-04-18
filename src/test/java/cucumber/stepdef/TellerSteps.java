package cucumber.stepdef;

import domainHelper.domainHelper;
import io.cucumber.java.en.When;

public class TellerSteps {
    private final domainHelper domainhelper;

    public TellerSteps(domainHelper domainhelper){
        this.domainhelper=domainhelper;
    }
    @When("I request ${int}")
    public void iRequest$(int requestAmount) {
        domainhelper.getTeller().withdrawCash(domainhelper.getAccount(),requestAmount);
    }
}
