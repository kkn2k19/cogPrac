public class StringMethodDemo {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "HELLO";
        String str3 = "JAVA";
        String str4 = " hello";

        // length()
        System.out.println("Length of '" + str + "': " + str.length());

        // charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // substring() - endIndex not included
        System.out.println("Substring (1,4): " + str.substring(1, 4));

        // equals() & equalsIgnoreCase()
        System.out.println("Equals 'HELLO': " + str.equals(str2));
        System.out.println("EqualsIgnoreCase 'HELLO' : " + str.equalsIgnoreCase(str2));

        // compareTo()
        System.out.println("CompareTo 'Hi': " + str.compareTo("Hi"));

        // toLowerCase() & toUpperCase()
        System.out.println("Lowercase: " + str3.toLowerCase());
        System.out.println("Uppercase: " + str3.toUpperCase());

        // trim()
        System.out.println("Trimmed: '" + str4.trim() + "'");

        // contains()
        System.out.println("Contains 'lo': " + str.contains("lo"));

        // replace()
        System.out.println("Replace 'l' with 'x': " + str.replace("l", "x"));
    }
}

// e:\Karan_codes\Java\cogPrac\String_Handling>javac StringMethodDemo.java &&
// java StringMethodDemo && del StringMethodDemo.class

// Length of 'Hello': 5
// Character at index 1: e
// Substring (1,4): ell
// Equals 'HELLO': false
// EqualsIgnoreCase 'HELLO' : true
// CompareTo 'Hi': -4
// Lowercase: java
// Uppercase: JAVA
// Trimmed: 'hello'
// Contains 'lo': true
// Replace 'l' with 'x': Hexxo