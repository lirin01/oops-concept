package Trial;

import java.util.Scanner;

class Matrix{
    static int rc;
    static int dc;
    static int lc;
    static int uc;
    static int count=1;
    public static void main(String[] args) {
        int value=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("row : ");
        int row=scan.nextInt();
        System.out.print("column : ");
        int col=scan.nextInt();
        rc=(col-1);
        dc=(row-1);
        lc=0;
        uc=1;
        int[][] m=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                m[i][j]=value++;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" "+m[i][j]);
            }
            System.out.println();
        }

        Matrix a=new Matrix();
        a.right(m,0,0,((row*col)+1));


    }
    void right(int[][] arr,int row,int col,int total){
        if(count==total);
        else if(col==rc){
            rc--;
            down(arr,row,col,total);
        }
        else{
            System.out.println(arr[row][col++]);
            count++;
            right(arr,row,col,total);
        }
    }
    void down(int[][] arr,int row,int col,int total){
        if(count==total);
        else if(row==dc){
            dc--;
            left(arr,row,col,total);
        }
        else{
            System.out.println(arr[row++][col]);
            count++;
            down(arr,row,col,total);
        }
    }
    void left(int[][] arr,int row,int col,int total){
        if(count==total);
        else if(col==lc){
            lc++;
            up(arr,row,col,total);
        }
        else{
            System.out.println(arr[row][col--]);
            count++;
            left(arr,row,col,total);
        }
    }
    void up(int[][] arr,int row,int col,int total){
        if(count==total);
        else if(row==uc){
            uc++;
            right(arr,row,col,total);
        }
        else{
            System.out.println(arr[row--][col]);
            count++;
            up(arr,row,col,total);
        }
    }
}