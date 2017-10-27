import java.util.Scanner; //import scanner for user input

class MagicWorld {

    private static int num; //our test number
    private static Scanner input = new Scanner(System.in); //scans input
    private static NumberOracle oracle = new NumberOracle(); //our oracle

    public static void main(String[] args) {

        //this loop gets user in and check it it is an int and bigger than 0
        do {
            //prompting user for a number
            System.out.print("Please enter your number: ");

            //loop until input is an integer
            while (!input.hasNextInt()) {

                System.out.print("your number should be integer(<1 to quit): ");
                input.next();
            }

            //getting user input
            num = input.nextInt();

            //consult oracle
            oracle.consult(num);

        } while (num > 0); //infinit loop until gets a number less than 1
    }
}