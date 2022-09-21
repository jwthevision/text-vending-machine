public enum Bills {
    ONE_DOLLARS(1), TEN_DOLLARS(10), TWENTY_DOLLARS(20), FIFTY_DOLLARS(50), HUNDRED_DOLLARS(100);
  
    private int value;
  
    Bills(int value){
          this.value = value;
    }
  
    public int getValue(){
        return this.value;
    }
  
     public static int[] parseBills(String bills){
          String[] numberBillsInText = bills.split(",");
          int[] result = new int[numberBillsInText.length];
          for(int index = 0;index < numberBillsInText.length;index++){
              result[index] = Integer.parseInt(numberBillsInText[index]);
          }
          return result;
      }
  }