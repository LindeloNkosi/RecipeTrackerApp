package prog6112tesr2021q2;

import java.util.Scanner;

/**
 *
 * @author lindelo Desiree Nkosi
 */
public class BankingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        //a scanner object
      Scanner Scan = new Scanner(System.in);
      
        System.out.print("Enter the ingredients : ");
        String ingredients = Scan.nextLine();
        
        System.out.print("Enter time to make (in minutes) :");
        int time = Scan.nextInt();
        
        System.out.print("Enter the difficuly level : ");
        int difficultyLevel = Scan.nextInt();
        System.out.println("*******************************************");
        
        
        
          //An object
      ProcessRecipe obj1 = new ProcessRecipe(ingredients, time ,difficultyLevel);
      
      
       
     
       
       obj1.PrintRecipes();
        
        
      
    }
    
}
