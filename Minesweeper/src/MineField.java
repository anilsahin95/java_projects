import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MineField {
    int row;
    int colum;
    String[][] minemap;
    String[][] playmap;
    int mineCount;
    Scanner input = new Scanner(System.in);

    public void play(){
        System.out.println("Welcome to Minesweeper Game");
        System.out.print("Number of Row    : ");
        row = input.nextInt();
        System.out.print("Number of Column : ");
        colum = input.nextInt();

        fieldcreator(row,colum);
        playGame();
    }


    public void fieldcreator(int x, int y){
        minemap = new String[x][y];
        playmap = new String[x][y];
        mineCount = x * y / 4;
        Random rand = new Random();

        for(int i = 0; i < x; i++){
            for(int j = 0 ; j<y ; j++){
                minemap[i][j] = " - ";
                playmap[i][j] = " - ";
            }
        }

        while (mineCount > 0){
            int k = rand.nextInt(x);
            int l = rand.nextInt(y);
            if (minemap[k][l].equals(" - ")) {

                minemap[k][l] = " * ";
                mineCount--;

            }



        }
        printMinemap();
        printPlaymap();

    }

    public void playGame() {
        boolean gameover = false;
        while (!gameover) {
            System.out.print("Enter Row number    : ");
            int enterRow = input.nextInt();
            System.out.print("Enter Column number : ");
            int enterColumn = input.nextInt();

            int mines = 0;
            if (enterRow < row && enterColumn < colum) {
                if (minemap[enterRow][enterColumn].equals(" - ") && playmap[enterRow][enterColumn].equals(" - ")) {
                    for (int i = enterRow - 1; i < enterRow + 2; i++) {
                        for (int j = enterColumn - 1; j < enterColumn + 2; j++) {
                            if (i >= 0 && j >= 0 && i < row && j < colum && minemap[i][j].equals(" * ")) {
                                mines++;
                                playmap[enterRow][enterColumn] = " " + Integer.toString(mines) + " ";
                            } else {
                                playmap[enterRow][enterColumn] = " " + Integer.toString(mines) + " ";
                            }
                        }
                    }
                    printPlaymap();
                    if (!checkWin()) {
                        System.out.println("Yesssss You won the game");
                        printMinemap();
                        gameover = true;
                    }

                } else if (minemap[enterRow][enterColumn].equals(" * ")) {
                    System.out.println("***bummm*** game over!!!");
                    printMinemap();
                    gameover = true;
                } else if (!playmap[enterRow][enterColumn].equals(" - ")) {
                    System.out.println("this cell heve been tried before,please select different cell");
                }

            }else {
                System.out.println("your selection have not found on the game table,please select cell in game table ");
            }
        }
    }

    public void printMinemap(){

        for(String[] row:minemap){
            for(String column: row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("====================");

    }

    public void printPlaymap(){
        for(String[] row:playmap){
            for(String column: row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("====================");
    }

    public boolean checkWin() {
        int count = 0;
        int mineCount = 0;
        for (int i = 0; i < playmap.length; i++) {
            for (int j = 0; j < playmap[i].length; j++) {

                if (playmap[i][j].equals(" - ")) {
                    count++;
                }
                if (minemap[i][j].equals(" * ")) {
                    mineCount++;
                }
            }
        }
        if (mineCount == count) {

            return false;
        }
        return true;
    }


}
