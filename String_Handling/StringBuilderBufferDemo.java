public class StringBuilderBufferDemo {
    public static void main(String[] args) {
        // String (immutable)
        String s = "Hello";
        s.concat(" world"); // doesn't change original
        System.out.println("String (immutable) : " + s); // Hello

        // StringBuilder (Mutable, not synchronized)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.delete(0, 1);
        sb.reverse();
        System.out.println("StringBuilder (Mutable) : " + sb);

        // StringBuffer (Mutable, synchronized)
        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Programming");
        sbf.replace(0, 4, "Core");
        sbf.reverse();
        System.out.println("StringBuffer (Thread-safe) : " + sbf);
    }
}

// e:\Karan_codes\Java\cogPrac\String_Handling>cd
// "e:\Karan_codes\Java\cogPrac\String_Handling\" && javac
// StringBuilderBufferDemo.java && java StringBuilderBufferDemo && del
// StringBuilderBufferDemo.class

// String (immutable) : Hello
// StringBuilder (Mutable) : dlroW ,olle
// StringBuffer (Thread-safe) : gnimmargorP eroC