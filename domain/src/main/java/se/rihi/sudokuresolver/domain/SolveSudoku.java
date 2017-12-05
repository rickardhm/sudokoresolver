package se.rihi.sudokuresolver.domain;

/**
 * Created by Rickard on 2017-12-04.
 */
public interface SolveSudoku {

    boolean isInRow(int row, int cell, int nr);

    boolean isInBox(int row, int cell, int nr);

    boolean solvePuzzle(int row, int cell);

    int[][] getGrid();

    void setGrid(int[][] grid);

    String[][] getFields();

    void setFields(String[][] fields);

}
