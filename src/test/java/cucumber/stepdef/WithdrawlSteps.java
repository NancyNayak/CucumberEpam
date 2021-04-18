package cucumber.stepdef;

import cucumber.domain.modules.CashSlot;
import cucumber.domain.modules.Teller;
import domainHelper.domainHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WithdrawlSteps {
    private domainHelper domainhelper;
    public WithdrawlSteps(domainHelper domainhelper){
        this.domainhelper=domainhelper;
    }



    @Then("${int} should be dispensed")
    public void $ShouldBeDispensed(int dispensedAmount) {
        Assert.assertEquals(dispensedAmount,domainhelper.getCashSlot().getContents());
    }

}
