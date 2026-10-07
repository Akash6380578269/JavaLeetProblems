class Solution {
    public String decodeString(String s) {
        
       Stack<Integer> num= new Stack<>();
        Stack<String> str = new Stack<>();

       
        String current = "";
        int number = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch- '0');
            }

            else if (ch == '[') {

               
                num.push(number);
                str.push(current);

                number = 0;
                current = "";

            }

            else if (ch == ']') {

                int count = num.pop();
                String prev = str.pop();
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < count; j++) {
                    sb.append(current);
                }
                current = prev + sb.toString();

            }
            
             else {
                current += ch;
            }
        }

        return current;
    }

}