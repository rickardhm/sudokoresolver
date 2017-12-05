package se.rihi.sudokoresolver.application;

import org.junit.Before;
import org.junit.Test;
import se.rihi.sudokuresolver.domain.SolveSudoku;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Rickard on 2017-12-04.
 */
public class SolveSudokuImplTest {

    SolveSudoku sudoku = new SolveSudokuImpl();

    int[][] grid = new int[][] {
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

    String[][] cells = new String[9][9];

    @Before
    public void setUp() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y< 9; y++) {
                cells[x][y] = String.valueOf(grid[x][y]);
            }
        }
    }

    @Test
    public void solvePuzzleTest() {
        long start = System.nanoTime();
        sudoku.setGrid(grid);
        sudoku.setFields(cells);
        boolean result = sudoku.solvePuzzle(0, 0);
        printGrid();
        assertEquals(true, result);
        System.out.println(System.nanoTime() - start);
    }

    @Test
    public void isInRowTest() {
        int[][] grid = new int[][] {
                {5,9,4, 6,2,7, 7,6,2},
                {0,0,0, 0,0,0, 0,0,0},
                {0,0,0, 0,0,0, 0,0,0},

                {0,0,0, 0,0,0, 0,0,0},
                {0,0,0, 0,0,0, 0,0,0},
                {0,0,0, 0,0,0, 0,0,0},

                {0,0,0, 0,0,0, 0,0,0},
                {0,0,0, 0,0,0, 0,0,0},
                {0,0,0, 0,0,0, 0,0,0}
        };
        sudoku.setGrid(grid);
        boolean result = sudoku.isInRow(0, 0, 7);
        assertEquals(true, result);
    }

    @Test
    public void isInBoxTest() {
        sudoku.setGrid(grid);
        boolean result = sudoku.isInBox(5, 0, 6);
        assertEquals(false, result);
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