public class SubstringOps {
    public static void main(String[] args) {
        String s = "karankumarnonia";

        System.out.println(s.substring(0, 8)); // karankum
        System.out.println(s.substring(8)); // arnonia
        System.out.println(s.contains("ar")); // true
    }
}
