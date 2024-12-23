
public class Sudoku {

    public static void main(String[] args) {
        char[][] char2DArray = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        System.out.println(isValidSudoku(char2DArray));
    }

    static public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] clo = new boolean[9][9];
        boolean[][] box = new boolean[9][9];

        // for (int i = 0; i < 9; i++) {
        //     for (int j = 0; j < 9; j++) {

        //         char ch = board[i][j];
        //         if (ch == '.') {
        //             continue;
        //         }

        //         int boxI = (i / 3) * 3 + (j / 3);
        //         int index = ch - '1';
        //         if (row[i][index] || clo[j][index] || box[boxI][index]) {
        //             return false;
        //         }
        //         row[i][index] = true;
        //         clo[j][index] = true;
        //         box[boxI][index] = true;

        //     }
        // }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];

               
                int boxI = (i / 3) * 3 + (j / 3);
                 int index = ch - '1';

                if (row[i][index] || clo[j][index] || box[boxI][index]) {
                    return false;
                }
                row[i][index] = true;
                clo[j][index] = true;
                box[boxI][index] = true;

            }
        }

        return true;
    }

}