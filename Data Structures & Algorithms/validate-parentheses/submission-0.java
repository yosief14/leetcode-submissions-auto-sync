class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> mapOfParen = Map.of('}', '{', ']', '[', ')', '(');
        List<Character> parenStack = new ArrayList<>();
        int head;

        for (char c : s.toCharArray()) {

                System.out.println(parenStack);
            if (c == '{' || c == '[' || c == '(') {
                parenStack.add(c);

            } else {
                // check that the last item on the stack is matches

                head = parenStack.size() - 1;

                if (parenStack.isEmpty() || parenStack.get(head)!= mapOfParen.get(c)) {

                    return false;
                }
                parenStack.remove(head);
            }
        }

        // System.out.println(parenStack);
        return parenStack.isEmpty();
    }
}
