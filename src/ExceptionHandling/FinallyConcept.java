package ExceptionHandling;

public class FinallyConcept {

    public static void main(String[] args) {


        try{
            int a = 0;
            int no  = 10/a;

        }catch (NullPointerException e){

            //Handling null pointer
        } finally {
            System.out.println("A very very important " +
                    "Must must execute");
        }

    }
}
