class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if (!st.isEmpty() && ((ch == ')' && st.peek() == '(') || (ch == ']' && st.peek() == '[') || (ch == '}' && st.peek() == '{'))){
                st.pop();
            }
            else if (ch == '[' || ch == '{' || ch == '('){
                st.push(ch);
            }
            else {
                return false;
            }
        }
        return st.isEmpty();
    }
}
