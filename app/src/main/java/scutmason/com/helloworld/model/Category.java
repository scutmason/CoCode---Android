
package scutmason.com.helloworld.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("text_color")
    @Expose
    private String textColor;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("topic_count")
    @Expose
    private Integer topicCount;
    @SerializedName("post_count")
    @Expose
    private Integer postCount;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("description_text")
    @Expose
    private String descriptionText;
    @SerializedName("topic_url")
    @Expose
    private Object topicUrl;
    @SerializedName("read_restricted")
    @Expose
    private Boolean readRestricted;
    @SerializedName("permission")
    @Expose
    private Integer permission;
    @SerializedName("notification_level")
    @Expose
    private Object notificationLevel;
    @SerializedName("logo_url")
    @Expose
    private Object logoUrl;
    @SerializedName("background_url")
    @Expose
    private Object backgroundUrl;
    @SerializedName("topic_template")
    @Expose
    private Object topicTemplate;
    @SerializedName("has_children")
    @Expose
    private Boolean hasChildren;
    @SerializedName("topics_day")
    @Expose
    private Integer topicsDay;
    @SerializedName("topics_week")
    @Expose
    private Integer topicsWeek;
    @SerializedName("topics_month")
    @Expose
    private Integer topicsMonth;
    @SerializedName("topics_year")
    @Expose
    private Integer topicsYear;
    @SerializedName("posts_day")
    @Expose
    private Integer postsDay;
    @SerializedName("posts_week")
    @Expose
    private Integer postsWeek;
    @SerializedName("posts_month")
    @Expose
    private Integer postsMonth;
    @SerializedName("posts_year")
    @Expose
    private Integer postsYear;
    @SerializedName("description_excerpt")
    @Expose
    private String descriptionExcerpt;
    @SerializedName("featured_user_ids")
    @Expose
    private List<Integer> featuredUserIds = new ArrayList<Integer>();
    @SerializedName("topics")
    @Expose
    private List<Topic> topics = new ArrayList<Topic>();
    @SerializedName("subcategory_ids")
    @Expose
    private List<Integer> subcategoryIds = new ArrayList<Integer>();
    @SerializedName("is_uncategorized")
    @Expose
    private Boolean isUncategorized;

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
     *     The color
     */
    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color
     *     The color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 
     * @return
     *     The textColor
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * 
     * @param textColor
     *     The text_color
     */
    public void setTextColor(String textColor) {
        this.textColor = textColor;
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
     *     The topicCount
     */
    public Integer getTopicCount() {
        return topicCount;
    }

    /**
     * 
     * @param topicCount
     *     The topic_count
     */
    public void setTopicCount(Integer topicCount) {
        this.topicCount = topicCount;
    }

    /**
     * 
     * @return
     *     The postCount
     */
    public Integer getPostCount() {
        return postCount;
    }

    /**
     * 
     * @param postCount
     *     The post_count
     */
    public void setPostCount(Integer postCount) {
        this.postCount = postCount;
    }

    /**
     * 
     * @return
     *     The position
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * 
     * @param position
     *     The position
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The descriptionText
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * 
     * @param descriptionText
     *     The description_text
     */
    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    /**
     * 
     * @return
     *     The topicUrl
     */
    public Object getTopicUrl() {
        return topicUrl;
    }

    /**
     * 
     * @param topicUrl
     *     The topic_url
     */
    public void setTopicUrl(Object topicUrl) {
        this.topicUrl = topicUrl;
    }

    /**
     * 
     * @return
     *     The readRestricted
     */
    public Boolean getReadRestricted() {
        return readRestricted;
    }

    /**
     * 
     * @param readRestricted
     *     The read_restricted
     */
    public void setReadRestricted(Boolean readRestricted) {
        this.readRestricted = readRestricted;
    }

    /**
     * 
     * @return
     *     The permission
     */
    public Integer getPermission() {
        return permission;
    }

    /**
     * 
     * @param permission
     *     The permission
     */
    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    /**
     * 
     * @return
     *     The notificationLevel
     */
    public Object getNotificationLevel() {
        return notificationLevel;
    }

    /**
     * 
     * @param notificationLevel
     *     The notification_level
     */
    public void setNotificationLevel(Object notificationLevel) {
        this.notificationLevel = notificationLevel;
    }

    /**
     * 
     * @return
     *     The logoUrl
     */
    public Object getLogoUrl() {
        return logoUrl;
    }

    /**
     * 
     * @param logoUrl
     *     The logo_url
     */
    public void setLogoUrl(Object logoUrl) {
        this.logoUrl = logoUrl;
    }

    /**
     * 
     * @return
     *     The backgroundUrl
     */
    public Object getBackgroundUrl() {
        return backgroundUrl;
    }

    /**
     * 
     * @param backgroundUrl
     *     The background_url
     */
    public void setBackgroundUrl(Object backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }

    /**
     * 
     * @return
     *     The topicTemplate
     */
    public Object getTopicTemplate() {
        return topicTemplate;
    }

    /**
     * 
     * @param topicTemplate
     *     The topic_template
     */
    public void setTopicTemplate(Object topicTemplate) {
        this.topicTemplate = topicTemplate;
    }

    /**
     * 
     * @return
     *     The hasChildren
     */
    public Boolean getHasChildren() {
        return hasChildren;
    }

    /**
     * 
     * @param hasChildren
     *     The has_children
     */
    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    /**
     * 
     * @return
     *     The topicsDay
     */
    public Integer getTopicsDay() {
        return topicsDay;
    }

    /**
     * 
     * @param topicsDay
     *     The topics_day
     */
    public void setTopicsDay(Integer topicsDay) {
        this.topicsDay = topicsDay;
    }

    /**
     * 
     * @return
     *     The topicsWeek
     */
    public Integer getTopicsWeek() {
        return topicsWeek;
    }

    /**
     * 
     * @param topicsWeek
     *     The topics_week
     */
    public void setTopicsWeek(Integer topicsWeek) {
        this.topicsWeek = topicsWeek;
    }

    /**
     * 
     * @return
     *     The topicsMonth
     */
    public Integer getTopicsMonth() {
        return topicsMonth;
    }

    /**
     * 
     * @param topicsMonth
     *     The topics_month
     */
    public void setTopicsMonth(Integer topicsMonth) {
        this.topicsMonth = topicsMonth;
    }

    /**
     * 
     * @return
     *     The topicsYear
     */
    public Integer getTopicsYear() {
        return topicsYear;
    }

    /**
     * 
     * @param topicsYear
     *     The topics_year
     */
    public void setTopicsYear(Integer topicsYear) {
        this.topicsYear = topicsYear;
    }

    /**
     * 
     * @return
     *     The postsDay
     */
    public Integer getPostsDay() {
        return postsDay;
    }

    /**
     * 
     * @param postsDay
     *     The posts_day
     */
    public void setPostsDay(Integer postsDay) {
        this.postsDay = postsDay;
    }

    /**
     * 
     * @return
     *     The postsWeek
     */
    public Integer getPostsWeek() {
        return postsWeek;
    }

    /**
     * 
     * @param postsWeek
     *     The posts_week
     */
    public void setPostsWeek(Integer postsWeek) {
        this.postsWeek = postsWeek;
    }

    /**
     * 
     * @return
     *     The postsMonth
     */
    public Integer getPostsMonth() {
        return postsMonth;
    }

    /**
     * 
     * @param postsMonth
     *     The posts_month
     */
    public void setPostsMonth(Integer postsMonth) {
        this.postsMonth = postsMonth;
    }

    /**
     * 
     * @return
     *     The postsYear
     */
    public Integer getPostsYear() {
        return postsYear;
    }

    /**
     * 
     * @param postsYear
     *     The posts_year
     */
    public void setPostsYear(Integer postsYear) {
        this.postsYear = postsYear;
    }

    /**
     * 
     * @return
     *     The descriptionExcerpt
     */
    public String getDescriptionExcerpt() {
        return descriptionExcerpt;
    }

    /**
     * 
     * @param descriptionExcerpt
     *     The description_excerpt
     */
    public void setDescriptionExcerpt(String descriptionExcerpt) {
        this.descriptionExcerpt = descriptionExcerpt;
    }

    /**
     * 
     * @return
     *     The featuredUserIds
     */
    public List<Integer> getFeaturedUserIds() {
        return featuredUserIds;
    }

    /**
     * 
     * @param featuredUserIds
     *     The featured_user_ids
     */
    public void setFeaturedUserIds(List<Integer> featuredUserIds) {
        this.featuredUserIds = featuredUserIds;
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

    /**
     * 
     * @return
     *     The subcategoryIds
     */
    public List<Integer> getSubcategoryIds() {
        return subcategoryIds;
    }

    /**
     * 
     * @param subcategoryIds
     *     The subcategory_ids
     */
    public void setSubcategoryIds(List<Integer> subcategoryIds) {
        this.subcategoryIds = subcategoryIds;
    }

    /**
     * 
     * @return
     *     The isUncategorized
     */
    public Boolean getIsUncategorized() {
        return isUncategorized;
    }

    /**
     * 
     * @param isUncategorized
     *     The is_uncategorized
     */
    public void setIsUncategorized(Boolean isUncategorized) {
        this.isUncategorized = isUncategorized;
    }

}
