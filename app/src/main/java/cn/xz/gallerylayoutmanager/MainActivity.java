package cn.xz.gallerylayoutmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import cn.xz.mylibrary.GalleryLayoutManager;
import cn.xz.mylibrary.Transformer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //文字
        TextView mText = findViewById(R.id.tv_txt);
        //获取列表
        RecyclerView mRv = findViewById(R.id.rv_list);

        ArrayList<String> mList = new ArrayList<>();
        mList.add("1");
        mList.add("2");
        mList.add("3");
        mList.add("4");
        mList.add("5");
        mList.add("6");
        mList.add("7");
        mList.add("8");
        mList.add("9");
        mList.add("10");
        mList.add("11");
        mList.add("12");
        mList.add("13");
        mList.add("14");
        mList.add("15");
        mList.add("16");
        mList.add("17");
        mList.add("18");
        mList.add("19");
        mList.add("20");

        RvAdapter mAdapter = new RvAdapter();
        GalleryLayoutManager manager = new GalleryLayoutManager(RecyclerView.HORIZONTAL);
        manager.attach(mRv);
        //设置滑动缩放效果
        manager.setItemTransformer(new Transformer());
        mRv.setAdapter(mAdapter);

        mAdapter.setList(mList);

        manager.setOnItemSelectedListener(new GalleryLayoutManager.OnItemSelectedListener() {
            @Override
            public void onItemSelected(RecyclerView recyclerView,ArrayList<View> list,View item, int position) {

                for (View view: list){
                    TextView mTxt = view.findViewById(R.id.tv_txt);
                    mTxt.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.bg_close));
                }

                TextView mTxt = item.findViewById(R.id.tv_txt);
                mTxt.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.bg_select));

                mText.setText("当前选择-" + mList.get(position));
            }
        });
    }
}