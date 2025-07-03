package OOPS_polymorphism.overloading.overloading;

public class Poly_Overloading {

    public static void main(String[] args) {

        MathOperation m1 = new MathOperation();

        int d1 = m1.add(10, 20);
        int d2 = m1.add(10, 20, 30);
        double d3 = m1.add(3.14, 4.26);
        String d4 = m1.add("Automation", "Postman");

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4);
    }
}

class MathOperation {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}

