public class TextVendingMachineInterface implements VendingMachineInterface {

    private VendingMachineController controller = new SimpleVendingMachineController();
    private int selectedGuitar;
    private BillsStack change;


    @Override
  public void displayGuitars() {
      System.out.println("*********************************************");
    System.out.println("    WELCOME TO JW'S GUITAR VENDING MACHINE    ");
    System.out.println("*********************************************");
    System.out.println("            Guitars available:            ");
    System.out.println("                                          ");
    for(Guitars guitar: Guitars.values()){
        if(!Guitars.EMPTY.equals(guitar)) {
            System.out.println("    " + guitar.getSelectionNumber() + "  " + guitar.name() + " - Price: " + guitar.getPrice() + "    ");
        }
    }
    System.out.println("                                          ");
    System.out.println(" Please select your Guitar: ");

    
  }

  @Override
  public void selectGuitars(int guitar) {
      this.selectedGuitar = guitar;
  }

  @Override
  public void displayEnterBillsMessage() {
      System.out.println(" Please enter bills as follows: ");
      System.out.println(" num of 1 dollar bills,num of 10 dollar bills,num of 20 dollar bills,num of 50 dollar bills,num of 100 dollar bills  ");
      System.out.println("                                ");
      System.out.println(" Example: If you would like to enter 2 10 dollar bills: 0,2,0,0,0");
      System.out.println("Please enter bills:");
    
  }

  @Override
  public void enterBills(int...bills) {
      VendingMachineRequest request = new VendingMachineRequest(selectedGuitar, bills);
      change = controller.calculateChange(request);
        
        }

  @Override
  public void displayChangeMessage() {
    
      System.out.println("                                    ");
      System.out.println("Your change is : "+ change.getTotal()+" dollars splitted as follows: ");
      System.out.println("    100 Dollar Bills: "+ change.number100DollarBills);
      System.out.println("    50 Dollar Bills: "+ change.number50DollarBills);
      System.out.println("    20 Dollar Bills: "+ change.number20DollarBills);
      System.out.println("    10 Dollar Bills: "+ change.number10DollarBills);
      System.out.println("    1 Dollar Bills: "+ change.number1DollarBills);

    System.out.println("Thanks for using JW's Guitar Vending Machine");
    System.out.println("Have a Rockin' Day!");
    
  }
  
}