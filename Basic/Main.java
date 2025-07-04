package Basic;

public class Main {
    public static void main(String[] args){
        Vehicle obj=new GoodsVehicle();
        Vehicle obj1=new SportsVehicle();
        obj.drive();
        obj1.drive();
    }
}
