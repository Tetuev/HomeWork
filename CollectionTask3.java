import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionTask3 {
    public static void main(String[] args) {
        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int n = (int) (Math.random() * 20 + 1);
            set.add(i,n);
        }
        System.out.println(set);
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()){
            Integer num = iter.next();
            if(num > 10) {
                iter.remove();
            }
        }


        System.out.println(set);

    }
}
