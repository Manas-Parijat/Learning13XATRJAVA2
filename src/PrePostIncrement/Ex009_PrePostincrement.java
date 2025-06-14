package PrePostIncrement;

public class Ex009_PrePostincrement {
    public static void main(String[] args) {
        int x = 5;

        int y = x++ + ++x + x++ + ++x;



        System.out.println("x = " + x + ", y = " + y);

        //5+6=
        //x=6 y=
    }
}
