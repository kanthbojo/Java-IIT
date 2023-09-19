public class Stringclass {
    public static void main(String[] args) {
         /*
         -> Java has a built-in class for String that allows for the creation and
         manipulation of strings.
         -> String refers to a group of characters. String objects in Java are immutable,
         which simply means they can never be modified after they have been created.
         -> As they are not immutable, Strings are not arrays of characters
         -> We cannot modify a character of a string, we can only do CONCATENATION
          */

        String str1 = "Hello";
        String str2 = new String("World"); // Just another way of creating
        char[] ch = {'a','b','c'};
        String str3 = new String(ch); // str3 = "abc"

        String concat = str1 + " " + str2; // String Concatenation
        System.out.println(concat);

        char ch1 = str1.charAt(1); // charAt(int index) provides char value at that index
        System.out.println(ch1);

        int len = str1.length(); // length() returns length of a string
        System.out.println(len);

        String substr = str1.substring(1,3); // substring(int begin_index, int end_index)
        System.out.println(substr);

        String shit = str2.concat(str1);
        System.out.println(shit);

        String replace = str1.replace('l','p'); // replace(old char, new char)
        System.out.println(replace);

        boolean check = str1.isEmpty();  // isEmpty()
        System.out.println(check);

        System.out.println(str1.toUpperCase()); // toUpperCase()
        System.out.println(str2.toLowerCase()); // toLowerCase()

    }
}
