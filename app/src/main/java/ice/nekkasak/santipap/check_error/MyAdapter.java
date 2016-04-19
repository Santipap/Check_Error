package ice.nekkasak.santipap.check_error;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hibiki on 13/04/2016.
 */
public class MyAdapter extends BaseAdapter{
    private Context context;
    private int[] iconInts;
    private String[] titleStrings,detailStrings;

    public MyAdapter(Context context, int[] iconInts, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return iconInts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.traffic_listview, viewGroup, false);

        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);

        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[i]);

        TextView detailTextView = (TextView) view1.findViewById(R.id.textView3);
        detailTextView.setText(detailStrings[i]);


        return view1;
    }
}
