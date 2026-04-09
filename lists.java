import java.util.*;
public class lists {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> students=new ArrayList<>();
        ArrayList<Integer> marks=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String name=sc.nextLine();
            students.add(name);
        }
        for(int i=0;i<n;i++){
            int mark=sc.nextInt();
            marks.add(mark);
        }
        System.out.print(students);
        System.out.print(marks);
    }
}

