package bluetooth.csy.com.practicedemo.screen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import bluetooth.csy.com.practicedemo.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by user on 2017-6-15.
 *
 *
 1.View.getLocationInWindow(int[] location)
 一个控件在其父窗口中的坐标位置


 2.View.getLocationOnScreen(int[] location)
 一个控件在其整个屏幕上的坐标位置


 3.获得相对在它父布局里的坐标
 View.getLeft() ;
 View.getTop() ;
 View.getBottom();
 View.getRight() ;
 View.getX() ;
 View.getY() ;
 */

public class ViewGetPostion extends AppCompatActivity {


    @BindView(R.id.btView1)
    Button btView1;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_view_postion);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.btView1})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btView1:
                int[] location = new int[2];
                view.getLocationInWindow(location);
                int[] location2 = new int[2];
                view.getLocationInWindow(location2);
                String content = "\nview.getX()===" + view.getX() + "===" + view.getY() +
        "\ngetLocationInWindow===" + location[0]+location[1]+
                        "\ngetLocationInWindow===" + location2[0]+"==="+location2[1];
                btView1.setText(content);
                break;

        }
    }
}
