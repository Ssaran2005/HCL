import java.util.*;
public class Onlineshopping {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextDouble();
        
        if(amount>=5000){
            System.out.print("payable amount="+ amount*0.20);
        }
        else if(amount>=2000 && amount<=5000){
            System.out.print("payable amount="+ amount*0.10);
        }
        else{
            System.out.print("No Discount");
        }
    }
}
