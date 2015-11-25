package scutmason.com.helloworld.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class SuggestedTopic {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("fancy_title")
    @Expose
    private String fancyTitle;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("posts_count")
    @Expose
    private Integer postsCount;
    @SerializedName("reply_count")
    @Expose
    private Integer replyCount;
    @SerializedName("highest_post_number")
    @Expose
    private Integer highestPostNumber;
    @SerializedName("image_url")
    @Expose
    private Object imageUrl;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("last_posted_at")
    @Expose
    private String lastPostedAt;
    @SerializedName("bumped")
    @Expose
    private Boolean bumped;
    @SerializedName("bumped_at")
    @Expose
    private String bumpedAt;
    @SerializedName("unseen")
    @Expose
    private Boolean unseen;
    @SerializedName("pinned")
    @Expose
    private Boolean pinned;
    @SerializedName("unpinned")
    @Expose
    private Object unpinned;
    @SerializedName("visible")
    @Expose
    private Boolean visible;
    @SerializedName("closed")
    @Expose
    private Boolean closed;
    @SerializedName("archived")
    @Expose
    private Boolean archived;
    @SerializedName("bookmarked")
    @Expose
    private Object bookmarked;
    @SerializedName("liked")
    @Expose
    private Object liked;
    @SerializedName("archetype")
    @Expose
    private String archetype;
    @SerializedName("like_count")
    @Expose
    private Integer likeCount;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("category_id")
    @Expose
    private Integer categoryId;

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
     *     The imageUrl
     */
    public Object getImageUrl() {
        return imageUrl;
    }

    /**
     * 
     * @param imageUrl
     *     The image_url
     */
    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
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
     *     The bumped
     */
    public Boolean getBumped() {
        return bumped;
    }

    /**
     * 
     * @param bumped
     *     The bumped
     */
    public void setBumped(Boolean bumped) {
        this.bumped = bumped;
    }

    /**
     * 
     * @return
     *     The bumpedAt
     */
    public String getBumpedAt() {
        return bumpedAt;
    }

    /**
     * 
     * @param bumpedAt
     *     The bumped_at
     */
    public void setBumpedAt(String bumpedAt) {
        this.bumpedAt = bumpedAt;
    }

    /**
     * 
     * @return
     *     The unseen
     */
    public Boolean getUnseen() {
        return unseen;
    }

    /**
     * 
     * @param unseen
     *     The unseen
     */
    public void setUnseen(Boolean unseen) {
        this.unseen = unseen;
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
     *     The liked
     */
    public Object getLiked() {
        return liked;
    }

    /**
     * 
     * @param liked
     *     The liked
     */
    public void setLiked(Object liked) {
        this.liked = liked;
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



}
