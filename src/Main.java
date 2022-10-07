import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the prime number you want to display: ");
        int number = scanner.nextInt();
        int count = 1;
        int N = 2;
        System.out.println("20 prime numbers are: ");
        boolean flag = true;
        while (count<=number){
                for (int i = 2;i < N;i++){
                    if (N%i == 0){
                        flag = false;
                        break;
                    }
                    else {
                        flag = true;
                    }
                }
            if (flag){
                System.out.println(N);
                N++;
                count++;
            }else {
                N++;
            }
        }

    }
}