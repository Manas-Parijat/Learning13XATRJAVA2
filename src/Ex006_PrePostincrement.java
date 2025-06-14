public class Ex006_PrePostincrement {
    public static void main(String[] args) {

        int i = 1;

        i = i++ + ++i;
//1+2+1=4
        System.out.println(i);
    }
}
