import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Print {
    public static void printList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 20 чисел: ");
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();
        ArrayList<Integer> aother = new ArrayList<>();

        for (int i = 0; i <20 ; i++) {
            Integer n = scanner.nextInt();
            a.add(n);
        }
        System.out.println(a);

        Iterator<Integer> iterator = a.iterator();

        while (iterator.hasNext()) {
            Integer num = iterator.next();

            if (num % 2 == 0 && num % 3 == 0) {
                a2.add(num);
                a3.add(num);
            } else if (num % 2 == 0) {
                a2.add(num);
            } else if (num % 3 == 0) {
                a3.add(num);
            } else aother.add(num);

        }
        System.out.println("Делятся на 2 " + a2);
        System.out.println("Делятся на 3 " + a3);
        System.out.println("Не Делятся на 2 и 3 " + aother);


    }

}


