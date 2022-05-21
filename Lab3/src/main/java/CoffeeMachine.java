class Money {
    int a = 0;
    boolean isEmpty(){
        if(a >0)
            return true;
        else
            return false;
    }
    void Collect(int a){
        a =0;
    }
    void AddPound(){
        a++;
    }
}
class Stock {
    int stock =10;
    boolean isEmpty(){
        if(stock >0)
            return true;
        else
            return false;
    }
    void AddToStock(int add){
        stock +=add;
    }
    void RemoveFromStock(){
        stock -=1;
    }
    void Collect(){
        stock =0;
    }
    int ShowAvailable(){
        return stock;
    }
}

public class CoffeeMachine {
    Money m = new Money();
    Stock s = new Stock();

    public void coffee(int s){
        this.s.AddToStock(s);
    }
    void Manage(int x){
        while(x>0 && s.isEmpty()){
            System.out.println("Coffee is served!");
            m.AddPound();
            s.RemoveFromStock();
            x--;
        }
        if (x!=0)
            System.out.println("The machine is empty!");
    }
    void ShowStatus(){
        System.out.println("There are "+m.isEmpty()+" coins"+"\n"+s.isEmpty()+" coffee in stock");
    }





    public static void main(String args[]){
    }
}


