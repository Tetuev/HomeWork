import java.util.HashMap;

public class MapTask1 {
    public static void main(String[] args) {
        String[] m = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversations?".split(" ");
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        for (int i = 0; i < m.length; i++) {
            if (h.containsKey(m[i])) {
                h.replace(m[i], h.get(m[i]) + 1);
            } else {
                h.put(m[i], 1);
            }
        }
        int p = 0;
        for (String w : h.keySet()) {
            if (p < h.get(w)) {
                p = h.get(w);
            }
            System.out.println("Слово: " + w + " (встречается " + h.get(w) + " раз)");
        }
    }
}
