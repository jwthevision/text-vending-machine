import java.util.Scanner;

public class Main {
  
  static void checkTotal(int total) {
        //if (total >= -100) {
        //  throw new ArithmeticException("Please pay the correct balance to receive your guitar. ");
       }
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
   
    VendingMachineInterface machineInterface = new TextVendingMachineInterface();

    machineInterface.displayGuitars();

    String selectedGuitar = scanner.nextLine();
    machineInterface.selectGuitars(Integer.parseInt(selectedGuitar));

    machineInterface.displayEnterBillsMessage();

    String userEnteredBills = scanner.nextLine();
    int[] enteredBills = Bills.parseBills(userEnteredBills);
    machineInterface.enterBills(enteredBills);

    checkTotal(-100);

    machineInterface.displayChangeMessage();

    //checkTotal(-20);

    scanner.close();
    
  }
}