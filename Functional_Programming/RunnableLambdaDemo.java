public class RunnableLambdaDemo {
    public static void main(String[] args) {
        // Traditional way
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Thread running...");
            }
        };

        // Lambda way
        Runnable r2 = () -> System.out.println("Thread running using lambda...");

        new Thread(r1).start();
        new Thread(r2).start();
    }
}

// e:\Karan_codes\Java\cogPrac\Functional_Programming>cd
// "e:\Karan_codes\Java\cogPrac\Functional_Programming\" && javac
// RunnableLambdaDemo.java && java RunnableLambdaDemo && del
// RunnableLambdaDemo.class
// Thread running...
// Thread running using lambda...