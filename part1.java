class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        List<Integer> ans = new ArrayList<>();
        for (int p = 0; p < puzzles.length;p++) {
            int count = 0;
            for (int w = 0; w < words.length;w++) {
                List<Character> chars = new ArrayList<>();
                for (int i = 0; i < words[w].length();i++) {
                    if (!chars.contains(words[w].charAt(i))){
                        chars.add(words[w].charAt(i));
                    }
                }
                String puzzle = puzzles[p];
                for (int q = 0; q < puzzle.length(); q++) {
                    if (chars.contains(puzzle.charAt(q))){
                        chars.remove(chars.indexOf(puzzle.charAt(q)));
                    }
                }
                if (chars.size() == 0 && words[w].indexOf(puzzles[p].charAt(0)) != -1) {
                    count++;
                }
            }
            ans.add(count);
        }
        return ans;
    }
}
