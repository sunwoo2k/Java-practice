import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String A = "I hate going to school but I don't hate java";
        System.out.println(A);
        String B = A.substring(2,7);
        B = "love";
        String C = A.substring(25,29);
        C = "and";

        System.out.println("I " + B + " going to school " + C + " I don't hate java");
        int i;
        int n;
        int count;
        System.out.println("Enter 첫 number : ");
        Scanner sc1 = new Scanner(System.in);
        i = sc1.nextInt();

        System.out.println("Enter 곱할 number : ");
        Scanner sc2 = new Scanner(System.in);
        n = sc2.nextInt();
        for(count = 1; count <= 10 ;count++){
            int result = i*n;
            System.out.println(i + " multiplied by " + n + " = " + result);
            i++;
        }

    }
}
