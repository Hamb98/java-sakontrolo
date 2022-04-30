package Restourant;

public class Pizza extends Food {

    String creationYear;
    protected FoodType foodType;
    public Pizza(String name, int portionCount, double price, String creationYear, FoodType type) {
        super(name, portionCount, price, type);
        this.creationYear = creationYear;
    }

    @Override
    public String getCreationYear(){
        return this.creationYear;
    }

}
