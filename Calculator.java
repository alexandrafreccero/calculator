import java.util.Scanner; // make scanner accessible
//Create class Calculator

public class Calculator{ // Same class as filename

    //Creating method to store userinput value to main
    private static double getNumber(Scanner input){
                
        while(true){

            try{
                System.out.println("Enter a number");
                 
                double num1= input.nextDouble();//Userinput first digit        
                return num1; //Breaks while loop and returns value
    
            }catch(Exception e){
    
                System.out.println("You did not enter a number");            
    
            }
        }
          
    }  
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);// make user input available     
        
        double num1 = getNumber(input); //declaring variable num1 and returning method
        double num2 = getNumber(input); // declaring variable num2 and returning method

        double functionA = num1 + num2; //Setting upp functions for each operator choise
        double functionB = num1 - num2;
        double functionC = num1 * num2;
        double functionD = num1 / num2;

        String userChoice = input.nextLine(); //Declaring variable userChoice

        System.out.println(" Welcome,to close calculator enter the word: exit"); 

        do{ // the program will run until while declaration (input == exit)

            
            System.out.println(" Please enter one of the following operators: +, -, *, / ");
            userChoice = input.nextLine();// userChoice of operator
    

            switch (userChoice){
            
                case "+":
                System.out.println( functionA);
                break;

                case "-":
                System.out.println( functionB);
                break;

                case "*":
                System.out.println( functionC);
                break;

                case "/":
                System.out.println( functionD);
                break;

                case "exit":
                System.out.println("Goodbye");
                break;
                
                default:
                System.out.println("You did not enter a valid operator");
            }

            

        }
        while ( !userChoice.equals("exit"));
    }
}

