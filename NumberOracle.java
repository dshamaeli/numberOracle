
import java.util.Scanner;

class NumberOracle {
    private int num = 0;
    private static int counter = 0;

    public void setNum(int num) {
        this.num = num;
    }

    public void checkInt() {
        counter=0;
        System.out.println("\nConsulting the Oracle …\n");
        if (num == 1)
            System.out.println("\nThe number " + num + " is deficient!\n");
        else {
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    counter += i;
                }
            }
            if (num > counter) {
                System.out.println(
                        "\nThe number " + num + " is deficient!\n\nIt has a deficiency of " + (num - counter) + "\n");
            } else if (num < counter) {
                System.out.println(
                        "\nThe number " + num + " is abundant!\n\nIt has a abundancy of " + (counter - num) + "\n");
            } else
                System.out.println("\nYou have achieved perfection with the number " + num + "!\n");
        }
    }
}
