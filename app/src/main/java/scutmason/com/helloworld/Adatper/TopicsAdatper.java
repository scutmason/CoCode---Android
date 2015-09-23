package scutmason.com.helloworld.Adatper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import scutmason.com.helloworld.MainActivity;
import scutmason.com.helloworld.R;
import scutmason.com.helloworld.model.Topic;

/**
 * 主界面的Adapter
 * Created by jiajun on 2015/9/23.
 */
public class TopicsAdatper extends BaseAdapter {
    List<String> topics;
    Context context;

    public TopicsAdatper(List<String> topics, Context context) {
        this.topics = topics;
        this.context = context.getApplicationContext();
    }


    @Override
    public int getCount() {
        return topics.size();
    }

    @Override
    public Object getItem(int position) {
        return topics.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.item_main_lisetview, null);
            tv = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(tv);
        } else {
            tv = (TextView) convertView.getTag();
        }
        tv.setText(topics.get(position));
        return convertView;
    }

    static class ViewHolder {
        TextView tv;
    }
}
