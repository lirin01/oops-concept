package Examples;

import java.util.ArrayList;

class InstagramPost{
    ArrayList a=new ArrayList();
    void  addPost(String postname){
        a.add(postname);
    }
    ArrayList getdata(){
        return a;
    }
}
class InstagramFeed{
    ArrayList b;
    void view(InstagramPost g){
        b=g.getdata();
        for(Object c:b){
            System.out.println(c);
        }
    }
}

public class Association {
    public static void main(String[] args) {
        InstagramPost post=new InstagramPost();
        post.addPost("photo1");
        post.addPost("photo2");
        post.addPost("photo3");
        InstagramFeed feed=new InstagramFeed();
        feed.view(post);
    }
}
