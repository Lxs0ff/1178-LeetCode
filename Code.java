class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        List<Integer> ans = new ArrayList<>();
        Boolean condition = true;
        for (String p: puzzles) {
            int count = 0;
            for (String w: words) {
                condition = true;
                for (char i : w.toCharArray()) {
                   if (p.indexOf(i) == -1) {
                        condition = false;
                   }
                }
                if (condition && w.indexOf(p.charAt(0)) != -1) {
                    count++;
                }
            }
            ans.add(count);
        }
        return ans;
    }
}
