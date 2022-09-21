public class SimpleCalculator implements Calculator{

    @Override
    public int calculateTotal(BillsStack enteredBills) {
        return enteredBills.getTotal();
    }

    @Override
    public BillsStack calculateChange(int amountMoneyToReturn) {
        BillsStack change = new BillsStack(new int[5]);
        int remainingAmount = amountMoneyToReturn;
        change.number100DollarBills = remainingAmount / Bills.HUNDRED_DOLLARS.getValue();
        remainingAmount = remainingAmount % Bills.HUNDRED_DOLLARS.getValue();

        change.number50DollarBills = remainingAmount / Bills.FIFTY_DOLLARS.getValue();
        remainingAmount = remainingAmount % Bills.FIFTY_DOLLARS.getValue();

        change.number20DollarBills = remainingAmount / Bills.TWENTY_DOLLARS.getValue();
        remainingAmount = remainingAmount % Bills.TWENTY_DOLLARS.getValue();

        change.number10DollarBills = remainingAmount / Bills.TEN_DOLLARS.getValue();
        remainingAmount = remainingAmount % Bills.TEN_DOLLARS.getValue();

        change.number1DollarBills = remainingAmount / Bills.ONE_DOLLARS.getValue();


        return change;
    }
}