package cucumber.domain.modules;

public class CashSlot {
    private int content;
    public int getContents(){
        return content;
    }

    public void dispense(int requestAmount) {
        content=requestAmount;
    }
}
