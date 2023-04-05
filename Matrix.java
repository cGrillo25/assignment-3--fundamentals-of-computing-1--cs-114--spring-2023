//*************************************************************************************
// Matrix.java                    Author: Courtney Grillo
//
// Prints an array that has values swapped along the diagonal.
//*************************************************************************************

public class Matrix {
  private int [][]matrix;
  private void swap(int x1, int y1, int x2, int y2) {
    int storage = 0;
    storage = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = storage;
  }

  public Matrix(int size) {
    matrix = new int [size][size];
    System.out.println();
  }

  public void populateDefaultMatrix() {
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix.length; column++) {
        matrix[row][column] = (0);
      }
    }
  }

  public void populateMatrix() {
    int cell = 1;

    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix.length; column++) {
        matrix[row][column] = (cell);
        cell ++;
      }
    }
  }

  public void printDefaultMatrix() {
    System.out.println();

    int xTracker = 0;
    int yTracker = matrix.length-1;

    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        if(row == xTracker && column == yTracker) {
          System.out.print("\u001B[33m\t" + matrix[row][column]);
        } else {
          System.out.print("\u001B[0m\t" + matrix[row][column]);
        }
      }
      xTracker++;
      yTracker--;
      System.out.println();
    }
  }

  public void printMatrix() {
    System.out.println();

    int xTracker = 0;
    int yTracker = matrix.length-1;

    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        if(row == xTracker && column == yTracker) {
          System.out.print("\u001B[33m\t" + matrix[row][column]);
        } else {
          System.out.print("\u001B[0m\t" + matrix[row][column]);
        }
      }
      xTracker++;
      yTracker--;
      System.out.println();
    }
  }

  public void flipMatrix() {
    int newRow = matrix.length;

    for(int row = 0; row < newRow; row++) {
      for(int column = 0; column < (newRow -1) - row; column++) {
        swap(row, column, newRow -1 -column, newRow -1 -row);
      }
    }
  }
}
