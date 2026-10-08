class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int counter = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (counter > 0) result.append(c); 
                counter++;
            } else {
                counter--;
                if (counter > 0) result.append(c);
            }
        }

        return result.toString();
        
    }
}