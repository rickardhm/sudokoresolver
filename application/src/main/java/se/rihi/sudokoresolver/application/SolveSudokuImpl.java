package se.rihi.sudokoresolver.application;

import se.rihi.sudokuresolver.domain.SolveSudoku;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rickard on 2017-12-04.
 */
public class SolveSudokuImpl implements SolveSudoku {

    private int[][] grid;
    private String[][] fields;
    private int cel = 0, row = 0;
    private Integer[] randoms = getRandoms();

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public String[][] getFields() {
        return fields;
    }

    public void setFields(String[][] fields) {
        this.fields = fields;
    }

    public boolean solvePuzzle(int row, int col) {
        if (row == 9)
            return true;

        // If this cell is already set(fixed), skip to the next cell
        if (grid[row][col] != 0) {
            if (solvePuzzle(col == 8? (row + 1): row, (col + 1) % 9))
                return true;
        } else {
            // Random numbers 1 - 9
            Integer[] randoms = getRandoms();
            for (int i = 1; i <= 9; i++) {

                // If no duplicates in this row, column, 3x3, assign the value and go to the next
                if (!isInRow(row, col, i) &&
                        !isInBox(row, col, i)) {
                    grid[row][col] = i;
                    fields[row][col] = String.valueOf(i);

                    // Move to the next cell left-to-right and top-to-bottom
                    if (solvePuzzle(col == 8? (row + 1) : row, (col + 1) % 9))
                        return true;
                    else { // Initialize the cell when backtracking (case when the value in the next cell was not valid)
                        grid[row][col] = 0;
                        fields[row][col] = ("");
                    }
                }
            }
        }

        return false;
    }

    private Integer[] getRandoms() {
        List<Integer> list = new ArrayList();
        for (int i=0; i<9; i++) {
            list.add(i + 1);
        }
//        Collections.shuffle(list);
        return (Integer[]) list.toArray(new Integer[9]);
    }

    public boolean isInRow(int row, int col, int value) {
        for (int i = 0; i < 9; i++) {
            // Don't check the same cell
                if (grid[row][i] == value)
                    return true;
                if (grid[i][col] == value)
                    return true;
        }

        return false;
    }

    public boolean isInBox(int row, int col, int value) {
        int startRow = row / 3 * 3;
        int startCol = col / 3 * 3;

        for (int i = startRow; i < startRow + 3; i++)
            for (int j = startCol; j < startCol + 3; j++) {
                if (!(i == row && j == col)) {
                    if (grid[i][j] == value){
                        return true;
                    }
                }
            }

        return false;
    }
}
