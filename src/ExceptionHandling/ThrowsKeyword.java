package ExceptionHandling;

import java.util.Scanner;

public class ThrowsKeyword {

    public static void main(String[] args) {
        try{
            meth1();
            meth2();
            meth3();
        } catch (Exception e){
            System.out.println("handling exception ");
        }

    }

    public static void meth1() throws Exception{

            Scanner sc = new Scanner(System.in);
            int no = sc.nextInt();
            int ans = 10/no;

    }

    public static void meth2() throws Exception{

            Scanner sc = new Scanner(System.in);
            int no = sc.nextInt();
            int ans = 10/no;

    }
    public static void meth3() throws Exception{
            Scanner sc = new Scanner(System.in);
            int no = sc.nextInt();
            int ans = 10/no;
    }
}
