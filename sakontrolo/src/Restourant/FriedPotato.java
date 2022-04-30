package Restourant;
//  ნინო გიორგაძე
public class FriedPotato extends Food{
    String creationYear;
    protected FoodType foodType;
    public FriedPotato(String name, int portionCount, double price, String creationYear, FoodType type) {
        super(name, portionCount, price, type);
        this.creationYear = creationYear;
    }

    @Override
    public String getCreationYear(){
      return this.creationYear;
    }

}
