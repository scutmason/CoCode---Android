package scutmason.com.helloworld.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



import java.util.ArrayList;
import java.util.List;

public class TopicDetial {

    @SerializedName("post_stream")
    @Expose
    private PostStream postStream;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("fancy_title")
    @Expose
    private String fancyTitle;
    @SerializedName("posts_count")
    @Expose
    private Integer postsCount;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("reply_count")
    @Expose
    private Integer replyCount;
    @SerializedName("participant_count")
    @Expose
    private Integer participantCount;
    @SerializedName("like_count")
    @Expose
    private Integer likeCount;
    @SerializedName("last_posted_at")
    @Expose
    private String lastPostedAt;
    @SerializedName("visible")
    @Expose
    private Boolean visible;
    @SerializedName("closed")
    @Expose
    private Boolean closed;
    @SerializedName("archived")
    @Expose
    private Boolean archived;
    @SerializedName("has_summary")
    @Expose
    private Boolean hasSummary;
    @SerializedName("archetype")
    @Expose
    private String archetype;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("category_id")
    @Expose
    private Integer categoryId;
    @SerializedName("word_count")
    @Expose
    private Integer wordCount;
    @SerializedName("deleted_at")
    @Expose
    private Object deletedAt;
    @SerializedName("pending_posts_count")
    @Expose
    private Integer pendingPostsCount;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("draft")
    @Expose
    private Object draft;
    @SerializedName("draft_key")
    @Expose
    private String draftKey;
    @SerializedName("draft_sequence")
    @Expose
    private Object draftSequence;
    @SerializedName("unpinned")
    @Expose
    private Object unpinned;
    @SerializedName("pinned_globally")
    @Expose
    private Boolean pinnedGlobally;
    @SerializedName("pinned")
    @Expose
    private Boolean pinned;
    @SerializedName("pinned_at")
    @Expose
    private Object pinnedAt;
    @SerializedName("pinned_until")
    @Expose
    private Object pinnedUntil;
    @SerializedName("details")
    @Expose
    private Details details;
    @SerializedName("highest_post_number")
    @Expose
    private Integer highestPostNumber;
    @SerializedName("deleted_by")
    @Expose
    private Object deletedBy;
    @SerializedName("actions_summary")
    @Expose
    private List<ActionsSummary> actionsSummary = new ArrayList<ActionsSummary>();
    @SerializedName("chunk_size")
    @Expose
    private Integer chunkSize;
    @SerializedName("bookmarked")
    @Expose
    private Object bookmarked;
    @SerializedName("tags")
    @Expose
    private Object tags;

    /**
     *
     * @return
     *     The postStream
     */
    public PostStream getPostStream() {
        return postStream;
    }

    /**
     *
     * @param postStream
     *     The post_stream
     */
    public void setPostStream(PostStream postStream) {
        this.postStream = postStream;
    }

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
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     *     The fancyTitle
     */
    public String getFancyTitle() {
        return fancyTitle;
    }

    /**
     *
     * @param fancyTitle
     *     The fancy_title
     */
    public void setFancyTitle(String fancyTitle) {
        this.fancyTitle = fancyTitle;
    }

    /**
     *
     * @return
     *     The postsCount
     */
    public Integer getPostsCount() {
        return postsCount;
    }

