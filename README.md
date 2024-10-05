# Sudoku Resolver

## Overview

This project provides a simple command-line application to solve Sudoku puzzles using Java. The `SudokuResolver` package contains the implementation of a Sudoku solver, which initializes a grid with predefined values, solves the puzzle, and prints the solution to the console.

## Features

- Initializes a 9x9 Sudoku grid with some predefined numbers.
- Uses a backtracking algorithm to solve the Sudoku puzzle.
- Displays the solved grid in a user-friendly format.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE or text editor for Java development (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. Clone the repository or download the source code.
2. Open the project in your preferred IDE.
3. Ensure all dependencies are properly configured (if applicable).

### Running the Application

To run the Sudoku resolver, execute the `main` method in the `Main` class. The application will:

- Set up the initial grid.
- Solve the Sudoku puzzle.
- Print the solved grid to the console.

### Code Structure

- **Main Class**: Initializes the Sudoku grid, invokes the solver, and handles output.
- **SolveSudoku Interface**: Defines methods for setting the grid and solving the puzzle.
- **SolveSudokuImpl Class**: Implements the solving logic for the Sudoku puzzle.

## Example Grid

The initial grid used in this implementation is:

```
0 1 6 0 2 0 0 4 0
0 0 3 0 0 5 0 0 0
0 9 0 0 0 0 0 0 0
0 0 0 0 8 3 7 9 0
2 0 9 0 0 0 0 1 0
0 4 7 2 0 9 0 0 0
0 0 0 0 0 0 3 0 5
1 3 0 0 0 0 8 0 4
4 0 0 5 0 0 0 0 0
```

## Performance

The application measures and prints the time taken to solve the puzzle in milliseconds.

## License

This project is open source and available under the [MIT License](LICENSE).

## Author

Created by Rickard on December 5, 2017. For any inquiries or contributions, please feel free to reach out!
