
public class Main {
    public static void main(String[] args) {

        NutritionFacts nutrition = new NutritionFacts.Builder(20,30)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        System.out.println(nutrition.toString());
    }
}