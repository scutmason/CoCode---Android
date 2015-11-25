package scutmason.com.helloworld.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import java.util.ArrayList;
import java.util.List;

public class PostStream {

    @SerializedName("posts")
    @Expose
    private List<Post> posts = new ArrayList<Post>();
    @SerializedName("stream")
    @Expose
    private List<Integer> stream = new ArrayList<Integer>();

    /**
     * 
     * @return
     *     The posts
     */
    public List<Post> getPosts() {
        return posts;
    }

    /**
     * 
     * @param posts
     *     The posts
     */
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    /**
     * 
     * @return
     *     The stream
     */
    public List<Integer> getStream() {
        return stream;
    }

    /**
     * 
     * @param stream
     *     The stream
     */
    public void setStream(List<Integer> stream) {
        this.stream = stream;
    }



}
