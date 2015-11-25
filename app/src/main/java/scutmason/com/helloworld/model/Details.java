package scutmason.com.helloworld.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



import java.util.ArrayList;
import java.util.List;

public class Details {

    @SerializedName("auto_close_at")
    @Expose
    private Object autoCloseAt;
    @SerializedName("auto_close_hours")
    @Expose
    private Object autoCloseHours;
    @SerializedName("auto_close_based_on_last_post")
    @Expose
    private Boolean autoCloseBasedOnLastPost;
    @SerializedName("created_by")
    @Expose
    private CreatedBy createdBy;
    @SerializedName("last_poster")
    @Expose
    private LastPoster lastPoster;
    @SerializedName("participants")
    @Expose
    private List<Participant> participants = new ArrayList<Participant>();
    @SerializedName("suggested_topics")
    @Expose
    private List<SuggestedTopic> suggestedTopics = new ArrayList<SuggestedTopic>();
    @SerializedName("links")
    @Expose
    private List<Link> links = new ArrayList<Link>();
    @SerializedName("notification_level")
    @Expose
    private Integer notificationLevel;
    @SerializedName("can_flag_topic")
    @Expose
    private Boolean canFlagTopic;

    /**
     * 
     * @return
     *     The autoCloseAt
     */
    public Object getAutoCloseAt() {
        return autoCloseAt;
    }

    /**
     * 
     * @param autoCloseAt
     *     The auto_close_at
     */
    public void setAutoCloseAt(Object autoCloseAt) {
        this.autoCloseAt = autoCloseAt;
    }

    /**
     * 
     * @return
     *     The autoCloseHours
     */
    public Object getAutoCloseHours() {
        return autoCloseHours;
    }

    /**
     * 
     * @param autoCloseHours
     *     The auto_close_hours
     */
    public void setAutoCloseHours(Object autoCloseHours) {
        this.autoCloseHours = autoCloseHours;
    }

    /**
     * 
     * @return
     *     The autoCloseBasedOnLastPost
     */
    public Boolean getAutoCloseBasedOnLastPost() {
        return autoCloseBasedOnLastPost;
    }

    /**
     * 
     * @param autoCloseBasedOnLastPost
     *     The auto_close_based_on_last_post
     */
    public void setAutoCloseBasedOnLastPost(Boolean autoCloseBasedOnLastPost) {
        this.autoCloseBasedOnLastPost = autoCloseBasedOnLastPost;
    }

    /**
     * 
     * @return
     *     The createdBy
     */
    public CreatedBy getCreatedBy() {
        return createdBy;
    }

    /**
     * 
     * @param createdBy
     *     The created_by
     */
    public void setCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 
     * @return
     *     The lastPoster
     */
    public LastPoster getLastPoster() {
        return lastPoster;
    }

    /**
     * 
     * @param lastPoster
     *     The last_poster
     */
    public void setLastPoster(LastPoster lastPoster) {
        this.lastPoster = lastPoster;
    }

    /**
     * 
     * @return
     *     The participants
     */
    public List<Participant> getParticipants() {
        return participants;
    }

    /**
     * 
     * @param participants
     *     The participants
     */
    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    /**
     * 
     * @return
     *     The suggestedTopics
     */
    public List<SuggestedTopic> getSuggestedTopics() {
        return suggestedTopics;
    }

    /**
     * 
     * @param suggestedTopics
     *     The suggested_topics
     */
    public void setSuggestedTopics(List<SuggestedTopic> suggestedTopics) {
        this.suggestedTopics = suggestedTopics;
    }

    /**
     * 
     * @return
     *     The links
     */
    public List<Link> getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The notificationLevel
     */
    public Integer getNotificationLevel() {
        return notificationLevel;
    }

    /**
     * 
     * @param notificationLevel
     *     The notification_level
     */
    public void setNotificationLevel(Integer notificationLevel) {
        this.notificationLevel = notificationLevel;
    }

    /**
     * 
     * @return
     *     The canFlagTopic
     */
    public Boolean getCanFlagTopic() {
        return canFlagTopic;
    }

    /**
     * 
     * @param canFlagTopic
     *     The can_flag_topic
     */
    public void setCanFlagTopic(Boolean canFlagTopic) {
        this.canFlagTopic = canFlagTopic;
    }



}
