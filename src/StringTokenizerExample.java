
import java.util.StringTokenizer;


public class StringTokenizerExample {

    public static void main(String[] args) {

        String s="java,python,php;dotnet,linux";
        
        //to create the tokens of the above string, we will use StringTokenizer
        //StringTokenizer st=new StringTokenizer(s);
        StringTokenizer st=new StringTokenizer(s,",;");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        System.out.println(st.countTokens());
    }
}
/*
        StringTokenizer(String) //tokens will be created using space.
        StringTokenizer(String,String)

        String nextToken()
        boolean hasMoreTokens()
        int countTokens()


*/
