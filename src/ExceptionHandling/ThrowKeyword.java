package ExceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            int age = sc.nextInt();

            if(age<18) {
                    throw new IOException("Age entered is less than 18 ");
            }
            //Skipping all this code
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
