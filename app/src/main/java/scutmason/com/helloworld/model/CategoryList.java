
package scutmason.com.helloworld.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoryList {

    @SerializedName("can_create_category")
    @Expose
    private Boolean canCreateCategory;
    @SerializedName("can_create_topic")
    @Expose
    private Boolean canCreateTopic;
    @SerializedName("draft")
    @Expose
    private Object draft;
    @SerializedName("draft_key")
    @Expose
    private String draftKey;
    @SerializedName("draft_sequence")
    @Expose
    private Integer draftSequence;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = new ArrayList<Category>();

    /**
     * 
     * @return
     *     The canCreateCategory
     */
    public Boolean getCanCreateCategory() {
        return canCreateCategory;
    }

    /**
     * 
     * @param canCreateCategory
     *     The can_create_category
     */
    public void setCanCreateCategory(Boolean canCreateCategory) {
        this.canCreateCategory = canCreateCategory;
    }

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
     *     The categories
     */
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

}
