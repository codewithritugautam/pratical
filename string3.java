package Assignment;
public class string3 {
    public static void main(String[] args) {
        String str = "Welcome to Java World";
        char fifthChar = str.charAt(4); 
        System.out.println("The character at 5th position is: " + fifthChar);
        boolean isEqual = str.substring(0, 7).equalsIgnoreCase("Welcome");
        System.out.println(isEqual);
        String newStr = str.concat(" - Let us learn");
        System.out.println("The concatenated string is: " + newStr);
        int firstIndex = str.indexOf('a');
        System.out.println("The index of the first occurrence of 'a' is: " + firstIndex);
        String replacedStr = str.replace('a', 'e');
        System.out.println("The replaced string is: " + replacedStr);
        String subStr = str.substring(3, 10);
        System.out.println("The substring between 4th and 10th position is: " + subStr);
        String lowerStr = str.toLowerCase();
        System.out.println("The lowercase string is: " + lowerStr);
    }
}