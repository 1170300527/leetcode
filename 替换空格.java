class Solution {
    public String replaceSpace(String s) {
        char[] string = new char[s.length()*3];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i)
            if (c == ' ') {
                string[size++] = '%';
                string[size++] = '2';
                string[size++] = '0';
            } else {
                string[size++] = c;
            }
        }
        return new String(string, 0, size);
    }
}