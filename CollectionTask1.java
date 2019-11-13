import java.util.LinkedList;
import java.util.Scanner;
public class CollectionTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        s4 = sc.nextLine();
        s5 = sc.nextLine();
        s6 = sc.nextLine();
        s7 = sc.nextLine();
        s8 = sc.nextLine();
        s9 = sc.nextLine();
        s10 = sc.nextLine();

        LinkedList<String> m = new LinkedList<String>();
        m.add(s1);
        m.add(s2);
        m.add(s3);
        m.add(s4);
        m.add(s5);
        m.add(s6);
        m.add(s7);
        m.add(s8);
        m.add(s9);
        m.add(s10);

        for (int i = 0; i < 10; i++) {
            int len = m.get(i).length();
            int lennext = m.get(i+1).length();
            System.out.println("Длина " + i +" строки: " + len);
            System.out.println("Длина " + (i+1) + " строки: " + lennext);
            System.out.println("Список строк: " + m);
            if (lennext < len) {
                System.out.println("Длина последней строки меньше, номер элемента: " + (i+1));
                break;
          }
        }

    }
}
