package prog6112tesr2021q2;

/**
 *
 * @author lindelo Desiree Nkosi
 */
public class ProcessRecipe extends Recipes
{
      // a contsuctor
    public ProcessRecipe(String ingredients, int time, int  difficultyLevel ){
    super(ingredients, time, difficultyLevel);

    } 
     public void PrintRecipes(){
     
     System.out.println("INGREDIENTS : " + super.getIngredients());
     System.out.println("TIME TO MAKE : " + super.getTime());
     System.out.println("DIFFUCULTY LEVEL : " + super.getDifficultyLevel());
      System.out.println("*******************************************");
     
 }
}
