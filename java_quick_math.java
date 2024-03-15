import java.util.Scanner;

public class java_quick_math {
    public static void main(String[] args){

        Scanner myScan = new Scanner(System.in);
        System.out.println("Hi, I do simple math, feed me numbers one at a time and I will solve the equation! ");
    
        System.out.println("Choose 1. Addition OR 2. Subtraction ");
        int userChoice = myScan.nextInt();

        if(userChoice == 1){
            System.out.println("You chose 1, Now enter a number ");
            int firstNum = myScan.nextInt();
            System.out.println("Enter another number ");
            int secondNum = myScan.nextInt();
            System.out.println("The answer is: "+ (firstNum+secondNum));
            System.out.println("Thanks for playing along!");

        }else if(userChoice == 2){
            System.out.println("You chose 2, Enter a number ");
            int firstNum = myScan.nextInt();
            System.out.println("Enter another number ");
            int secondNum = myScan.nextInt();
            System.out.println("The answer is: "+ (firstNum-secondNum));
            System.out.println("Thanks for playing along!");
        }else{

        }

    }
}