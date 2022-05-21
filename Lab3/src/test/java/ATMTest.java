import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    ATM a;
    Deposit d;
    Withdrawal w;
    String s;
    @BeforeEach
    public void init() {
        a = new ATM();
        d = new Deposit();
        w = new Withdrawal();
    }
    class CollectMoney {
        int insert(int x){
            if(x>0)
                return x;
            else
                return 0;
        }
    }
    @Test
    public void FirstStub(){
        CollectMoney y = new CollectMoney();
        a.CompleteTransaction(1, y.insert(5000));
        assertEquals(a.balance,5000.0);
    }
    @Test
    public void SecondStub(){
        CollectMoney y = new CollectMoney();
        double z =w.Withdrawal(2000,y.insert(5000));
        assertEquals(z,3000.0);
    }
    @Test
    public void ThirdStub(){
        CollectMoney y = new CollectMoney();
        double z = d.deposit(2000,y.insert(5000));
        assertEquals(z,7000.0);
    }
    @AfterEach
    public void clean(){
        a =null ;
    }
}



