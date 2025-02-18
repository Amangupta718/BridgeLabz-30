
import java.util.ArrayList;
import java.util.List;

// MealPlan interface
interface MealPlan {
    String getMealName();
}

// Subclasses representing different meal types
class VegetarianMeal implements MealPlan {
    private String mealName;

    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }
}

class VeganMeal implements MealPlan {
    private String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }
}

class KetoMeal implements MealPlan {
    private String mealName;

    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }
}

class HighProteinMeal implements MealPlan {
    private String mealName;

    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }
}

// Generic Meal class
class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    public void addMeal(T meal) {
        meals.add(meal);
    }

    public List<T> getMeals() {
        return meals;
    }
}

// Utility class with a generic method to generate personalized meal plans
class MealPlanGenerator {
    public static <T extends MealPlan> void generateMealPlan(List<T> meals) {
        System.out.println("Personalized Meal Plan:");
        for (MealPlan meal : meals) {
            System.out.println("- " + meal.getMealName());
        }
    }
}

// Main class to test the meal plan generator
public class PersonalizedMealPlan {
    public static void main(String[] args) {
        // Create meal categories
        Meal<VegetarianMeal> vegetarianMeals = new Meal<>();
        Meal<VeganMeal> veganMeals = new Meal<>();
        Meal<KetoMeal> ketoMeals = new Meal<>();
        Meal<HighProteinMeal> highProteinMeals = new Meal<>();

        // Add meals to respective categories
        vegetarianMeals.addMeal(new VegetarianMeal("Rajma Chawal"));
        veganMeals.addMeal(new VeganMeal("Dal Fry"));
        ketoMeals.addMeal(new KetoMeal("Dhaba Chicken"));
        highProteinMeals.addMeal(new HighProteinMeal("GrilledChiken"));

        // Generate meal plans dynamically
        MealPlanGenerator.generateMealPlan(vegetarianMeals.getMeals());
        MealPlanGenerator.generateMealPlan(veganMeals.getMeals());
        MealPlanGenerator.generateMealPlan(ketoMeals.getMeals());
        MealPlanGenerator.generateMealPlan(highProteinMeals.getMeals());
    }
}

