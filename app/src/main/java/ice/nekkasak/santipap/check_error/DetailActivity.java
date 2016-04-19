package ice.nekkasak.santipap.check_error;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView titleTextView,detailTextView;
    private ImageView trafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        bindwiget();
        showView();
    }

    private void showView() {
        String strTitle = getIntent().getStringExtra("Title");
        int intIcon=getIntent().getIntExtra("Img", R.drawable.t_011);
        int intIndex = getIntent().getIntExtra("Index", 0);

        titleTextView.setText(strTitle);
        trafficImageView.setImageResource(intIcon);

        String[] strDetail = getResources().getStringArray(R.array.traffic_detail);
        detailTextView.setText(strDetail[intIndex]);
    }

    private void bindwiget() {
        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);

    }
}
