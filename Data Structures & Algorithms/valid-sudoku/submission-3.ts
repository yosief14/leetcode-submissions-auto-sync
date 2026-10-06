class Solution {
    /**
     * @param {character[][]} board
     * @return {boolean}
     */
    isValidSudoku(board: string[][]): boolean {
        /**
         * create hash with count of numbers if any < 1 fast fail
         * row, column, sub-box
         * create 9 additional arrays representing 3x3 board
         *  as i'm checking rows I should build the 3x3 board and the columns
         *  [i][j][k]
         *
         * check for number in each row
         *  if none put in both row, and column
         *
         * check column
         * check sub-box
         *
         *  0
         */
        const row_hash = {};
        const col_hash = {};
        const square_hash = {};

        for (let row = 0; row < board.length; row++) {
            for (let col = 0; col < board[row].length; col++) {
                // if board[row]check row, column and box
                const curChar = board[row][col];
                if (curChar !== ".") {
                    if (row + curChar in row_hash) {
                        console.log('row match: ', {row_hash, row, curChar })
                        return false;
                    } else {
                        row_hash[row + curChar] = 1;
                    }

                    if (col + curChar in col_hash) {
                        console.log('column match: ', {col_hash, col, curChar })
                        return false;
                    } else {
                        col_hash[col + curChar] = 1;
                    }

                    const subbox = Math.floor(row / 3) + "-"+ Math.floor(col / 3) ;

                    if (subbox + curChar in square_hash) {
                        console.log('square match: ', {square_hash, subbox , curChar, row, col })
                        return false;
                    } else {
                        square_hash[subbox + curChar] = 1;
                    }
                }
            }
        }
        return true;
    }
}
