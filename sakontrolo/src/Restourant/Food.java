package Restourant;
//  ნინო გიორგაძე
public abstract class Food {
    protected String name;
    protected int portionCount;
    protected double price;
    protected FoodType foodType;

    public Food(String name, int portionCount, double price, FoodType type)    {
        this.name = name;
        this.portionCount = portionCount;
        this.price = price;
        this.foodType = type;
    }

    @Override
    public String toString() {
        return
                "Food name: " + this.name
                        + ", price: " + this.price
                        + ", portion quantity: " + this.portionCount
                        + ", Food type: " + this.foodType;
    }

    public abstract String getCreationYear();

    class FoodPriceCalculator {
        public double calculateTotalPrice(double price, int quantity) {
            return price * quantity;
        }
    }

}
