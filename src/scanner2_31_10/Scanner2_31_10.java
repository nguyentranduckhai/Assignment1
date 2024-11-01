package scanner2_31_10;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Scanner2_31_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // bai 1
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("My name is : " + name);
        System.out.println("Enter your Age : ");
        int age = scanner.nextInt();
        System.out.println("Age is : " + age);
        System.out.println("Enter your sex : ");
        String sex = scanner.next();
        System.out.println("Sex is : " + sex);
        System.out.println("Enter your GPA : ");
        float GPA = scanner.nextFloat();
        System.out.println("My GPA is : " + GPA);
        System.out.println("Enter your major : ");
        String major = scanner.nextLine();
        System.out.println("My major is : ");
        scanner.nextLine();
        System.out.println("Enter your hometown : ");
        String hometown = scanner.nextLine();
        System.out.println("My hometown is : " + hometown);
        // bai 1.1
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(" dd//mm/yyyy");
        String strDate = formatter.format(date);
        System.out.println(strDate);
               
        //bai 2
        System.out.println("Enter a word random : ");
        String word = scanner.next();
        System.out.println("String data type ? " + scanner.hasNext());

        // bai 3
        System.out.println("Enter a int number :");
        int number = scanner.nextInt();
        System.out.println("int data type ? " + scanner.hasNextInt());
    }

}
