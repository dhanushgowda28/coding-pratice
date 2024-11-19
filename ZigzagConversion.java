public class ZigzagConversion {

    public static void main(String[] args) {
      System.out.println(convert("PAYPALISHIRING", 3));
    }

   static public String convert(String s, int numRows) {
        // Edge case: If numRows is 1, return the string itself
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Create an array of StringBuilder to store the rows
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Traverse through each character in the string
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // If we're at the top or bottom row, reverse the direction
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move up or down to the next row
            currentRow += goingDown ? 1 : -1;
        }

        // Build the final string by concatenating all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

}
