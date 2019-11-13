import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTask3 {
    public static void main(String[] args) {
        ArrayList<Integer> set = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int n = (int) (Math.random() * 20 + 1);
            set.add(i, n);
        }
        System.out.println(set);
        for (int i = 0; i < 20; i++) {  //Выдает ошибку
            int n = set.get(i);
            if (n > 10) {
                set.remove(i);
            }

        }
        System.out.println(set);

    }
}
