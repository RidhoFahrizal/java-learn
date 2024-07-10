import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();


        System.out.println("Hello "+ name+ " Nice to meet you");
        System.out.println("How old are you?");
        int age = input.nextInt();

        if (age > 50) {
            System.out.println( age+ "!, really? . i mean you look young "+ name);
        }else{
            System.out.println("wow you are still young ");
        }

        input.nextLine();
        System.out.println("Do you have a girlfriend?");
        String answer = input.nextLine();

        if (answer == "YES"|| answer == "yes") {
            System.out.println("Wow congrats!");

        }else{
            System.out.println("Let's dating " + name);
        }
    }    
}

