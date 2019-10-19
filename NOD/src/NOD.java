import java.util.SortedMap;

public class NOD {
    public static void main(String[] args) {

        int a = 1260;
        int b = 48;
        int temp;
        //алгоритм Евклида
        for(int i = 0; b != 0; i++ ) {

                temp = a % b;
                a = b;
                b = temp;
        }

        System.out.println(a);
    }
}
