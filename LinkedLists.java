import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Hello");
        names.add("Posa");
        names.add("Chimi");
        //names.add(2011);

        System.out.println("linkedlist content:" + names);
        System.out.println("Linkedlist size:" + names.size());
    }
}
