// import java.lang.foreign.SymbolLookup;
import java.util.*;

public class Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the value of a & b .");

        int a=sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        int mul = a*b;
        System.out.println("The sum of a and b is ="+ sum);
        System.out.println("The multiplication is ="+mul);

    }
}

