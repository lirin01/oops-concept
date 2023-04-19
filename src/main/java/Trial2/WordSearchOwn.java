package Trial2;

class search{
    static void word(char[][] grid,String[] words){
        boolean flag=false;
        for(String word:words){
            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col <grid[0].length; col++) {
                    if((String.valueOf(grid[row][col])).equalsIgnoreCase(String.valueOf(word.charAt(0)))){
//                        System.out.println("index                    : "+"("+row+","+col+")");
                        fullword(0,row,col,grid,word,flag);
                    }
                }
            }
        }
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col]+" ");
            }
            System.out.println();
        }
    }
    static boolean fullword(int index,int row,int col,char[][] grid,String word,boolean flag){
        if(index== word.length()){
            return true;
        }
        if(row<0 || col <0 || row== grid.length || col==grid[0].length || !(String.valueOf(grid[row][col])).equalsIgnoreCase(String.valueOf(word.charAt(index)))){
            return false;
        }
        if(((int)grid[row][col])>=65 && ((int)grid[row][col])<=90) //To check if the existing value is capital or not
        {
            flag=true;
//            System.out.println("checker : "+"("+row+","+col+")"+"------>"+grid[row][col]+"*********"+flag);
        }
        if(((((grid[row][col])-32)>=65 && ((grid[row][col])-32)<=90))){ //to check if the symbols do not end up before the uppercase alphabets
//            System.out.println("solve : "+((int)grid[row][col]));
            grid[row][col]=(char)((grid[row][col])-32);
//            System.out.println("1 : "+grid[row][col]+"("+row+","+col+")");
        }
        if(fullword(index+1,row+1,col,grid,word,flag)){
            return true;
        }
        if(fullword(index+1,row,col+1,grid,word,flag)){
            return true;
        }
        if((((((grid[row][col])+32)>=97 && ((grid[row][col])+32)<=122)))){ //to check if the symbols do not end up with values after lowercase alphabets
//            System.out.println(":::::::::::::::"+flag);
            if(!flag){
                grid[row][col]=(char)((grid[row][col])+32);
//                System.out.println("2 : "+grid[row][col]+"("+row+","+col+")");
            }
        }
        return false;
    }
}
public class WordSearchOwn {
    public static void main(String[] args) {
//        char[][] grid={{'a','p','p','l','e'},
//                        {'n','e','a','r','d'},
//                        {'t','n','n','e','i'},
//                        {'w','e','l','l','u'},
//                        {'a','d','w','u','e'}};
//        String[] words={"apple","ant","pen"};
        char[][] grid={{'b','l','u','e','c','a'},
                {'o','a','h','d','q','p'},
                {'x','c','r','o','w','p'},
                {'d','o','p','g','x','l'},
                {'s','w','h','i','t','e'}
        };
        String[] words={"apple","white","crow","blue","box","dog"};
        search.word(grid,words);
    }
}

//|| ((((grid[row][col])-32)>=97 && ((grid[row][col])-32)<=122))
//((((grid[row][col])+32)>=65 && ((grid[row][col])+32)<=90))||