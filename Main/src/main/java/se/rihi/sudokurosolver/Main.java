package se.rihi.sudokurosolver;

import se.rihi.sudokoresolver.application.SolveSudokuImpl;
import se.rihi.sudokuresolver.domain.SolveSudoku;

import java.util.Calendar;

/**
 * Created by Rickard on 2017-12-05.
 */
public class Main {

    private SolveSudoku sudoku;

    private int[][] grid = new int[][] {
            { 0, 1, 6, 0, 2, 0, 0, 4, 0} ,
            { 0, 0, 3, 0, 0, 5, 0, 0, 0} ,
            { 0, 9, 0, 0, 0, 0, 0, 0, 0} ,
            { 0, 0, 0, 0, 8, 3, 7, 9, 0} ,
            { 2, 0, 9, 0, 0, 0, 0, 1, 0} ,
            { 0, 4, 7, 2, 0, 9, 0, 0, 0} ,
            { 0, 0, 0, 0, 0, 0, 3, 0, 5} ,
            { 1, 3, 0, 0, 0, 0, 8, 0, 4} ,
            { 4, 0, 0, 5, 0, 0, 0, 0, 0}
    };

    private String[][] cells = new String[9][9];

    public Main() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y< 9; y++) {
                cells[x][y] = String.valueOf(grid[x][y]);
            }
        }
        sudoku = new SolveSudokuImpl();
    }
    public static void main(String[] args) {
//        long start = System.nanoTime();
        Calendar start = Calendar.getInstance();
        Main main = new Main();
        main.sudoku.setGrid(main.grid);
        main.sudoku.setFields(main.cells);
        main.sudoku.solvePuzzle(0,0);
        main.printGrid();

        Calendar now = Calendar.getInstance();
        now.setTimeInMillis(now.getTimeInMillis() - start.getTimeInMillis());
        System.out.println(now.get(Calendar.MILLISECOND));
//        System.out.println(System.nanoTime() - start);
    }

    private void printGrid() {
        for (int row = 0; row < 9; row++) {
            for (int cell = 0; cell < 9; cell++) {
                System.out.print(sudoku.getFields()[row][cell] + " ");
            }
            System.out.println();
        }
    }
}
