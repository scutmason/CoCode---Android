package scutmason.com.helloworld.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class ActionsSummary {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("hidden")
    @Expose
    private Boolean hidden;
    @SerializedName("can_act")
    @Expose
    private Boolean canAct;

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
     *     The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(Integer count) {
        this.count = count;
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
     *     The canAct
     */
    public Boolean getCanAct() {
        return canAct;
    }

    /**
     * 
     * @param canAct
     *     The can_act
     */
    public void setCanAct(Boolean canAct) {
        this.canAct = canAct;
    }


}
