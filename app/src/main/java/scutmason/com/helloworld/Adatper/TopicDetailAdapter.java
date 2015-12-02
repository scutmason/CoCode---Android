package scutmason.com.helloworld.adatper;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.Collection;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import scutmason.com.helloworld.R;
import scutmason.com.helloworld.model.Post;
import scutmason.com.helloworld.ui.PhotoActivity;
import scutmason.com.helloworld.ui.wiget.PhotoView;
import scutmason.com.helloworld.ui.wiget.RichText;
import scutmason.com.helloworld.utils.TimeTranslate;

/**
 * Created by mason on 2015/11/25.
 */
public class TopicDetailAdapter extends BaseLoadMoreRecyclerAdapter<Post, TopicDetailAdapter.ViewHolder> {
    String BASEURL = "http://cocode.cc";
    Context context;
    List<Post> data;
    private View mHeaderView;

    public void addAll(Collection<Post> collection) {
        data.addAll(collection);
        notifyDataSetChanged();
    }

    public void setTitleText(String text) {
        TextView tvTitle = new TextView(context);
        tvTitle.setText(text);
        tvTitle.setTextSize(26f);
        tvTitle.setLayoutParams(new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        tvTitle.setBackgroundColor(0x11000000);
        mHeaderView = tvTitle;
        notifyItemInserted(0);
    }

    public void clear() {
        data.clear();
    }

    public TopicDetailAdapter(Context context, List<Post> topicDetail) {
        this.context = context;
        data = topicDetail;
    }

    @Override
    public ViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        if (mHeaderView != null && viewType == TYPE_HEADER) return new ViewHolder(mHeaderView);
        View view = LayoutInflater.from(context).inflate(R.layout.item_topic_detail, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindItemViewHolder(ViewHolder vh, int position) {
        if (getItemViewType(position) == TYPE_HEADER) return;
        if (getItemViewType(position) == TYPE_FOOTER) return;
        final int pos = getRealPosition(vh);
        Post post = data.get(pos);
        String url = post.getAvatarTemplate().replace("{size}", "45");
        String avatarUrl;
        if (url.startsWith("http")) {
            avatarUrl = url;
        } else {
            avatarUrl = BASEURL + url;
        }
        Picasso.with(context).load(avatarUrl).into(vh.ivAvatar);
        vh.tvUsername.setText(post.getUsername());
        vh.tvPostTime.setText(TimeTranslate.getTime(post.getCreatedAt()));
        vh.tvContent.setRichText(post.getCooked());
        vh.tvPosition.setText(pos == 0 ? "楼主" : pos + "楼");
    }

    @Override
    public int getItemViewType(int position) {
        if (mHeaderView == null) {
            return super.getItemViewType(position);
        }
        if (position == 0) return TYPE_HEADER;
        return super.getItemViewType(position);
    }



    public int getRealPosition(RecyclerView.ViewHolder holder) {
        int position = holder.getLayoutPosition();
        return mHeaderView == null ? position : position - 1;
    }

    @Override
    public int getItemCount() {
        return data.size() + (mHeaderView == null ? 0 : 1) + (hasFooter() ? 1 : 0);
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.iv_avatar)
        ImageView ivAvatar;
        @Bind(R.id.tv_username)
        TextView tvUsername;
        @Bind(R.id.tv_post_time)
        TextView tvPostTime;
        @Bind(R.id.tv_content)
        RichText tvContent;
        @Bind(R.id.tv_position)
        TextView tvPosition;

        public ViewHolder(View itemView) {
            super(itemView);
            if (itemView == mHeaderView) return;
            ButterKnife.bind(this, itemView);
            tvContent.setOnImageClickListener(new RichText.OnImageClickListener() {
                @Override
                public void imageClicked(List<String> imageUrls, int position) {
                    Intent intent = new Intent(context, PhotoActivity.class);
                    intent.putExtra(PhotoActivity.PHOTO_DOWNLOAD_URL,imageUrls.get(position));
                    context.startActivity(intent);
                }
            });
        }
    }
}
