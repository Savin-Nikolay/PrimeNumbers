//Task:
//
//Write a program that prints prime numbers between [2, 100] to the console.
//Use the% (modulo) operator and loops to accomplish this task.

public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
