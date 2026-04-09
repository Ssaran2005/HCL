import java.util.*;
public class maps {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> studentMarks=new HashMap<>();
        int n=sc.nextInt();
        // sc.nextLine();
        for(int i=0;i<n;i++){
            String name=sc.next();
            int mark=sc.nextInt();
            studentMarks.put(name,mark);
        }
        System.out.println(studentMarks);
    }
}
