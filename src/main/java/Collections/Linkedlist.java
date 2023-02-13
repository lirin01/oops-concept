package Collections;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args){
        LinkedList<Integer> linkedList=new LinkedList<>();
        for(int i=1;i<=10;i++){
            linkedList.add(i);
        }
        linkedList.forEach(a-> System.out.println(a));
    }
}
