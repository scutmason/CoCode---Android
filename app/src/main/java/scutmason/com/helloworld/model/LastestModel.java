
package scutmason.com.helloworld.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LastestModel {

    @SerializedName("users")
    @Expose
    private List<User> users = new ArrayList<User>();
    @SerializedName("topic_list")
    @Expose
    private TopicList topicList;

    /**
     * 
     * @return
     *     The users
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * 
     * @param users
     *     The users
     */
    public void setUsers(List<User> users) {
        this.users = users;
    }

    /**
     * 
     * @return
     *     The topicList
     */
    public TopicList getTopicList() {
        return topicList;
    }

    /**
     * 
     * @param topicList
     *     The topic_list
     */
    public void setTopicList(TopicList topicList) {
        this.topicList = topicList;
    }

}
