package Examples;

import java.util.ArrayList;
import java.util.Collections;

class Details implements Comparable<Details>{
    String name;
    int age;
    Details(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Details o) {
        return this.name.compareTo(o.name);
    }
}
public class SortingInsideObject {
    public static void main(String[] args) {
        ArrayList<Details> a=new ArrayList<>();
        a.add(new Details("kamal",99));
        a.add(new Details("raja",45));
        a.add(new Details("khan",24));
        a.add(new Details("revin",67));
        Collections.sort(a);
        for (int i = 0; i < 4; i++) {
            System.out.println(a.get(i).name);
        }
    }
}
