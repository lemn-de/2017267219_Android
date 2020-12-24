package com.app.classschedule;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;

import com.app.classschedule.R;

import java.util.ArrayList;
import java.util.List;
import com.app.classschedule.UI.AbsGridAdapter;
import com.app.classschedule.UI.MyAdapter;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private static final String TAG = "test";
    private Spinner spinner;

    private GridView detailCource;

    private MyAdapter adapter;

    private String[][] contents;

    private AbsGridAdapter secondAdapter;

    private List<String> dataList;

    private ArrayAdapter<String> spinnerAdapter;

    private Context mContext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cource);
        //视图中绑定下拉列表
        spinner = (Spinner)findViewById(R.id.switchWeek);
        detailCource = (GridView)findViewById(R.id.courceDetail);

        //////////////创建Spinner数据
        fillDataList();
        spinnerAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, dataList);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);
        spinner.setOnItemSelectedListener(this);
        ///////////////第一种方式创建Adapater
//        List<String> list = init();
//        adapter = new MyAdapter(this, list);
//        detailCource.setAdapter(adapter);
        ///////////////第二种方式创建Adapter
//        fillStringArray();
//        fillStringArray_2();
//        secondAdapter = new AbsGridAdapter(this);
//        secondAdapter.setContent(contents, 6, 7);
//        detailCource.setAdapter(secondAdapter);

    }

    /**
     * 准备数据
     */
//    private List<String> init() {
//        List<String> list = new ArrayList<String>();
//        list.add("Python程序设计文503");
//        list.add("");
//        list.add("");
//        list.add("Android应用开发文503");
//        list.add("移动互联网技术文104");
//        list.add("");
//        list.add("");
//        list.add("软件体系结构信805");
//        list.add("");
//        list.add("计算机网络文605");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("计算机网络\n文406");
//        list.add("");
//        list.add("专业英语\n文204");
//        list.add("大学生就业指导\n文801");
//        list.add("");
//        list.add("软件体系结构\n文404");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("Android应用开发\n文804");
//        list.add("计算机图形学\n文503");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("");
//        return list;
//    }

    public void fillStringArray() {
        contents = new String[6][7];
        contents[0][0] = "Python程序设计\n文503";
        contents[1][0] = "";
        contents[2][0] = "";
        contents[3][0] = "Android应用开发\n文503";
        contents[4][0] = "移动互联网技术\n文104";
        contents[5][0] = "";
        contents[0][1] = "";
        contents[1][1] = "软件体系结构\n信805";
        contents[2][1] = "";
        contents[3][1] = "计算机网络\n文605";
        contents[4][1] = "";
        contents[5][1] = "";
        contents[0][2] = "";
        contents[1][2] = "计算机网络\n文406";
        contents[2][2] = "";
        contents[3][2] = "专业英语\n文204";
        contents[4][2] = "大学生就业指导\n文801";
        contents[5][2] = "";
        contents[0][3] = "软件体系结构\n文404";
        contents[1][3] = "";
        contents[2][3] = "";
        contents[3][3] = "";
        contents[4][3] = "";
        contents[5][3] = "";
        contents[0][4] = "";
        contents[1][4] = "Android应用开发\n文804";
        contents[2][4] = "计算机图形学\n文503";
        contents[3][4] = "";
        contents[4][4] = "";
        contents[5][4] = "";
        contents[0][5] = "";
        contents[1][5] = "";
        contents[2][5] = "";
        contents[3][5] = "";
        contents[4][5] = "";
        contents[5][5] = "";
        contents[0][6] = "";
        contents[1][6] = "";
        contents[2][6] = "";
        contents[3][6] = "";
        contents[4][6] = "";
        contents[5][6] = "";
    }

    public void fillStringArray_2() {
        contents = new String[6][7];
        contents[0][0] = "Python程序设计\n文503";
        contents[1][0] = "";
        contents[2][0] = "";
        contents[3][0] = "Android应用开发\n信805";
        contents[4][0] = "移动互联网技术\n文104";
        contents[5][0] = "";
        contents[0][1] = "";
        contents[1][1] = "计算机图形学\n信805";
        contents[2][1] = "";
        contents[3][1] = "计算机网络\n文605";
        contents[4][1] = "";
        contents[5][1] = "";
        contents[0][2] = "";
        contents[1][2] = "计算机网络\n文304";
        contents[2][2] = "";
        contents[3][2] = "专业英语\n文204";
        contents[4][2] = "移动互联网技术\n文308";
        contents[5][2] = "";
        contents[0][3] = "软件体系结构\n文404";
        contents[1][3] = "";
        contents[2][3] = "";
        contents[3][3] = "";
        contents[4][3] = "";
        contents[5][3] = "";
        contents[0][4] = "";
        contents[1][4] = "Android应用开发\n文804";
        contents[2][4] = "计算机图形学\n文503";
        contents[3][4] = "";
        contents[4][4] = "";
        contents[5][4] = "";
        contents[0][5] = "";
        contents[1][5] = "";
        contents[2][5] = "";
        contents[3][5] = "";
        contents[4][5] = "";
        contents[5][5] = "";
        contents[0][6] = "";
        contents[1][6] = "";
        contents[2][6] = "";
        contents[3][6] = "";
        contents[4][6] = "";
        contents[5][6] = "";
    }

    public void fillDataList() {
        dataList = new ArrayList<>();
        for(int i = 1; i < 21; i++) {
            dataList.add("第" + i + "周");
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        switch (adapterView.getId()){
            case R.id.switchWeek:
                if (adapterView.getItemIdAtPosition(i) % 2 == 0){   //选中单周
//                    Toast.makeText(mContext,"您的分段是~：" + adapterView.getItemAtPosition(i).toString(),
//                            Toast.LENGTH_SHORT).show();
                    Log.d(TAG, "onItemSelected: 选中单周");
//                    Log.d(TAG, "onItemSelected: " + adapterView.getItemIdAtPosition(i));
                    fillStringArray();
                    secondAdapter = new AbsGridAdapter(this);
                    secondAdapter.setContent(contents, 6, 7);
                    detailCource.setAdapter(secondAdapter);
                }else {
                    Log.d(TAG, "onItemSelected: 选中双周");
//                    Log.d(TAG, "onItemSelected: " + adapterView.getItemIdAtPosition(i));
                    fillStringArray_2();
                    secondAdapter = new AbsGridAdapter(this);
                    secondAdapter.setContent(contents, 6, 7);
                    detailCource.setAdapter(secondAdapter);
                }
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
