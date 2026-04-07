import java.util.*;
public class Fuelcost {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        int mileage=sc.nextInt();
        int fuelprice=sc.nextInt();
        System.out.print((fuelprice/mileage)*distance);
    }
}
