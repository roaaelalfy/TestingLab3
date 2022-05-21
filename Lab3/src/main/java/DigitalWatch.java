public class DigitalWatch {
    public String State = "NORMAL";
    public String State1 = "TIME";
    public String State2 = "min";
    public String State3 = "ALARM";
    int min=0,hr=0, day=1,month=1, year=2000;
    String StatesTransition(String x){
        switch(State) {
            case "NORMAL": {
                if (x == "c")
                    this.State = "UPDATE";
                if (x == "b")
                    this.State = "ALARM";
                if (x == "a")
                    if (State1 == "TIME") {
                        State1 = "DATE";
                        return this.DisplayDate();
                    }
                    else{
                        State1 = "TIME";
                        return this.DisplayTIME();
                    }
                return State;
            }
            case "UPDATE": {
                if (x == "d")
                    State = "NORMAL";
                else if (x == "c")
                    State = "UPDATE";
                else {
                    switch (State2) {
                        case "min": {
                            if (x == "a")
                                State2 = "hour";
                            if (x == "b"){
                                this.min = (min+1)%60;
                                return this.DisplayTIME();
                            }
                            break;
                        }
                        case "hour": {
                            if (x == "a")
                                State2 = "day";
                            if (x == "b"){
                                this.hr= (hr+1)%12 +1;
                                return this.DisplayTIME();
                            }break;
                        }
                        case "day": {
                            if (x == "a")
                                State2 = "month";
                            if (x == "b"){
                                this.day= (day+1)%30+1;
                                return this.DisplayTIME();
                            }break;
                        }
                        case "month": {
                            if (x == "a")
                                State2 = "year";
                            if (x == "b"){
                                this.month= (month+1)%12+1;
                                return this.DisplayTIME();
                            }break;
                        }
                        case "year": {
                            if (x == "a")
                                State = "NORMAL";
                            if (x == "b"){
                                this.year= (year+1);
                                return this.DisplayTIME();
                            }
                        }break;
                    }
                }
                return State;
            }
            case "ALARM":{
                if(x == "d"){
                    State = "NORMAL";
                    return State;
                }
                else if (x == "a")
                    if(State3 == "ALARM"){
                        State3 = "CHIME";
                        return State3;
                    }
                    else{
                        State = "ALARM";
                        return State3;
                    }}
            return State;
        }
        return State;
    }
    String DisplayDate(){
        System.out.println(year+"-"+min+"-"+day);
        return (year+"-"+month+"-"+day);
    }
    String DisplayTIME(){
        System.out.println( hr+":"+min);
        return ( hr+":"+min);
    }
    public static void main(String args[]){
    }
}