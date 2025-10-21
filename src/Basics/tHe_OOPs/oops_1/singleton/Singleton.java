/*
**********THEORY**********
- Singleton classes are those classes whose object is created only once.
- Multiple objects are not allowed.
    - So creating constructors must be restricted.
- Approach : Create a function that will give an instance while calling that function.

*/


package Basics.staticExample.singleton;

public class Singleton {
    private Singleton(){
        System.out.println("Hello from Private!");
    }

    private static Singleton instance;
    public static Singleton getInstance() {
//        check whether only 1 obj is created or not
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
