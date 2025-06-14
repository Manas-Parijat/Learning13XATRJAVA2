package PrePostIncrement;

public class Ex004_Incremenr {
    public static void main(String[] args) {

        int a = 10 ,b= 20 ,c;

        c = a++ + ++b + --a + b--;

        //10+21+9+20
        //11+21+9+20
        System.out.println(c);

    }
}
