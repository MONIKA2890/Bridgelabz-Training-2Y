
interface MealPlan {}


class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}
class KetoMeal implements MealPlan {}
class HighProteinMeal implements MealPlan {}


class Meal<T extends MealPlan> {
    T mealPlan;
    Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }
    void displayMeal() {
        System.out.println("Meal Plan: " + mealPlan.getClass().getSimpleName());
    }
}

class MealPlanner {
    public static <T extends MealPlan> Meal<T> generateMeal(T plan) {
       
        return new Meal<>(plan);
    }
}


public class MealPlanDemo {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = MealPlanner.generateMeal(new VegetarianMeal());
        vegMeal.displayMeal();

        Meal<KetoMeal> ketoMeal = MealPlanner.generateMeal(new KetoMeal());
        ketoMeal.displayMeal();
    }
}

