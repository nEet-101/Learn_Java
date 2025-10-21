package Basics.staticExample;

/*
-> When "Test" class is static, it can be directly used in other functions without creating the obj of its parent class.
    Ques: What does "static class Test" actually means?
    Ans:
    - Test class is declared as static inside the InnerClasses class hence it is not dependent on the objects of InnerClasses class,
      but Test class and main function can have the instances of each other.
    - So Test class can have its own identity (its multiple objects can be created).
*/


public class InnerClasses1 {

//    When the "Test" class is non-static, it depends on the "InnerClasses" class (i.e. Test is the instance of InnerClasses).

//    When "Test" class is static, it can be directly used in other functions without creating the obj of its parent class.
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {

        Test a = new Test("Neet");
        Test b = new Test("Deep");

//      Test can have its own identity (multiple objects can be created)
        System.out.println(a.name); //output: Neet
        System.out.println(b.name); //output: Deep

    }
}
