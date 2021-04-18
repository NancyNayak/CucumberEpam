package domainHelper;

import cucumber.domain.modules.Account;
import cucumber.domain.modules.CashSlot;
import cucumber.domain.modules.Teller;

public class domainHelper {
    private CashSlot cashslot;
    private Account account;
    private Teller teller;

    public Account getAccount() {
        if (account == null) {

            account = new Account();
        }
        return account;
    }

    public CashSlot getCashSlot() {
        if (cashslot == null) {

            cashslot = new CashSlot();
        }
        return cashslot;
    }

    public Teller getTeller() {
        if (teller == null) {

            teller = new Teller(getCashSlot());
        }
        return teller;

    }
}