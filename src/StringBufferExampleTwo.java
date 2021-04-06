
public class StringBufferExampleTwo {

    public static void main(String[] args) {

        String info="this is java code";
        
        //we need to reverse the chars
        
        //creating a StringBuffer using String
        StringBuffer sb=new StringBuffer(info);
        sb.reverse();
        System.out.println(sb);
        
    }
}
