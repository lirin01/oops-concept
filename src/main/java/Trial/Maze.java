package Trial;

public class Maze {
    final static int n=5;

    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0,1},
                {1, 1, 1, 0,1},
                {1, 0, 1, 1,1},
                {1, 0, 1, 1,0},
                {0, 1, 1, 1,1},
        };
        printMazePath(maze);
    }
    public static void printPath(int[][] mat) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }

            System.out.println();
        }
    }
    public static void printMazePath(int[][] maze) {
        int[][] finalPath = new int[n][n];
        if(!mazePath(maze, 0, 0, finalPath)) {
            System.out.println("no path");
        }

        printPath(finalPath);
    }
    public static Boolean mazePath(int[][] maze,int x, int y,int[][] sol){
        if(x==n-1 && y==n-1 && maze[x][y] == 1){
            sol[x][y]=1;
            return true;
        }
        if(isSafe(maze, x, y)){
            sol[x][y]=1;

            if(mazePath(maze,x+1,y,sol)){
                return true;
            }

            if(mazePath(maze,x,y+1,sol)){
                return true;
            }
            sol[x][y]=0;
        }
        return false;
    }

    public static Boolean isSafe(int[][] maze,int x,int y){
        if(x>=0 && y>=0 && x<=(n-1) && y<=(n-1) && maze[x][y]==1){
            return true;
        }
        return false;
    }


}
