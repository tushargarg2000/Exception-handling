package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a no.");
        int[] arr = new int[5];
        Person person = null;

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        try {
            //This is a critical statement

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String inputString = br.readLine();

            int ans = 10/no;
            for(int i=0;i<5;i++) {
                arr[i] = i;
            }
            person.age = 10;

        } catch (ArithmeticException e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
            System.out.println("Don't enter 0 as value"); //Action item
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You are out of your limits :)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch (Exception e){
            System.out.println("Caught generic exception");
        }


        try{

        }catch (Exception e){

        }


        System.out.println("This is an important statement" +
                " and should be prevented");
    }
}
class Person{
    int age;
    String name;

}