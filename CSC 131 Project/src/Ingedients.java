import java.util.*;
import java.io.*;
public class Ingedients {
	
	private static ArrayList<String> ingredientName = new ArrayList<String>();
	private static ArrayList<String> amount = new ArrayList<String>();
	
	public static void addIngrediants(Scanner console)
	   {
	      while(true)
	         {
	    	// ask user for the ingredient and its amount
	            System.out.print("Please enter an ingredient(Exit to exit): ");
	            String ingredient = console.nextLine();
	            if(ingredient.toLowerCase().equals("exit"))
	               break;
	            System.out.print("Please enter the amount: ");
	            String quantity = console.nextLine();
	            
	            // add the ingredient and its quantity to the list
	            amount.add(quantity);
	            ingredientName.add(ingredient);
              }

	   }
	   
   public static void saveIngrediants()
   {
            
      //Add this to write a string to a file
      //
      try {
         BufferedWriter out = new BufferedWriter(new FileWriter("curr_igr.txt"));
         for(int i = 0; i < amount.size(); i++)
            out.write(amount.get(i) + " " + ingredientName.get(i)+ "\n"); 
         out.close();                               
      }
      catch (IOException e)
      {
          System.out.println("Exception ");
      }
   }
}
