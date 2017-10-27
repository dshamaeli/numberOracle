import java.util.Scanner;

class MagicWorld {

    private static int var;
    private static Scanner input = new Scanner(System.in);
    private static NumberOracle oracle = new NumberOracle();

    public static void main(String[] args) {

        //this loop gets user in and check it it is an int and bigger than 0
        do {
            //prompting user for a number
            System.out.print("Please enter your number: ");
            //check if input is an integer
            while (!input.hasNextInt()) {
                System.out.print("your number should be integer(<1 to quit): ");
                input.next();
            }
            //getting use input
            var = input.nextInt();
            if (var < 1)
                break;
            oracle.setNum(var);    
            oracle.checkInt();
        } while (var > 0); //infinit loop until gets a positive number
        System.out.println("\n\nThe Oracle is closing for business now");
    }
}
