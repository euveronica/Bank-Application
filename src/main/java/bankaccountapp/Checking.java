package bankaccountapp;

public class Checking extends Account{
    //Checking Account holders are assigned a Debit Card with 12-digit number
    //and 4-digit PIN
    //List the properties specific for Checking account

    private long debitCardNumber;
    private int debitCardPIN;

    //Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
//        System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
//        System.out.println("NEW Checking account");
        setDebitCardCharacteristics();

    }

    @Override
    public void setRate() {
       rate = getBaseRate()*0.15;
    }

    //List any methods specific to the Savings account
    private void setDebitCardCharacteristics(){
        debitCardNumber = (long) (Math.random() *Math.pow(10,12));
        debitCardPIN =(int) (Math.random()*Math.pow(10,4));
    }
    //List any methods specific to the checking account

    @Override
    public void showInfo(){

        System.out.println("ACCOUNT TYPE: Checking");
        super.showInfo();
        System.out.println("Your Checking account features:"
                +"\nDebit Card Number: " + debitCardNumber+
                "\nDebit Card PIN: " + debitCardPIN
        );
    }


}
