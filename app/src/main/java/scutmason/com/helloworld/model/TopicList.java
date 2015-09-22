
package scutmason.com.helloworld.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TopicList {

    @SerializedName("can_create_topic")
    @Expose
    private Boolean canCreateTopic;
    @SerializedName("more_topics_url")
    @Expose
    private String moreTopicsUrl;
    @SerializedName("draft")
    @Expose
    private Object draft;
    @SerializedName("draft_key")
    @Expose
    private String draftKey;
    @SerializedName("draft_sequence")
    @Expose
    private Integer draftSequence;
    @SerializedName("per_page")
    @Expose
    private Integer perPage;
    @SerializedName("topics")
    @Expose
    private List<Topic> topics = new ArrayList<Topic>();

    /**
     * 
     * @return
     *     The canCreateTopic
     */
    public Boolean getCanCreateTopic() {
        return canCreateTopic;
    }

    /**
     * 
     * @param canCreateTopic
     *     The can_create_topic
     */
    public void setCanCreateTopic(Boolean canCreateTopic) {
        this.canCreateTopic = canCreateTopic;
    }

    /**
     * 
     * @return
     *     The moreTopicsUrl
     */
    public String getMoreTopicsUrl() {
        return moreTopicsUrl;
    }

    /**
     * 
     * @param moreTopicsUrl
     *     The more_topics_url
     */
    public void setMoreTopicsUrl(String moreTopicsUrl) {
        this.moreTopicsUrl = moreTopicsUrl;
    }

    /**
     * 
     * @return
     *     The draft
     */
    public Object getDraft() {
        return draft;
    }

    /**
     * 
     * @param draft
     *     The draft
     */
    public void setDraft(Object draft) {
        this.draft = draft;
    }

    /**
     * 
     * @return
     *     The draftKey
     */
    public String getDraftKey() {
        return draftKey;
    }

    /**
     * 
     * @param draftKey
     *     The draft_key
     */
    public void setDraftKey(String draftKey) {
        this.draftKey = draftKey;
    }

    /**
     * 
     * @return
     *     The draftSequence
     */
    public Integer getDraftSequence() {
        return draftSequence;
    }

    /**
     * 
     * @param draftSequence
     *     The draft_sequence
     */
    public void setDraftSequence(Integer draftSequence) {
        this.draftSequence = draftSequence;
    }

    /**
     * 
     * @return
     *     The perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    /**
     * 
     * @param perPage
     *     The per_page
     */
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    /**
     * 
     * @return
     *     The topics
     */
    public List<Topic> getTopics() {
        return topics;
    }

    /**
     * 
     * @param topics
     *     The topics
     */
    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

}
