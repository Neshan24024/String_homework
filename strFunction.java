public class strFunction {
    public static void main(String[] args) {
        String name = "Neshan";
        String name1 = "neshan";

        System.out.println(name.toLowerCase());//turn the string into lowercase
        System.out.println(name.toUpperCase());//turn the string into uppercase
        System.out.println(name.equals(name1));//checks whether the compared string is the same
        System.out.println(name.equalsIgnoreCase(name1));//checks whether the compared string is the same ignoring the cases
        System.out.println(name.charAt(3));//prints the character at a certain position in the given string
        System.out.println(name.indexOf("b"));//prints the position of the given character
        System.out.println(name.contains("a"));//checks if the given character is in the given string
        System.out.println(name.length());//gives the length of the string
    }
}