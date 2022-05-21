 class Withdrawal {
    double Withdrawal(double withdraw, double balance){
        if(balance >= withdraw)
            return balance - withdraw;
        else
            return balance;
    }
}
 class Deposit
{
    public double deposit(double deposit, double balance){
        if(deposit<=0)
            return balance;
        balance = balance + deposit;
        return balance;
    }
}


public class ATM {
    double balance = 0;
    Withdrawal w = new Withdrawal();
    Deposit d = new Deposit();
    public double CompleteTransaction(int x, double amount) {
        switch(x)
        {
            case 1:
                this.balance =w.Withdrawal(amount,balance);
            case 2:
                this.balance = d.deposit(amount,balance);


        }
        return balance;
    }




    public static void main(String args[] ) {
    }
}



