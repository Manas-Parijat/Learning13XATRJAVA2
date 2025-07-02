static class Stu {
    String name;
    int age;

    // Parameterized constructor
    Stu(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


    public static void main(String[] args) {
        // Passing values to constructor
        Stu s1 = new Stu("Aman", 20);
        s1.display();
    }


