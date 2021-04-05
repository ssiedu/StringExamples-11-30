
import java.util.Scanner;


public class EmailCheck {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Email : ");
        String mail=sc.next();
        
        int idx=mail.indexOf('@');
        if(idx==-1){
            System.out.println("Mail Id Must Have @ Symbol");
        }else{
            System.out.println("Its A Valid Id");
        }
        
        
    }
}
