public class StringBufferExample {
    public static void main(String[] args) {
        //Creating a StringBuffer object with initial value "Hello"
        StringBuffer sb = new StringBuffer("Hello");

        //append() adds texts at the end of ecsisting string
        sb.append("World");
        System.out.println("append: " + sb);
   
        //insert() adds text at a specified index
        sb.insert(5,",");
        System.out.println("insert: " + sb);

        //replace() replaces characters from start index to end index
        sb.replace(6,11,"java");
        System.out.println("replace: " + sb);

        ////delete() removes characters between start and end index
        sb.delete(5, 6);
        System.out.println("delete: " + sb);

        //reverse() reverse the entire string
        sb.reverse();
        System.out.println("reverse: "+ sb);

        //length() returns the number of character in the string
        System.out.println("length: " + sb.length());

        //setcharAt() changes the character at pecified index
        sb.setCharAt(2 , 'X');
        System.out.println("setCharAt: " + sb);

        System.out.println("substring: " + sb.substring(1,4));
    }
    
}
