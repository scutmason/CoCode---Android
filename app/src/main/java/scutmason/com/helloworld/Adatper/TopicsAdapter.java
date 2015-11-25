package scutmason.com.helloworld.adatper;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import butterknife.Bind;
import butterknife.ButterKnife;
import scutmason.com.helloworld.R;
import scutmason.com.helloworld.model.Topic;
import scutmason.com.helloworld.model.User;

/**
 * 主界面的Adapter
 * Created by jiajun on 2015/9/23.
 */
public class TopicsAdapter extends RecyclerView.Adapter<TopicsAdapter.TopicVH> {

    private Context context;
    private List<Topic> topics;
    private List<User> users;

    public TopicsAdapter(Context context, List<Topic> topics, List<User> users) {
        this.context = context;
        this.topics = topics;
        this.users = users;
    }

    @Override
    public TopicVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_topic_lisetview, parent, false);
        return new TopicVH(v);
    }

    @Override
    public void onBindViewHolder(TopicVH holder, int position) {
        Topic topic = topics.get(position);
        holder.tvTopic.setText(topic.getTitle());
        Integer userId = topic.getPosters().get(0).getUserId();
        holder.tvPoster.setText(R.string.unknown);
        for (User u : users) {
            if (Objects.equals(u.getId(), userId)){
                holder.tvPoster.setText(u.getUsername());
            }
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        String lastPostedAt;
        try {
            Date date = sdf.parse(topic.getLastPostedAt());
            lastPostedAt = SimpleDateFormat.getInstance().format(date);
        } catch (Exception e) {
            e.printStackTrace();
            lastPostedAt = "未知";
        }
        holder.tvLastTime.setText(lastPostedAt);
        holder.tvTopicSize.setText(topic.getReplyCount() + "");
    }


    @Override
    public int getItemCount() {
        return topics.size() - 1;
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

        public TopicVH(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

    }
}
