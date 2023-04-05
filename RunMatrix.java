//****************************************************************************
//  RunMatrix.java                       Author: Courtney Grillo
//
//  Contains method main and instination of matrix object for Matrix.java.
//****************************************************************************
import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int size;

    java.util.Scanner scan = new java.util.Scanner(System.in);

    System.out.print("Please enter an integer.");
    size = scan.nextInt();
    Matrix matrix = new Matrix(size);

    matrix.populateDefaultMatrix();
    matrix.printDefaultMatrix();
    matrix.populateMatrix();
    matrix.printMatrix();
    matrix.flipMatrix();
    matrix.printMatrix();
  }
}
