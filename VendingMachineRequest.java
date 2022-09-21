public class VendingMachineRequest {
    public Guitars guitar;
    public BillsStack enteredBills;
  
    public VendingMachineRequest(int selectedGuitar, int... enteredBills){        this.guitar = Guitars.valueOf(selectedGuitar);
      this.enteredBills = new BillsStack(enteredBills);
    }
  }