    /**
     *
     * @param postsCount
     *     The posts_count
     */
    public void setPostsCount(Integer postsCount) {
        this.postsCount = postsCount;
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
     *     The views
     */
    public Integer getViews() {
        return views;
    }

    /**
     *
     * @param views
     *     The views
     */
    public void setViews(Integer views) {
        this.views = views;
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
     *     The participantCount
     */
    public Integer getParticipantCount() {
        return participantCount;
    }

    /**
     *
     * @param participantCount
     *     The participant_count
     */
    public void setParticipantCount(Integer participantCount) {
        this.participantCount = participantCount;
    }

    /**
     *
     * @return
     *     The likeCount
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     *
     * @param likeCount
     *     The like_count
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     *
     * @return
     *     The lastPostedAt
     */
    public String getLastPostedAt() {
        return lastPostedAt;
    }

    /**
     *
     * @param lastPostedAt
     *     The last_posted_at
     */
    public void setLastPostedAt(String lastPostedAt) {
        this.lastPostedAt = lastPostedAt;
    }

    /**
     *
     * @return
     *     The visible
     */
    public Boolean getVisible() {
        return visible;
    }

    /**
     *
     * @param visible
     *     The visible
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     *
     * @return
     *     The closed
     */
    public Boolean getClosed() {
        return closed;
    }

    /**
     *
     * @param closed
     *     The closed
     */
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    /**
     *
     * @return
     *     The archived
     */
    public Boolean getArchived() {
        return archived;
    }

    /**
     *
     * @param archived
     *     The archived
     */
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
     *
     * @return
     *     The hasSummary
     */
    public Boolean getHasSummary() {
        return hasSummary;
    }

    /**
     *
     * @param hasSummary
     *     The has_summary
     */
    public void setHasSummary(Boolean hasSummary) {
        this.hasSummary = hasSummary;
    }

    /**
     *
     * @return
     *     The archetype
     */
    public String getArchetype() {
        return archetype;
    }

    /**
     *
     * @param archetype
     *     The archetype
     */
    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }

    /**
     *
     * @return
     *     The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     *
     * @param slug
     *     The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     *
     * @return
     *     The categoryId
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     *
     * @param categoryId
     *     The category_id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     *
     * @return
     *     The wordCount
     */
    public Integer getWordCount() {
        return wordCount;
    }

    /**
     *
     * @param wordCount
     *     The word_count
     */
    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
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
     *     The pendingPostsCount
     */
    public Integer getPendingPostsCount() {
        return pendingPostsCount;
    }

    /**
     *
     * @param pendingPostsCount
     *     The pending_posts_count
     */
    public void setPendingPostsCount(Integer pendingPostsCount) {
        this.pendingPostsCount = pendingPostsCount;
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
    public Object getDraftSequence() {
        return draftSequence;
    }

    /**
     *
     * @param draftSequence
     *     The draft_sequence
     */
    public void setDraftSequence(Object draftSequence) {
        this.draftSequence = draftSequence;
    }

    /**
     *
     * @return
     *     The unpinned
     */
    public Object getUnpinned() {
        return unpinned;
    }

    /**
     *
     * @param unpinned
     *     The unpinned
     */
    public void setUnpinned(Object unpinned) {
        this.unpinned = unpinned;
    }

    /**
     *
     * @return
     *     The pinnedGlobally
     */
    public Boolean getPinnedGlobally() {
        return pinnedGlobally;
    }

    /**
     *
     * @param pinnedGlobally
     *     The pinned_globally
     */
    public void setPinnedGlobally(Boolean pinnedGlobally) {
        this.pinnedGlobally = pinnedGlobally;
    }

    /**
     *
     * @return
     *     The pinned
     */
    public Boolean getPinned() {
        return pinned;
    }

    /**
     *
     * @param pinned
     *     The pinned
     */
    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    /**
     *
     * @return
     *     The pinnedAt
     */
    public Object getPinnedAt() {
        return pinnedAt;
    }

    /**
     *
     * @param pinnedAt
     *     The pinned_at
     */
    public void setPinnedAt(Object pinnedAt) {
        this.pinnedAt = pinnedAt;
    }

    /**
     *
     * @return
     *     The pinnedUntil
     */
    public Object getPinnedUntil() {
        return pinnedUntil;
    }

    /**
     *
     * @param pinnedUntil
     *     The pinned_until
     */
    public void setPinnedUntil(Object pinnedUntil) {
        this.pinnedUntil = pinnedUntil;
    }

    /**
     *
     * @return
     *     The details
     */
    public Details getDetails() {
        return details;
    }

    /**
     *
     * @param details
     *     The details
     */
    public void setDetails(Details details) {
        this.details = details;
    }

    /**
     *
     * @return
     *     The highestPostNumber
     */
    public Integer getHighestPostNumber() {
        return highestPostNumber;
    }

    /**
     *
     * @param highestPostNumber
     *     The highest_post_number
     */
    public void setHighestPostNumber(Integer highestPostNumber) {
        this.highestPostNumber = highestPostNumber;
    }

    /**
     *
     * @return
     *     The deletedBy
     */
    public Object getDeletedBy() {
        return deletedBy;
    }

    /**
     *
     * @param deletedBy
     *     The deleted_by
     */
    public void setDeletedBy(Object deletedBy) {
        this.deletedBy = deletedBy;
    }

    /**
     *
     * @return
     *     The actionsSummary
     */
    public List<ActionsSummary> getActionsSummary() {
        return actionsSummary;
    }

    /**
     *
     * @param actionsSummary
     *     The actions_summary
     */
    public void setActionsSummary(List<ActionsSummary> actionsSummary) {
        this.actionsSummary = actionsSummary;
    }

    /**
     *
     * @return
     *     The chunkSize
     */
    public Integer getChunkSize() {
        return chunkSize;
    }

    /**
     *
     * @param chunkSize
     *     The chunk_size
     */
    public void setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
    }

    /**
     *
     * @return
     *     The bookmarked
     */
    public Object getBookmarked() {
        return bookmarked;
    }

    /**
     *
     * @param bookmarked
     *     The bookmarked
     */
    public void setBookmarked(Object bookmarked) {
        this.bookmarked = bookmarked;
    }

    /**
     *
     * @return
     *     The tags
     */
    public Object getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     *     The tags
     */
    public void setTags(Object tags) {
        this.tags = tags;
    }



}
