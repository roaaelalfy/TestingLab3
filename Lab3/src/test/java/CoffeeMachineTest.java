import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CoffeeMachineTest  {
    CoffeeMachine cm;
    Stock s;
    Money m;
    String str;
    @BeforeEach
    public void init() {
        cm = new CoffeeMachine();
        s = new Stock();
        m = new Money();
    }
    class AddCoin {
        int insert(int x){
            if(x>0)
                return x;
            else
                return 0;
        }
    }
    @Test
    public void coffeeStub(){
        AddCoin y = new AddCoin();
        cm.Manage(y.insert(5));
        assertEquals(cm.s.stock,5);
    }
    class GetDoubleCoffees {
        String check(int x){
            if(x%2==0)
                return "Double coffees are available";
            else
                return "Double coffees are not available";
        }
    }
    @Test
    public void stockDriver(){
        GetDoubleCoffees y = new GetDoubleCoffees();
        str = y.check(s.ShowAvailable());
        assertEquals(str,"Double coffees are available");
        s.RemoveFromStock();
        str = y.check(s.ShowAvailable());
        assertEquals(str,"Double coffees are not available");
    }
    @AfterEach
    public void clean(){
        cm =null ;
    }
}


