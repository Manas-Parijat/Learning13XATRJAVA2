package constructor;


    class Student {
        // Default constructor
        Student() {
            System.out.println("Default constructor is called");
        }

        void show() {
            System.out.println("Hello from Student class");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Student s1 = new Student();  // Calls the default constructor
            s1.show();
        }
    }


