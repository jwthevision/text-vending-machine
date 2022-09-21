public class SimpleVendingMachineController implements VendingMachineController {

    private Calculator calculator = new SimpleCalculator();

    @Override
    public BillsStack calculateChange(VendingMachineRequest request) {
        int total = calculator.calculateTotal(request.enteredBills);
        int totalChange = total - request.guitar.getPrice();
        return calculator.calculateChange(totalChange);
    }
}