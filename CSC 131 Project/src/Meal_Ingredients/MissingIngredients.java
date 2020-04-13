package Meal_Ingredients;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class MissingIngredients {
	public static void ingredientsChecker(BufferedReader required) throws IOException {
		BufferedReader  hasTheseIngredients  = new BufferedReader(new FileReader("curr_ingr.txt"));
		PrintWriter     missingIngredients   = new PrintWriter("missingIngredients.txt");
		String checker                       = hasTheseIngredients.readLine();
		String lineCompare                   = required.readLine();

		while(checker != null) {
			if (lineCompare.equals(checker)) {
				lineCompare = required.readLine();
				checker = hasTheseIngredients.readLine();
			}
			else {
				missingIngredients.print(lineCompare + "\n");
				lineCompare = required.readLine();
				checker = hasTheseIngredients.readLine();
			}
		}
		
		hasTheseIngredients.close();
		required.close();
		missingIngredients.close();
	}
}
