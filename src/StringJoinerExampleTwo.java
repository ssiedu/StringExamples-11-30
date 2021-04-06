
import java.util.Scanner;
import java.util.StringJoiner;


public class StringJoinerExampleTwo {

    public static void main(String[] args) {

        //take 5 students name as input and join them using ,
        
        Scanner sc=new Scanner(System.in);
        
        StringJoiner joiner=new StringJoiner(",");
        
        for(int i=1; i<=5; i++){
            System.out.println("Enter Name : "+i);
            String name=sc.next();
            joiner.add(name);
        }
        
        System.out.println(joiner);
        
    }
}
