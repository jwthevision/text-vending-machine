public interface VendingMachineInterface {

    void displayGuitars();
  
    void selectGuitars(int guitar);
  
    void displayEnterBillsMessage();
  
    void enterBills(int... bills);
  
    void displayChangeMessage();
  }