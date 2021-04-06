
import java.util.StringJoiner;


public class StringJoinerExample {

    public static void main(String[] args) {

        String s1="indore", s2="delhi", s3="mumbai";
        //StringJoiner joiner=new StringJoiner("<==>");
        StringJoiner joiner=new StringJoiner("#","==>","<==");
        joiner.add(s1); joiner.add(s2); joiner.add(s3);
        System.out.println(joiner);
        
        
    }
}
/*
    was introduced in java8
*/
