package scutmason.com.helloworld.adatper;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import scutmason.com.helloworld.R;
import scutmason.com.helloworld.model.Topic;
import scutmason.com.helloworld.model.User;
import scutmason.com.helloworld.ui.TopicActivity;
import scutmason.com.helloworld.utils.TimeTranslate;

/**
 * 主界面的Adapter
 * Created by jiajun on 2015/9/23.
 */
public class TopicsAdapter extends BaseLoadMoreRecyclerAdapter<Topic, TopicsAdapter.TopicVH> {

    private Context context;
    private List<Topic> topics;
    private List<User> users;

    public TopicsAdapter(Context context, List<Topic> topics, List<User> users) {
        this.context = context;
        this.topics = topics;
        this.users = users;
    }

    @Override
    public TopicVH onCreateItemViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_topic_lisetview, parent, false);
        return new TopicVH(v);
    }

    @Override
    public int getItemViewType(int position) {
        if (position == getItemCount() - 1 && hasFooter()) {
            return TYPE_FOOTER;
        } else
            return TYPE_NORMAL;
    }

    @Override
    public void onBindItemViewHolder(TopicVH holder, int position) {
        Topic topic = topics.get(position);
        holder.tvTopic.setText(topic.getTitle());
        Integer userId = topic.getPosters().get(0).getUserId();
        holder.tvPoster.setText(R.string.unknown);
        for (User u : users) {
            if (Objects.equals(u.getId(), userId)) {
                holder.tvPoster.setText(u.getUsername());
            }
        }
        holder.tvLastTime.setText(TimeTranslate.getTime(topic.getCreatedAt()));
        holder.tvTopicSize.setText(String.valueOf(topic.getPostsCount()));
    }


    @Override
    public int getItemCount() {
        return topics.size() + (hasFooter() ? 1 : 0);
    }

    class TopicVH extends RecyclerView.ViewHolder {
        @Bind(R.id.tv_topic)
        TextView tvTopic;
        @Bind(R.id.tv_poster)
        TextView tvPoster;
        @Bind(R.id.tv_last_time)
        TextView tvLastTime;
        @Bind(R.id.tv_topic_size)
        TextView tvTopicSize;
        @Bind(R.id.ll_topic)
        LinearLayout linearLayout;


        public TopicVH(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }


        @OnClick(R.id.ll_topic)
        void onClick(View v) {
            Intent intent = new Intent(v.getContext(), TopicActivity.class);
            intent.putExtra(TopicActivity.FLAG, TopicActivity.TOPICDETAIL);
            intent.putExtra(TopicActivity.TOPICID, topics.get(getLayoutPosition()).getId());
            v.getContext().startActivity(intent);
        }
    }
}
