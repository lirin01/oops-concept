//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
////class Demo{
////    public static void main(String[] args) {
////        while(true){
////            Scanner scan=new Scanner(System.in);
//////            Pattern pattern= Pattern.compile("",Pattern.CASE_INSENSITIVE);
//////            Matcher matcher= pattern.matcher(scan.nextLine());
////        System.out.println(Pattern.matches("f",scan.nextLine()));
//////            System.out.println(matcher.find());
////        }
////    }
////}
//// Java program for the above approach
//import java.util.*;
//class GFG {
//    public static void main(String[] args) {
////        char[][] grid=new char[10][10];
////        grid[0][0]='z';
////        int row=0;
////        int col=0;
//////        if((String.valueOf(a[0][0])).equalsIgnoreCase(String.valueOf((char)((a[0][0])-32)))){
//////            System.out.println("done");
//////        }
//////        if(((int)a[0][0])>=65 && ((int)a[0][0])<=90){
//////            System.out.println((int)a[0][0]);
//////            System.out.println("checker");
//////
//////        }
////        if(((int)grid[row][col])>=65 && ((int)grid[row][col])<=90){
////            System.out.println("checker : "+"("+row+","+col+")");
////        }
//
//    }
//}


import java.util.*;
class CrossWordSolver {
    public static void main(String[] args) {
                char[][] grid={{'a','p','p','l','e'},
                        {'n','e','a','r','d'},
                        {'t','n','n','e','i'},
                        {'w','e','l','l','u'},
                        {'a','d','w','u','e'}};
                List<String> words=new ArrayList<>();
                words.add("apple");
                words.add("ant");
                words.add("pen");
                words.add("well");
//                        {"apple","ant","pen"};
//        String[] words=
        CrossWordSolver crossWordSolver=new CrossWordSolver(grid,words);
        crossWordSolver.solveCrossword();
    }
    private char[][] crossword;
    private List<String> words;
    private char[][] updatedCrossword;
    public CrossWordSolver(char[][] crossword, List<String> words) {
        this.crossword = crossword;
        this.words = words;
        updatedCrossword = new char[crossword.length][crossword[0].length];
        for (int i = 0; i < crossword.length; i++)
            for (int j = 0; j < crossword[0].length; j++)
                updatedCrossword[i][j] = crossword[i][j];
    }
    public void solveCrossword() {
        if (solveHelper(0)) printCrossword();
        else System.out.println("No solution found.");
    }
    private boolean solveHelper(int wordIndex) {
        if (wordIndex >= words.size()) return true;
        String word = words.get(wordIndex);
        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword[0].length; j++) {
                if (crossword[i][j] == word.charAt(0) && canPlaceWord(word, i, j, true)) {
                    char[][] newCrossword = updateCrossword(updatedCrossword, word, i, j, true);
                    if (solveHelper(wordIndex + 1)) {
                        crossword = newCrossword;
                        return true;
                    }
                }
                if (crossword[i][j] == word.charAt(0) && canPlaceWord(word, i, j, false)) {
                    char[][] newCrossword = updateCrossword(updatedCrossword,word, i, j, false);
                    if (solveHelper(wordIndex + 1)) {
                        crossword = newCrossword;
                        return true;
                    }
                }
            }
        }return false;
    }
    private boolean canPlaceWord(String word, int row, int col, boolean isHorizontal) {
        if (isHorizontal && col + word.length() > crossword[0].length) return false;
        if (!isHorizontal && row + word.length() > crossword.length) return false;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int r = isHorizontal ? row : row + i;
            int c1 = isHorizontal ? col + i : col;
            if (crossword[r][c1] != c) return false;
        }return true;
    }
    private char[][] updateCrossword(char[][] updatedCrossword,String word, int row, int col, boolean isHorizontal) {
        if (isHorizontal) for (int i = 0; i < word.length(); i++) updatedCrossword[row][col + i] = (char)(word.charAt(i)-32);
        else for (int i = 0; i < word.length(); i++) updatedCrossword[row + i][col] = (char)(word.charAt(i)-32);
        return updatedCrossword;
    }
    private void printCrossword() {
        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword[0].length; j++) System.out.print(crossword[i][j] + " ");
            System.out.println();
        }
    }
}