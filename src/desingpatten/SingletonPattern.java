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
public class SingletonPattern {
    
    public static void main(String[] args) {
        MySingleton obj1 = MySingleton.getInstance();
        MySingleton obj2 =  MySingleton.getInstance();
        MySingleton obj3 = MySingleton.getInstance();
        System.out.println("Obj 1 : " + obj1);
        System.out.println("Obj 2 : " + obj2);
        System.out.println("Obj 3 : " + obj3);
        
        
        
    }
    
}
