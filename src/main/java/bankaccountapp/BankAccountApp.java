package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {

        List<Account> accounts =  new LinkedList<>();


        String file = "C:\\Users\\Veronica\\Desktop\\JAVA\\PROIECTE\\proiecte GIT\\Bank Application\\bankData.csv";
        //read a CSV File then create new account based on the data
        List<String[]> newAccountHolder = utilities.CSV.read(file);

        for (String[] accountHolder : newAccountHolder) {

//            System.out.println("NEW ACCOUNT");
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
//            System.out.println(name+ " " + sSN + " " + accountType+ " " + "$ "+ initDeposit);

            if (accountType.equals("Savings")){

                accounts.add(new Savings(name, sSN, initDeposit));
            }
            else if (accountType.equals("Checking")) {

                accounts.add(new Checking(name, sSN, initDeposit));
            }
            else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }

        }

        for (Account acc : accounts ) {
            System.out.println("*************");
            acc.showInfo();


        }


        /*Checking chkacc1 = new Checking("Tom Wilson","254674112",1500);
        Savings savacc1 = new Savings("Rich Lone", "541222114",2500);
        chkacc1.showInfo();
//        chkacc1.deposit(5000);
//        chkacc1.withdraw(200);
//        chkacc1.transfer("Brokerage", 3000);
        chkacc1.compound();

        System.out.println("****************************");
        savacc1.showInfo();

//        savacc1.deposit(5000);
//        savacc1.withdraw(200);
//        savacc1.transfer("Brokerage", 3000);
        savacc1.compound();

*/
    }


}
