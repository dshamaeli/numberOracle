
import java.util.Scanner;

class NumberOracle {

    private static int sum = 0;

    //checks if num is deficient,abundant or perfect
    public void consult(int num) {
        sum = 0;
        //divid num to all smaller number 
        for (int i = 1; i < num; i++) {

            //check if i proper divisors for num
            if (num % i == 0) {
                sum += i; // if it is, add it ti sum
            }
        }    
            //checks  if correct prints the deficiency
            if (num == 1 || num > sum) {

                System.out.println("\nThe number " + num + " is deficient!\n\nIt has a deficiency of " + (num - sum) + "\n");

                //checks if num is abundant and prints the abundancy
            } else if (num < sum) {

                System.out.println("\nThe number " + num + " is abundant!\n\nIt has a abundancy of " + (sum - num) + "\n");

            /*if num is not > or < than sum then they must be == so there is no need to check for perfect condition here*/
            } else
                System.out.println("\nYou have achieved perfection with the number " + num + "!\n");
    }
}
