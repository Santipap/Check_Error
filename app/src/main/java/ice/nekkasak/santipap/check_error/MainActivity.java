package ice.nekkasak.santipap.check_error;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private Button about;
    private ListView trafficlistvirw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindwiget();
        contro();
        CreateListView();
    }

    private void CreateListView() {
        final int[] intIcon={R.drawable.t_011,R.drawable.t_021,R.drawable.t_031,R.drawable.t_041,R.drawable.t_051,
                             R.drawable.t_061,R.drawable.t_071,R.drawable.t_081,R.drawable.t_091,R.drawable.t_101,
                             R.drawable.t_111,R.drawable.t_121,R.drawable.t_131,R.drawable.t_141,R.drawable.t_151,
                             R.drawable.t_161,R.drawable.t_171,R.drawable.t_181,R.drawable.t_191,R.drawable.t_201};
        final String[] titleStrings = new String[20];
        titleStrings[0]="Wireless Card";
        titleStrings[1]="Power Supply";
        titleStrings[2]="Optical Disk Drive";
        titleStrings[3]="Sound Card";
        titleStrings[4]="Lan Card";

        titleStrings[5]="VGA";
        titleStrings[6]="Memboard";
        titleStrings[7]="Printer";
        titleStrings[8]="Touchscreen";
        titleStrings[9]="Scanner";

        titleStrings[10]="Keyboard";
        titleStrings[11]="USB";
        titleStrings[12]="DVD";
        titleStrings[13]="Floppy Disk";
        titleStrings[14]="SSD";

        titleStrings[15]="Hard Disk";
        titleStrings[16]="RAM";
        titleStrings[17]="CPU";
        titleStrings[18]="Monitor";
        titleStrings[19]="Mouse";

        String[] detailStrings = getResources().getStringArray(R.array.detail_short);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, intIcon, titleStrings, detailStrings);
        trafficlistvirw.setAdapter(myAdapter);

        trafficlistvirw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);

                intent.putExtra("Title", titleStrings[i]);
                intent.putExtra("Img", intIcon);
                intent.putExtra("Index", i);

                startActivity(intent);
            }
        });

    }

    private void contro() {
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/profile.php?id=100009860237292"));
                startActivity(intent);
            }
        });
    }

    private void bindwiget() {
        about = (Button) findViewById(R.id.button);
        trafficlistvirw = (ListView) findViewById(R.id.listView);

    }
}
