class VendingMachine {
  private int numCans;
  private int numTokens;

  public VendingMachine(){    //default constructor
    numCans = 10;
    numTokens = 0;
  }

  public VendingMachine(int cans){    //a parameterized constructor that initializes the vending machine with the given number of cans
    numCans = cans;
    numTokens = 0;
  }

  public void fillUp(int cans){
    numCans = numCans + cans;   //question 5
  }

  public void insertToken(){    //question 4
    System.out.println("Please Enter Your Token.");
    numTokens = numTokens + 1;
    System.out.println("Enjoy!");
    numCans = numCans - 1;

  }

  public int getCanCount(){    //question 6
    return numCans;
  }

  public int getTokenCount(){   //question 6
    return numTokens;
  }

  public static void main (String args[]){     //testing the class
    VendingMachine machine = new VendingMachine();
    machine.fillUp(10);
    machine.insertToken();
    machine.insertToken();
    System.out.print("Token count = ");
    System.out.println(machine.getTokenCount());
    System.out.print("Can count = ");
    System.out.println(machine.getCanCount());

  }
}
