package Trial;

import java.util.ArrayList;

//class Check{
//    static void perform(char[] c){
//        String s="";
//        ArrayList<String> m1=new ArrayList<>();
//        for (int start = 0; start < c.length; start++) {
////            System.out.println("                                   stage 1 "+start);
//            for (int end = 0; end <c.length ; end++) {
//                s="";
////                System.out.println("                stage 2 "+end);
//                for (int i = start; i <= end; i++) {
//                    s=s+c[i];
//                }
//                if(s!=""){
//                    m1.add(s);
//                }
//            }
//        }
//        System.out.println(m1);
//
//    }
//}
public class SubSequence {

    public static void main(String[] args) {
        ArrayList<Character> b=new ArrayList<>();
        String s="abc";
        char[] c= s.toCharArray();
        f.find(0,b,c);
    }
}
class f{
    static void find(int index,ArrayList<Character> b,char[] c){
            if(index==c.length){
                System.out.println(b);
            }
            else{
                b.add(c[index]);
                find(index+1,b,c);
                b.remove(b.size()-1);
                find(index+1,b,c);
            }
    }
}