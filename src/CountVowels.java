
public class CountVowels {

    public static void main(String[] args) {
        String s="this is java code";
        int vowels=0;
        //counting vowels
        
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }
        }


        System.out.println("Total Vowels : "+vowels);
        
        
    }
}
