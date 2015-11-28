package scutmason.com.helloworld.adatper;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import scutmason.com.helloworld.R;
import scutmason.com.helloworld.ui.TopicActivity;
import scutmason.com.helloworld.model.Category;

/**
 * 主界面的Adapter
 * Created by jiajun on 2015/9/23.
 */
public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.VH> {
    private Context context;
    private List<Category> categories;

    public CategoriesAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_main_lisetview, parent, false);
        return new VH(v);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        Category category = categories.get(position);
        holder.tv.setText(category.getName());
        holder.tv.setTextColor(0xff000000 + Integer.parseInt(category.getColor(), 16));
    }


    @Override
    public int getItemCount() {
        return categories.size()-1;
    }

    class VH extends RecyclerView.ViewHolder {
        @Bind(R.id.tv_category)
        TextView tv;

        public VH(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @OnClick(R.id.tv_category) void onClick(View v){
            Intent intent = new Intent(v.getContext(), TopicActivity.class);
            intent.putExtra(TopicActivity.CATEGORY,categories.get(getLayoutPosition()).getSlug());
            intent.putExtra(TopicActivity.TITLE,tv.getText());
            v.getContext().startActivity(intent);
        }

    }
}
