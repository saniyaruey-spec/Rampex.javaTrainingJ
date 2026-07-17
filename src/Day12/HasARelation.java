package Day12;


    class Laptop {
    String brand = "HP";

    void showLaptop() {
        System.out.println("Laptop Brand: " + brand);
    }
}

    class Employee {
        String name = "Saniya";

        Laptop lap = new Laptop(); // Has-A relationship

        void display() {
            System.out.println("Employee Name: " + name);
            lap.showLaptop();
        }
    }
    public class HasARelation {
        public static void main(String[] args) {
            Employee emp = new Employee();
            emp.display();
        }
    }

