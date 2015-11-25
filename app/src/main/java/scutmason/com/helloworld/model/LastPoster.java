
package scutmason.com.helloworld.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LastPoster {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("avatar_template")
    @Expose
    private String avatarTemplate;

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

}
