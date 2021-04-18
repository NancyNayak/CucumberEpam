package cucumber.stepdef;

import domainHelper.domainHelper;
import io.cucumber.java.en.Given;

public class AccountSteps{
    private final domainHelper domainhelper;

    public AccountSteps(domainHelper domainhelper){
         this.domainhelper=domainhelper;
    }
        @Given("I have a balance of ${int} in my account.")
        public void iHaveABalanceOf$InMyAccount(int amount ) {

            domainhelper.getAccount().deposite(amount);
        }
}
