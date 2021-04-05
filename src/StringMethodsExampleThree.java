
public class StringMethodsExampleThree {

    public static void main(String[] args) {

        String s="ssi#indore";
        
        //char ch=s.charAt(3);
        //System.out.println(ch);
        
        byte b[]=s.getBytes();
        
        for(byte tmp:b){
            System.out.println(tmp);
        }
        
        /*
        char ch[]=s.toCharArray();
        
        for(char tmp:ch){
            System.out.println(tmp);
        }
        */
        
        
    }
}
/*

    //char-extraction   (fetching some chars from a string)

    char charAt(int)
    char[] toCharArray()
    byte[] getBytes()


*/
