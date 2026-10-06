class Solution {
    public boolean isValidSudoku(char[][] board) {
        /*
        3 hash maps to store freq ( row, column, box)
        row key = index of char[]
        column key  = index char[][j]
        box key =
        [0-2][1-3][4-6] i/3 j/3 00
        [1-3][]
        */

        Map<String, Map<Character, Integer>> row = new HashMap();
        Map<String, Map<Character, Integer>> column = new HashMap();
        Map<String, Map<Character, Integer>> box = new HashMap();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char character = board[i][j];

                String rowKey = String.valueOf(i);
                String columnKey = String.valueOf(j);

                int boxKeyPrefix = i / 3;
                int boxKeyPostFix = j / 3;
                String boxKey = "" + boxKeyPrefix + boxKeyPostFix;

                if (character == '.') {
                    continue;
                }
                row.computeIfAbsent(rowKey, k -> new HashMap<>());
                column.computeIfAbsent(columnKey, k -> new HashMap<>());
                box.computeIfAbsent(boxKey, k -> new HashMap<>());
                if (row.get(rowKey).containsKey(character)) {
                    return false;
                }

                if (column.get(columnKey).containsKey(character)) {
                    return false;
                }

                if (box.get(boxKey).containsKey(character)) {
                    return false;
                }

                row.get(rowKey).put(character, 1);
                column.get(columnKey).put(character, 1);
                box.get(boxKey).put(character, 1);
            }
        }

        return true;
    }
}

// System.out.println("rowkey:" + rowKey + ", columnKey: " + columnKey
//     + ", boxkey: " + boxKey + ", char: " + String.valueOf(character)
//     + ", i:  " + i + ", j: " + j);
// System.out.println("" + row.get(rowKey));
// System.out.println(column.get(columnKey));
// System.out.println(box.get(boxKey));