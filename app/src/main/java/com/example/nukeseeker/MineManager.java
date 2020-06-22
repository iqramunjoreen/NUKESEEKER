package com.example.nukeseeker;


import java.util.Random;


public class MineManager {
    private int row = 4;
    private int column = 6;
    private int size = 24;
    private Mine[][] mines;
    //Supports Singleton class
    //Private constructor
    Random rand = new Random();

    private MineManager(){

    }

    private static MineManager instance;
    //Returns a single instance of the board
    public static MineManager getInstance(){
        if(instance==null){
            instance= new MineManager();
        }
        return instance;
    }

    //Setter and Getter for class mine manager


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Mine getMines(int x , int y) {
        return mines[x][y];
    }

    public void populateMine(){

        mines = new Mine[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mines[i][j] = new Mine(false,false);
            }
        }
        for (int i = 0; i < size; i++){
            int rownum = 0;
            int colnum = 0;
            rownum = rand.nextInt(row + 1);
            colnum = rand.nextInt(colnum + 1);
            mines[rownum][colnum] = new Mine(false,true);
        }


    }


}
