
package food;

import values.DishType;

public class Dishes {
    String name;
    int price;
    int quantity;
    private DishType type; 
    
    
    public Dishes(String name, int price, int quantity, DishType type){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.type=type; 
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public DishType getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setType(DishType type) {
        this.type = type;
    }
    
    
}
