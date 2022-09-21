public interface Calculator {

    int calculateTotal(BillsStack enteredBills);
    BillsStack calculateChange(int amountMoneyToReturn);
  
  }