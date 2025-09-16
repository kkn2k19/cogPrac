import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Karan");
        map.put(100, "Rahul");
        map.put(112, "Saad");

        System.out.println(map);

        // access value
        System.out.println("Id 101 : " + map.get(101));

        // remove
        map.remove(100);

        // iteration
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\" && javac
// HashMapDemo.java && java HashMapDemo && del HashMapDemo.class
// {112=Saad, 100=Rahul, 101=Karan}
// Id 101 : Karan
// 112 -> Saad
// 101 -> Karan