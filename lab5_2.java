 class Time{
        int hour,minute;
    }
    Time(int hour,int minute){
        this.hour=hour;
        this.minute=minute;
    }
    public void addTime(Time t1,Time t2){
        this.hour=(t1.hour + t2.minute);
        this.minute=(t1.minute + t2.minute);
        while (this.minute > 60) {
            this.hour++;
            this.minute -= 60;
        }
        
    }
public class lab5_2 {
   public static void main(String[] args) {

        Time t1=new Time(1,30);
        Time t2=new Time(3,30);
        Time t3=new Time(0,0);
        t3.addTime(t1,t2);
        System.out.println(t3.hour+":"+t3.minute);
   }
}
