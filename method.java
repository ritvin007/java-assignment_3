class Parent {
    public void display() {
        System.out.println("Parent's display method executed successfully");
    }

    public void print(int num) {
        System.out.println("Parent's print method with integer: " + num + " executed successfully");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child's display method executed successfully");
    }

    public void print(String message) {
        System.out.println("Child's print method with string: " + message + " executed successfully");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();
        parent.print(5);

        Child child = new Child();
        child.display(); 
        child.print("Hello"); 
        child.print(10); 
    }
}
