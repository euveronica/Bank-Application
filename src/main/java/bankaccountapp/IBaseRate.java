package bankaccountapp;


public interface IBaseRate {
//    Both accounts will use an interface that determines the base interest rate:
    //---- Saving accounts will use .25 points less that the base rate
    //---- Checking accounts will use 15% of the base rate

    //Write a method that returns the base rate

    default double getBaseRate(){
        return 2.5;
    }





}
