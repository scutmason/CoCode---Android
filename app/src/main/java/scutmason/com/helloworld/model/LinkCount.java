package scutmason.com.helloworld.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class LinkCount {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("internal")
    @Expose
    private Boolean internal;
    @SerializedName("reflection")
    @Expose
    private Boolean reflection;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("clicks")
    @Expose
    private Integer clicks;

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



}
