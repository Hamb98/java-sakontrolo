package Restourant;
//  ნინო გიორგაძე
public class Main {
    public static void main(String[] args) {
        Food[] food = {
                new FriedPotato("FriedPotato",1, 3.0,"1940",FoodType.SPICY),
                new MashedPotato("MashedPotato", 2, 2.5,"1780", FoodType.NORMAL),
                new Chocolate("Roshen", 5, 3, "1895", FoodType.SWEET)
        };

        for (Food foods : food) {
            String foodName = foods.toString();
            System.out.println(foodName);
            Food.FoodPriceCalculator newFood = foods.new FoodPriceCalculator();
            System.out.println("Total price is " + newFood.calculateTotalPrice(foods.price,foods.portionCount));
            System.out.println("Creation year: " + foods.getCreationYear());
            System.out.println();
        }

    }
}
