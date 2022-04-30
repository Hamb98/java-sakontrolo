package Restourant;

public class MashedPotato extends Food{
    String creationYear;

    public MashedPotato(String name, int portionCount, double price, String creationYear, FoodType type)    {
        super(name, portionCount, price, type);
        this.creationYear = creationYear;
    }

    @Override
    public String getCreationYear() {
        return this.creationYear;
    }
}
