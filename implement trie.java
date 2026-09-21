class Trie {
     private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfeWord = false;  
    }
    private final TrieNode root;

    public Trie() {
        root = new TrieNode();  
    }
    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfeWord = true;
    }
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEndOfeWord;    
    }
    public boolean startsWith(String prefix) {
         return searchPrefix(prefix) != null;    
    }
     private TrieNode searchPrefix(String str) {
        TrieNode current = root;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = ch - 'a';
            if (current.children[index] == null) {
                return null;
            }
            current = current.children[index];
        }
        return current;
    }
}
 */
