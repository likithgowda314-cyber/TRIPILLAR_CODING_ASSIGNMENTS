package Module4;
    final class FinalClassDemo {
        void display() {
            System.out.println("This is a final class.");

        }

        public static void main(String[] args) {
            FinalClassDemo fc= new FinalClassDemo();
            fc.display();
        }
    }
   /* class Car extends FinalClassDemo{ //cannot inherit from final Module4.FinalClassDemo
        public static void main(String[] args) {
            Car finalclass = new Car();
            finalclass.display();
        }
    }
/*
//class Inherit extends FinalClass
// Final class cannot be inherited
 */

