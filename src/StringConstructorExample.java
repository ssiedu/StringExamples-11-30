
public class StringConstructorExample {
    public static void main(String[] args) {

        String s1=new String();
        System.out.println(s1.length());
        String s2=new String("indore,bhopal,delhi,ujjain");
        System.out.println(s2);
        char ch[]={'a','b','c','d','e','f','g','h'};
        String s3=new String(ch);
        System.out.println(s3);
        String s4=new String(ch,3,4);
        System.out.println(s4);
        byte b[]={65,66,67,68,69,70,71,72,73,74,75};
        String s5=new String(b);
        System.out.println(s5);
        String s6=new String(b,2,5);
        System.out.println(s6);
    }
}
/*
    Constructors
    ----------------
    String()        //creates a string of length zero.
    String(String)
    String(char[])
    String(char[],int,int)
    String(byte[])
    String(byte[],int,int)

*/
