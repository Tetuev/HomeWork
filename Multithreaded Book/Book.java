import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class Book {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Роман\\IdeaProjects\\Multithreaded Book\\src\\wp.txt");

        LinkedList<String> words= new LinkedList<>();
        TreeMap<String, Integer> wordCount = new TreeMap<>();
        List<String> lines = null;
        try {
            lines = Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : lines) {
            String[] wordSplit = line.toLowerCase()
                    .replaceAll("\\p{Punct}", " ")
                    .replaceAll("\\d","")
                    .trim()
                    .split("\\s");
            for (String s : wordSplit) {
                if (s.length() > 0)
                    words.add(s.trim());
            }
        }
        int corenumber = Runtime.getRuntime().availableProcessors();
        System.out.println("Количество ядер в процессоре: " + corenumber);

        for (int i = 0; i <corenumber ; i++) {

            Thread thread = new Thread(new Parser(words, wordCount));
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(wordCount.get("the"));
        Comparator<HashMap.Entry<String,Integer>> wordComparator = new Comparator<HashMap.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o1.getValue(),o2.getValue());
            }
        };

        TreeSet<Map.Entry<String,Integer>> treeSet =new  TreeSet<Map.Entry<String,Integer>>(wordComparator);

        treeSet.addAll(wordCount.entrySet());

        for (int i = 0; i < 10; i++) {
            System.out.println(treeSet.pollLast());
        }
    }
}



