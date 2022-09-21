public enum Guitars {
    SQUIER(1,10), IBANEZ(2,20), FENDER(3,20), PRS_CUSTOM(4,50), GIBSON(5,100), EMPTY(0,0);
  
    private int selectionNumber;
    private int price;
  
    Guitars(int selectionNumber, int price){
        this.selectionNumber = selectionNumber;
        this.price = price;
    }
  
    public int getSelectionNumber(){
        return selectionNumber;
    }
  
    public int getPrice(){
        return this.price;
    }
  
    public static Guitars valueOf(int numberSelection){
        for(Guitars guitar: Guitars.values()){
            if(numberSelection == guitar.getSelectionNumber()){
                return guitar;
            }
        }
        return EMPTY;
    }
  }