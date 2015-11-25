package scutmason.com.helloworld.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import java.util.ArrayList;
import java.util.List;

public class Post {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("avatar_template")
    @Expose
    private String avatarTemplate;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("cooked")
    @Expose
    private String cooked;
    @SerializedName("post_number")
    @Expose
    private Integer postNumber;
    @SerializedName("post_type")
    @Expose
    private Integer postType;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("reply_count")
    @Expose
    private Integer replyCount;
    @SerializedName("reply_to_post_number")
    @Expose
    private Integer replyToPostNumber;
    @SerializedName("quote_count")
    @Expose
    private Integer quoteCount;
    @SerializedName("avg_time")
    @Expose
    private Integer avgTime;
    @SerializedName("incoming_link_count")
    @Expose
    private Integer incomingLinkCount;
    @SerializedName("reads")
    @Expose
    private Integer reads;
    @SerializedName("score")
    @Expose
    private Double score;
    @SerializedName("yours")
    @Expose
    private Boolean yours;
    @SerializedName("topic_id")
    @Expose
    private Integer topicId;
    @SerializedName("topic_slug")
    @Expose
    private String topicSlug;
    @SerializedName("display_username")
    @Expose
    private String displayUsername;
    @SerializedName("primary_group_name")
    @Expose
    private Object primaryGroupName;
    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("can_edit")
    @Expose
    private Boolean canEdit;
    @SerializedName("can_delete")
    @Expose
    private Boolean canDelete;
    @SerializedName("can_recover")
    @Expose
    private Boolean canRecover;
    @SerializedName("link_counts")
    @Expose
    private List<LinkCount> linkCounts = new ArrayList<LinkCount>();
    @SerializedName("read")
    @Expose
    private Boolean read;
    @SerializedName("user_title")
    @Expose
    private Object userTitle;
    @SerializedName("actions_summary")
    @Expose
    private List<Object> actionsSummary = new ArrayList<Object>();
    @SerializedName("moderator")
    @Expose
    private Boolean moderator;
    @SerializedName("admin")
    @Expose
    private Boolean admin;
    @SerializedName("staff")
    @Expose
    private Boolean staff;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("hidden")
    @Expose
    private Boolean hidden;
    @SerializedName("hidden_reason_id")
    @Expose
    private Object hiddenReasonId;
    @SerializedName("trust_level")
    @Expose
    private Integer trustLevel;
    @SerializedName("deleted_at")
    @Expose
    private Object deletedAt;
    @SerializedName("user_deleted")
    @Expose
    private Boolean userDeleted;
    @SerializedName("edit_reason")
    @Expose
    private Object editReason;
    @SerializedName("can_view_edit_history")
    @Expose
    private Boolean canViewEditHistory;
    @SerializedName("wiki")
    @Expose
    private Boolean wiki;
    @SerializedName("reply_to_user")
    @Expose
    private ReplyToUser replyToUser;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username
     *     The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * @return
     *     The avatarTemplate
     */
    public String getAvatarTemplate() {
        return avatarTemplate;
    }

