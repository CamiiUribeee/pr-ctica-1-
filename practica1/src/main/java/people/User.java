
package people;

import values.UserRole;

public class User {
    String name;  //atributos acorde al objeto que yo esté creando 
    String id; 
    private UserRole role; 
    
    public User(String name, String id, UserRole role){   //ese public es un constructor 
        this.name=name;
        this.id=id; 
        this.role=role; 
    }
}
