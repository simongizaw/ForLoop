import java.util.Scanner;
public class CtoF {
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       int cel = 0;
       double fahr = 0;
       String trash = " ";

       do {
           System.out.print("enter the temp in C");
           if (in.hasNextInt()){
               cel = in.nextInt();
               fahr = ( cel * 1.8) + 32;
               System.out.println("The temp in F is " + fahr);

           } else {
               trash = in.nextLine();
               System.out.println(trash + " is not a valid input");
           }
       } while(trash != in.nextLine());




    }
}