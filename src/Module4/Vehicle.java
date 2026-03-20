package Module4;

public class Vehicle {
    void start() {

    }
}
    class Car extends Vehicle {
        @Override
        public void start() {
            System.out.println("need key to start");
        }

        public static void main(String[] args) {
            Car c=new Car();
            c.start();

        }

}
