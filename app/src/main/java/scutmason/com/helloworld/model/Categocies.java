
package scutmason.com.helloworld.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Categocies {

    @SerializedName("featured_users")
    @Expose
    private List<FeaturedUser> featuredUsers = new ArrayList<FeaturedUser>();
    @SerializedName("category_list")
    @Expose
    private CategoryList categoryList;

    /**
     * 
     * @return
     *     The featuredUsers
     */
    public List<FeaturedUser> getFeaturedUsers() {
        return featuredUsers;
    }

    /**
     * 
     * @param featuredUsers
     *     The featured_users
     */
    public void setFeaturedUsers(List<FeaturedUser> featuredUsers) {
        this.featuredUsers = featuredUsers;
    }

    /**
     * 
     * @return
     *     The categoryList
     */
    public CategoryList getCategoryList() {
        return categoryList;
    }

    /**
     * 
     * @param categoryList
     *     The category_list
     */
    public void setCategoryList(CategoryList categoryList) {
        this.categoryList = categoryList;
    }

}
