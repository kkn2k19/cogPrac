public class StringBasics {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println(s1 == s2); // false - (different memory)
        System.out.println(s1.equals(s2)); // true -- (same content)
    }
}

// E:\Karan_codes\Java>cd "e:\Karan_codes\Java\cogPrac\String_Handling\" &&
// javac StringBasics.java && java StringBasics && del StringBasics.class
// false
// true