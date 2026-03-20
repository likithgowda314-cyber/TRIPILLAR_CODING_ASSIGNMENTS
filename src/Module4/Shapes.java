package Module4;

    abstract class Shape {
        abstract void display();
    }
    class Circle extends Shape{
        @Override
        void display(){
            System.out.println("Sapthagiri College Of Engneering");
        }

        public static void main(String[] args) {
            Shape c=new Circle();
            c.display();
        }
    }

