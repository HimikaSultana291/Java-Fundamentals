import java.util.Random;
import java.util.Scanner;

public class sumof_randnumb {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner scan=new Scanner(System.in);
        Random randomNums = new Random();
        num1=randomNums.nextInt(200);
        num2=randomNums.nextInt(200);
        sum=num1+num2;
        System.out.println("Sum of this two random numbers: " + num1 + "+" + num2 + "=" + sum);
    }
}
