//Write a program to calculate CGPA and find grade

import java.util.Scanner;
public class find_grade {
    public static void main(String[] args) {
        int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);


        for(i=0; i<6; i++) {
            System.out.print("Enter Marks of Subject"+(i+1)+":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/6;
        System.out.print("The student average mark is: " +avg+ "\n");
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A+");
        }
        else if(avg>=75 && avg<80)
        {
            System.out.print("A");
        }
        else if(avg>=70 && avg<75)
        {
            System.out.print("A-");
        }
        else if(avg>=65 && avg<70)
        {
            System.out.print("B+");
        }
        else if(avg>=60 && avg<65)
        {
            System.out.print("B");
        }
        else if(avg>=55 && avg<60)
        {
            System.out.print("B-");
        }
        else if(avg>=50 && avg<55)
        {
            System.out.print("C+");
        }
        else if(avg>=45 && avg<50)
        {
            System.out.print("C");
        }
        else if(avg>=40 && avg<45)
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("F");
        }
    }
}
