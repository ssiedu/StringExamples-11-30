
public class StringBufferExample {

    public static void main(String[] args) {

        //StringBuffer sb=new StringBuffer("abcdefgh");
        StringBuilder sb=new StringBuilder("abcdefgh");
        System.out.println(sb);
        String s=sb.toString();
        String s1=s.toUpperCase();
        System.out.println(s1);
        //sb.reverse();
        //sb.setLength(10);
        //sb.delete(2, 5);
        //sb.deleteCharAt(3);
        //sb.setCharAt(3, 'Z');
        //sb.replace(1, 5, "XYZ");
        //sb.insert(0, "XYZ");
        //sb.append("XYZ");
        //System.out.println(sb);
        
    }
}
/*
    append          =>  adds the contents at the end of existing contents.
    insert          =>  can add the contens on the desired position.
    replace         =>  can change a range of chars with new contents
    setCharAt       =>  can replace a single char
    deleteCharAt    =>  can delete a char from given index
    delete          =>  can delete a range of chars
    setLength       =>  can change the length of a StringBuffer object
    reverse         =>  will change the order of chars
    toString        =>  can convert a StringBuffer to String object.
*/