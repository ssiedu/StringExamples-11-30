
public class StringMethodsExampleTwo {

    public static void main(String[] args) {

       String s="this is java and java is object oriented";
       //int idx=s.indexOf('i',10);   //searching for i will start from idx 10
       int idx=s.indexOf("java",9);
       System.out.println(idx);
        
    }
}
/*
    //searching something in a string

    int indexOf(char)       //searchs from index 0
    int indexOf(char,int)   //searchs from a desired pos.
    int indexOf(String)     //searchs for one string in another one
    int indexOf(String,int)

*/
