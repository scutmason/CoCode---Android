package scutmason.com.helloworld.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Link {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("fancy_title")
    @Expose
    private Object fancyTitle;
    @SerializedName("internal")
    @Expose
    private Boolean internal;
    @SerializedName("attachment")
    @Expose
    private Boolean attachment;
    @SerializedName("reflection")
    @Expose
    private Boolean reflection;
    @SerializedName("clicks")
    @Expose
    private Integer clicks;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("domain")
    @Expose
    private String domain;

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
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
    public Object getFancyTitle() {
        return fancyTitle;
    }

    /**
     * 
     * @param fancyTitle
     *     The fancy_title
     */
    public void setFancyTitle(Object fancyTitle) {
        this.fancyTitle = fancyTitle;
    }

    /**
     * 
     * @return
     *     The internal
     */
    public Boolean getInternal() {
        return internal;
    }

    /**
     * 
     * @param internal
     *     The internal
     */
    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    /**
     * 
     * @return
     *     The attachment
     */
    public Boolean getAttachment() {
        return attachment;
    }

    /**
     * 
     * @param attachment
     *     The attachment
     */
    public void setAttachment(Boolean attachment) {
        this.attachment = attachment;
    }

    /**
     * 
     * @return
     *     The reflection
     */
    public Boolean getReflection() {
        return reflection;
    }

    /**
     * 
     * @param reflection
     *     The reflection
     */
    public void setReflection(Boolean reflection) {
        this.reflection = reflection;
    }

    /**
     * 
     * @return
     *     The clicks
     */
    public Integer getClicks() {
        return clicks;
    }

    /**
     * 
     * @param clicks
     *     The clicks
     */
    public void setClicks(Integer clicks) {
        this.clicks = clicks;
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
     *     The domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * 
     * @param domain
     *     The domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


}
