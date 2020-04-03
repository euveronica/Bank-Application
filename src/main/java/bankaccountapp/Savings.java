package bankaccountapp;

public class Savings extends Account {


    //Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number
    // and accessed with 4 digit code
    //List the properties specific for Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //Constructor to initialize Savings account properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
//        System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
//        System.out.println("NEW Savings account: ");
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate()-.25;
    }

    //List any methods specific to the Savings account
    private void   setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random()*Math.pow(10,3));
        safetyDepositBoxKey =(int) (Math.random()*Math.pow(10,4));
    }

    @Override
    public void showInfo(){

        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println("Your saving account features:"
                        +"\nSafety Deposit Box ID: " + safetyDepositBoxID+
                          "\nAccess key: " + safetyDepositBoxKey);

    }

}
