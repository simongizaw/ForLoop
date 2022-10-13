public class ForLoop {
    public static void main(String[] args) {


        for (int x = 0; x <= 10; x++) {

            System.out.println(x);
        }


        for (int x = 30; x >= 0; x--) {

            System.out.println(x);
        }


        for (int x = 10; x >= 0; x -= 2) {

            System.out.println(x);
        }


        for (int r = 1; r <= 5; r++)
        {

            for (int c = 1; c <= r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

            for (int r = 5; r >= 1; r--)
            {

                for (int c = 1; c <= r; c++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

        for (int r = 5; r >= 1;r-- )
        {

            for (int c = 1; c <= 5; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }







    }
}
