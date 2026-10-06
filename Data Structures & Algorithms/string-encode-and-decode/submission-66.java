class Solution {
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String s : strs) {
            encoded.append(s.length()).append('#').append(s);
        }
        System.out.println(encoded.toString());
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList();
        int i = 0;
        StringBuilder tokenLength = new StringBuilder();
        while (i < str.length()) {
            // clear string builder
            tokenLength.setLength(0);
            int j = i;
            while (str.charAt(j) != '#') {
                tokenLength.append(str.charAt(j));

            System.out.println("char: " + str.charAt(j) +  ", tokenLength: " + tokenLength );
                j++;
            }

            int start = j + 1;
            int end = start + Integer.parseInt(tokenLength.toString());
            
            // System.out.println()
            System.out.println("start: " + start + ", end: " + end + "tokenLength: " + tokenLength );
            // System.out.println(str.substring(start, end));
            result.add(str.substring(start, end));
            i = end;
        }

        return result; 
    }
}
