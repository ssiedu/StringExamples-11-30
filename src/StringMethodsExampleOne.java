
public class StringMethodsExampleOne {

    public static void main(String[] args) {

        String s1="indore";     
        String s2="Indore";
        
        int n1=s1.compareTo(s2); 
        int n2=s1.compareToIgnoreCase(s2);
        System.out.println(n1);
        System.out.println(n2);
        /*
        String s1="yahoo.co.in";
        boolean b=s1.endsWith(".com");
        System.out.println(b);
        */
        /*
        String s1="india";
        boolean b=s1.startsWith("ind");
        System.out.println(b);
        */
        /*
        String s1=new String("indore");
        String s2=new String("indore");
        boolean b1=s1.equals(s2);
        System.out.println(b1);
        
        boolean b2=s1.equalsIgnoreCase(s2);
        System.out.println(b2);
        */
    }
}
/*
    String (non-static) (comparison)

        boolean equals(String)  //case-sensitive comparison
        boolean equalsIgnoreCase(String)    //case-insensitive comparion
        boolean startsWith(String)  //checks the beginig of a string
        boolean endsWith(String)    //checks the ending chars
        int compareTo(String)

            int n=s1.compareTo(s2);

            s1>s2   (calling object is big)     +ve
            s1<s2   (calling object is small)   -ve
            s1=s2   (same contents)             0

 */
