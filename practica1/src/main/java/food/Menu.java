
package food;

import java.util.ArrayList;
import values.DishType;


public class Menu {     // DEFINO LA LISTA 
    private ArrayList <Dishes> dishesList; //este dishesList vendría siendo como un atributo, por eso tengo que ponerlo en el constructor con el this 
    
    public Menu(){      // CREO LA LISTA (NEW) 
        this.dishesList= new ArrayList <>(); 
    }
    
    public Menu (ArrayList <Dishes> dishesList){    // LA ENVÍO COMO PARÁMETRO 
        this.dishesList=dishesList; 
    }
    
    // creo este método para agregar platos, es decir, agregar lo que tengo en Dishes a la lista que estoy creando
    public void addDishes(Dishes dishes1){  //para agregar esa variable de dishes1 debe aparecer como parámetro en el método ese  
        this.dishesList.add(dishes1); 
    }
    
    
    public ArrayList<String> getDishesPerType(DishType dishType1){ //este método me va a devolver una lista de nombres de acuerdo al tipo que se especifique, por eso importé la clase DishType 
        ArrayList<String> foundDishes= new ArrayList<>(); //creación de un nuevo array que solo acepta strings 
        for (Dishes dishes1 : dishesList){ 
           if (dishes1.getType() == dishType1 && dishes1.getQuantity()>0){
               foundDishes.add(dishes1.getName());   // si se cumple la condición del if entonces se añade el nombre al array que llamamos como foundDishes
           } 
        }
        return foundDishes; 
    }
    
    
}
