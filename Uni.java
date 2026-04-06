import java.util.*;
public class Uni{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int unit=sc.nextInt();
        if(unit<=100){
            System.out.print("0");
        }
        else if(unit>=101 && unit<=200){
            System.out.print((unit-100)*0.8);
        }
        else if(unit>=201 && unit<=300){
            double value=100*0.8;
            System.out.print((value+((unit-200)*1.5)));
        }
        else{
            System.out.print(unit*3);

        }
    }
}