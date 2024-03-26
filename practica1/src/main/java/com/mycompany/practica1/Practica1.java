
package com.mycompany.practica1;

import food.Dishes;
import people.User;
import values.DishType;
import values.UserRole;


public class Practica1 {

    public static void main(String[] args) {
        User student=new User("Camila", "192214", UserRole.STUDENT);
        User teacher=new User("Badwin", "10000", UserRole.TEACHER);
        User administrative=new User("Eduar", "191010", UserRole.ADMINISTRATIVE);
        
        
        
        Dishes dish1=new Dishes("Pancakes de Chocolate", 2500, 5, DishType.BREAKFAST); 
        Dishes dish2=new Dishes("Spaguetti Alfredo", 2500, 2, DishType.LUNCH);
        Dishes dish3=new Dishes("Hot Dog", 2300, 57, DishType.DINNER);
        
        
        
    }
}
