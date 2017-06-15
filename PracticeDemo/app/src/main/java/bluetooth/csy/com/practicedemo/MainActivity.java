package bluetooth.csy.com.practicedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import bluetooth.csy.com.practicedemo.screen.ViewGetPostion;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btView1)
    Button btView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btView1)
    public void onClick() {
        Intent intent = new Intent(MainActivity.this, ViewGetPostion.class);
        startActivity(intent);
    }
}
