package org.java.dsaALGO;
//Binary Search in 2D Arrays

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;

///https://www.youtube.com/watch?v=enI_KyGLYPo&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=16
public class MatrixSearch1 {
 //NOTE 1: Matrix is Sorted in Row wise
 // 2. Matrix is sorted in Column wise/
    public static void main(String[] args) {

        int arr [][] = { {10,20,30,40},
                {15,25,35, 45},
                {28, 29,37, 49},
                {33, 34,38, 50}};

        System.out.println("Row Number are :"+(arr.length));
        System.out.println("column Number in 1st Row :"+ arr[0].length);
        System.out.println( Arrays.toString(search(arr, +34)));
    }
  static int[] search(int matrix[][], int target ){

      int row= 0;
      int col = matrix.length-1;

      while(row<matrix.length && col>=0 ){
          if(matrix[row][col]==target){
              return new int [] {row,col};
          }
          if(matrix[row][col] <target){
              row++;
          }
          if(matrix[row][col]>target){
              col--;
          }

      }

return  new int [] {-1,-1};
  }

}
