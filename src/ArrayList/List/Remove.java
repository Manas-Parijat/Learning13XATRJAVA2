package ArrayList.List;
import java.util.ArrayList;

public class Remove {

    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        l.add ("Amit");
        l.add("Neha");
        l.add("Suresh");
        l.add("Mana");

        l.remove("Neha");
        l.remove( "Suresh");


        System.out.println(l);



    }
}
