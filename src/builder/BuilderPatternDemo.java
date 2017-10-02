package builder;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal verMeal = mealBuilder.prepareVerMeal();
		System.out.println("Ver meal");
		verMeal.showItems();
		System.out.println("Total cost: " + verMeal.getCost());
		
		Meal nonMeal = mealBuilder.prepareNonVerMeal();
		System.out.println("Non Ver meal");
		nonMeal.showItems();
		System.out.println("Total cost: " + nonMeal.getCost());
	}
}
