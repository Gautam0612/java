import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        int a=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        a = sc.nextInt(); int coount =1;
    for (int i = 0; i < a; i++) {
        for (int j = 0; j < i+1; j++) {
            System.out.print(coount + " ");
            coount++;
        }
        System.out.print("\n");
    }
    }
}