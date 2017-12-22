/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desingpatten;

/**
 *
 * @author HacomOliva
 */
public class MySingleton {
    public static MySingleton instance;
    private MySingleton(){
        
    }
    
    public static MySingleton getInstance(){
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
    
}
