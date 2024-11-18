class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        List<Integer> ans = new ArrayList<>();
        for (int p = 0; p < puzzles.length;p++) {
            int count = 0;
            for (int w = 0; w < words.length;w++) {
                Boolean condition = true;
                for (int i = 0; i < words[w].length();i++) {
                   if (puzzles[p].indexOf(words[w].charAt(i)) == -1) {
                        condition = false;
                   }
                }
                if (condition && words[w].indexOf(puzzles[p].charAt(0)) != -1) {
                    count++;
                }
            }
            ans.add(count);
        }
        return ans;
    }
}
