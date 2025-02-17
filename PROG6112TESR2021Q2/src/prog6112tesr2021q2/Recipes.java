package prog6112tesr2021q2;

/**
 *
 * @author lindelo Desiree Nkosi
 */
public abstract class Recipes implements iRecipes{
    
     private  String ingredients;
     private int time;
     private int difficultyLevel;
     
     
      //a contructor 
    public Recipes(String ingredients, int time, int difficultyLevel){
        this.ingredients = ingredients;
        this.time = time; 
        this.difficultyLevel = difficultyLevel;
    }
    
    
    public String getIngredients(){
      return this.ingredients;
    }
  

     public int getTime(){
      return this.time;
    }
  
    public int getDifficultyLevel(){
      return this.difficultyLevel; 
    } 
 
 
 

 
 
 
}
