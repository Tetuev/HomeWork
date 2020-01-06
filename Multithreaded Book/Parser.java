import java.util.LinkedList;
import java.util.TreeMap;

class Parser implements Runnable{
    LinkedList<String> words;
    TreeMap<String, Integer> wordCount;

    public Parser(LinkedList<String> words, TreeMap<String, Integer> wordCount) {
        this.words = words;
        this.wordCount =wordCount;
    }

    synchronized void moveToCount(){
        while(!words.isEmpty()){
            String word = words.poll();
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else{
                wordCount.put(word, 1);
            }

        }

    }
    @Override
    public void run() {
        moveToCount();
    }
}
