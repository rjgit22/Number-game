import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to game!");
        System.out.println("This is a logical game" +
                "\nHere B means one of your guessing number is inside the hidden number and in the right place"+
                "\nHere C means one of your guessing number is inside the hidden number but in the wrong place");

        Random rand=new Random( );
        int random = rand.nextInt(99-0) + 0;
        while(random<11){
            random++;
        }
        String s = String.valueOf(random);
        char c = s.charAt(0);
        char c1 = s.charAt(1);
        while(true) {


            System.out.println("\nEnter number less than 100");
            String strrandom = sc.nextLine();

            int input = Integer.parseInt(strrandom);
            if(input<10){
                System.out.println("Enter two digit number, you entered single digit");
                continue;
            }
            char cinput = strrandom.charAt(0);
            char c1input = strrandom.charAt(1);
            if (input == random) {
                System.out.println("Congratulations");
                break;
            }
            else if (c == cinput || c1 == c1input) {
                System.out.println("1B,0C");
            }
            else if (c == c1input && c1 == cinput) {
                System.out.println("0B,2C");
            }
            else if (c == c1input || c1 == cinput) {
                System.out.println("0B,1C");
            }

            else {
                System.out.println("0B,0C");
            }
        }
    }
}
