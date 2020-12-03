package blogpost;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    List<BlogPost> blogPostList = new ArrayList<>();

    public void add(BlogPost post) {
        blogPostList.add(post);
    }

    public void delete(int index) {
        blogPostList.remove(index);
    }

    public void update(int index, BlogPost post) {
        blogPostList.get(index).authorName = post.authorName;
        blogPostList.get(index).title = post.title;
        blogPostList.get(index).text = post.text;
        blogPostList.get(index).publicationDate = post.publicationDate;
    }

}
