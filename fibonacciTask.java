    import java.util.Scanner;

    public class fibonacciTask {
    static void main(String[] args)  throws InterruptedException {
        // Lab 05 Bonus Task
        //GitHub name: suatify
        // biraz farklı olmasını istedim :))


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.println(a + ". fibonacci element is: " + fib(a-1) );

        for (int i= 0 ; i < 11 ; i++ ){
            System.out.print(fib(i) + " ");
            Thread.sleep(450);
        }

    }

    public static int fib (int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }


    }

}
