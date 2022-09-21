public class BillsStack {
    public int number1DollarBills;
    public int number10DollarBills;
    public int number20DollarBills;
    public int number50DollarBills;
    public int number100DollarBills;
  
    public BillsStack(int... enteredBills) {
        this.number1DollarBills = enteredBills[0];
        this.number10DollarBills = enteredBills[1];
        this.number20DollarBills = enteredBills[2];
        this.number50DollarBills = enteredBills[3];
        this.number100DollarBills = enteredBills[4];
    }
  
    public int getTotal(){
          int total = 0;
          total = total+this.number1DollarBills*Bills.ONE_DOLLARS.getValue();
      total = total+this.number10DollarBills*Bills.TEN_DOLLARS.getValue();
      total = total+this.number20DollarBills*Bills.TWENTY_DOLLARS.getValue();
      total = total+this.number50DollarBills*Bills.FIFTY_DOLLARS.getValue();
      total = total+this.number100DollarBills*Bills.HUNDRED_DOLLARS.getValue();
      return total;
    }
  }