    /**
     * 
     * @param avatarTemplate
     *     The avatar_template
     */
    public void setAvatarTemplate(String avatarTemplate) {
        this.avatarTemplate = avatarTemplate;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The cooked
     */
    public String getCooked() {
        return cooked;
    }

    /**
     * 
     * @param cooked
     *     The cooked
     */
    public void setCooked(String cooked) {
        this.cooked = cooked;
    }

    /**
     * 
     * @return
     *     The postNumber
     */
    public Integer getPostNumber() {
        return postNumber;
    }

    /**
     * 
     * @param postNumber
     *     The post_number
     */
    public void setPostNumber(Integer postNumber) {
        this.postNumber = postNumber;
    }

    /**
     * 
     * @return
     *     The postType
     */
    public Integer getPostType() {
        return postType;
    }

    /**
     * 
     * @param postType
     *     The post_type
     */
    public void setPostType(Integer postType) {
        this.postType = postType;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 
     * @return
     *     The replyCount
     */
    public Integer getReplyCount() {
        return replyCount;
    }

    /**
     * 
     * @param replyCount
     *     The reply_count
     */
    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    /**
     * 
     * @return
     *     The replyToPostNumber
     */
    public Integer getReplyToPostNumber() {
        return replyToPostNumber;
    }

    /**
     * 
     * @param replyToPostNumber
     *     The reply_to_post_number
     */
    public void setReplyToPostNumber(Integer replyToPostNumber) {
        this.replyToPostNumber = replyToPostNumber;
    }

    /**
     * 
     * @return
     *     The quoteCount
     */
    public Integer getQuoteCount() {
        return quoteCount;
    }

    /**
     * 
     * @param quoteCount
     *     The quote_count
     */
    public void setQuoteCount(Integer quoteCount) {
        this.quoteCount = quoteCount;
    }

    /**
     * 
     * @return
     *     The avgTime
     */
    public Integer getAvgTime() {
        return avgTime;
    }

    /**
     * 
     * @param avgTime
     *     The avg_time
     */
    public void setAvgTime(Integer avgTime) {
        this.avgTime = avgTime;
    }

    /**
     * 
     * @return
     *     The incomingLinkCount
     */
    public Integer getIncomingLinkCount() {
        return incomingLinkCount;
    }

    /**
     * 
     * @param incomingLinkCount
     *     The incoming_link_count
     */
    public void setIncomingLinkCount(Integer incomingLinkCount) {
        this.incomingLinkCount = incomingLinkCount;
    }

    /**
     * 
     * @return
     *     The reads
     */
    public Integer getReads() {
        return reads;
    }

    /**
     * 
     * @param reads
     *     The reads
     */
    public void setReads(Integer reads) {
        this.reads = reads;
    }

    /**
     * 
     * @return
     *     The score
     */
    public Double getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * 
     * @return
     *     The yours
     */
    public Boolean getYours() {
        return yours;
    }

    /**
     * 
     * @param yours
     *     The yours
     */
    public void setYours(Boolean yours) {
        this.yours = yours;
    }

    /**
     * 
     * @return
     *     The topicId
     */
    public Integer getTopicId() {
        return topicId;
    }

    /**
     * 
     * @param topicId
     *     The topic_id
     */
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    /**
     * 
     * @return
     *     The topicSlug
     */
    public String getTopicSlug() {
        return topicSlug;
    }

    /**
     * 
     * @param topicSlug
     *     The topic_slug
     */
    public void setTopicSlug(String topicSlug) {
        this.topicSlug = topicSlug;
    }

    /**
     * 
     * @return
     *     The displayUsername
     */
    public String getDisplayUsername() {
        return displayUsername;
    }

    /**
     * 
     * @param displayUsername
     *     The display_username
     */
    public void setDisplayUsername(String displayUsername) {
        this.displayUsername = displayUsername;
    }

    /**
     * 
     * @return
     *     The primaryGroupName
     */
    public Object getPrimaryGroupName() {
        return primaryGroupName;
    }

    /**
     * 
     * @param primaryGroupName
     *     The primary_group_name
     */
    public void setPrimaryGroupName(Object primaryGroupName) {
        this.primaryGroupName = primaryGroupName;
    }

    /**
     * 
     * @return
     *     The version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 
     * @return
     *     The canEdit
     */
    public Boolean getCanEdit() {
        return canEdit;
    }

    /**
     * 
     * @param canEdit
     *     The can_edit
     */
    public void setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
    }

    /**
     * 
     * @return
     *     The canDelete
     */
    public Boolean getCanDelete() {
        return canDelete;
    }

    /**
     * 
     * @param canDelete
     *     The can_delete
     */
    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    /**
     * 
     * @return
     *     The canRecover
     */
    public Boolean getCanRecover() {
        return canRecover;
    }

    /**
     * 
     * @param canRecover
     *     The can_recover
     */
    public void setCanRecover(Boolean canRecover) {
        this.canRecover = canRecover;
    }

    /**
     * 
     * @return
     *     The linkCounts
     */
    public List<LinkCount> getLinkCounts() {
        return linkCounts;
    }

    /**
     * 
     * @param linkCounts
     *     The link_counts
     */
    public void setLinkCounts(List<LinkCount> linkCounts) {
        this.linkCounts = linkCounts;
    }

    /**
     * 
     * @return
     *     The read
     */
    public Boolean getRead() {
        return read;
    }

    /**
     * 
     * @param read
     *     The read
     */
    public void setRead(Boolean read) {
        this.read = read;
    }

    /**
     * 
     * @return
     *     The userTitle
     */
    public Object getUserTitle() {
        return userTitle;
    }

    /**
     * 
     * @param userTitle
     *     The user_title
     */
    public void setUserTitle(Object userTitle) {
        this.userTitle = userTitle;
    }

    /**
     * 
     * @return
     *     The actionsSummary
     */
    public List<Object> getActionsSummary() {
        return actionsSummary;
    }

    /**
     * 
     * @param actionsSummary
     *     The actions_summary
     */
    public void setActionsSummary(List<Object> actionsSummary) {
        this.actionsSummary = actionsSummary;
    }

    /**
     * 
     * @return
     *     The moderator
     */
    public Boolean getModerator() {
        return moderator;
    }

    /**
     * 
     * @param moderator
     *     The moderator
     */
    public void setModerator(Boolean moderator) {
        this.moderator = moderator;
    }

    /**
     * 
     * @return
     *     The admin
     */
    public Boolean getAdmin() {
        return admin;
    }

    /**
     * 
     * @param admin
     *     The admin
     */
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    /**
     * 
     * @return
     *     The staff
     */
    public Boolean getStaff() {
        return staff;
    }

    /**
     * 
     * @param staff
     *     The staff
     */
    public void setStaff(Boolean staff) {
        this.staff = staff;
    }

    /**
     * 
     * @return
     *     The userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The user_id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return
     *     The hidden
     */
    public Boolean getHidden() {
        return hidden;
    }

    /**
     * 
     * @param hidden
     *     The hidden
     */
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    /**
     * 
     * @return
     *     The hiddenReasonId
     */
    public Object getHiddenReasonId() {
        return hiddenReasonId;
    }

    /**
     * 
     * @param hiddenReasonId
     *     The hidden_reason_id
     */
    public void setHiddenReasonId(Object hiddenReasonId) {
        this.hiddenReasonId = hiddenReasonId;
    }

    /**
     * 
     * @return
     *     The trustLevel
     */
    public Integer getTrustLevel() {
        return trustLevel;
    }

    /**
     * 
     * @param trustLevel
     *     The trust_level
     */
    public void setTrustLevel(Integer trustLevel) {
        this.trustLevel = trustLevel;
    }

    /**
     * 
     * @return
     *     The deletedAt
     */
    public Object getDeletedAt() {
        return deletedAt;
    }

    /**
     * 
     * @param deletedAt
     *     The deleted_at
     */
    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * 
     * @return
     *     The userDeleted
     */
    public Boolean getUserDeleted() {
        return userDeleted;
    }

    /**
     * 
     * @param userDeleted
     *     The user_deleted
     */
    public void setUserDeleted(Boolean userDeleted) {
        this.userDeleted = userDeleted;
    }

    /**
     * 
     * @return
     *     The editReason
     */
    public Object getEditReason() {
        return editReason;
    }

    /**
     * 
     * @param editReason
     *     The edit_reason
     */
    public void setEditReason(Object editReason) {
        this.editReason = editReason;
    }

    /**
     * 
     * @return
     *     The canViewEditHistory
     */
    public Boolean getCanViewEditHistory() {
        return canViewEditHistory;
    }

    /**
     * 
     * @param canViewEditHistory
     *     The can_view_edit_history
     */
    public void setCanViewEditHistory(Boolean canViewEditHistory) {
        this.canViewEditHistory = canViewEditHistory;
    }

    /**
     * 
     * @return
     *     The wiki
     */
    public Boolean getWiki() {
        return wiki;
    }

    /**
     * 
     * @param wiki
     *     The wiki
     */
    public void setWiki(Boolean wiki) {
        this.wiki = wiki;
    }

    /**
     * 
     * @return
     *     The replyToUser
     */
    public ReplyToUser getReplyToUser() {
        return replyToUser;
    }

    /**
     * 
     * @param replyToUser
     *     The reply_to_user
     */
    public void setReplyToUser(ReplyToUser replyToUser) {
        this.replyToUser = replyToUser;
    }



}
