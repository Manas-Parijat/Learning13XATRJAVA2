package PrePostIncrement;

public class Ex003_Increment {
    public static void main(String[] args) {
      int i = 11;
       // i = (i++ + ++i);
        //System.out.println(i);

       // i = (i++);
        //System.out.println(i);

        i = (i++ +i);
        System.out.println(i);
    }
}
