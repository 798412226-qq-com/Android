package com.example.my_application02;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView.OnEditorActionListener;
import android.view.View.OnClickListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText=(EditText)findViewById(R.id.edit_text);
        //监听回车键
        editText.setOnEditorActionListener(new OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                Toast.makeText(MainActivity.this, String.valueOf(actionId), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        //获取EditText文本
        Button getValue=(Button)findViewById(R.id.btn_get_value);
        getValue.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        //让EditText全选
        Button all=(Button)findViewById(R.id.btn_all);
        all.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.selectAll();
            }
        });
        //从第2个字符开始选择EditText文本
        Button select=(Button)findViewById(R.id.btn_select);
        select.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable editable=editText.getText();
                Selection.setSelection(editable, 1,editable.length());
            }
        });
        //获取选中的文本
        Button getSelect=(Button)findViewById(R.id.btn_get_select);
        getSelect.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int start=editText.getSelectionStart();
                int end=editText.getSelectionEnd();
                CharSequence selectText=editText.getText().subSequence(start, end);
                Toast.makeText(MainActivity.this, selectText, Toast.LENGTH_SHORT).show();
            }
        });
    }
    /**
     * 交换两个索引
     * @param start 开始索引
     * @param end 结束索引
     */
    protected void switchIndex(int start, int end) {
        int temp=start;
        start=end;
        end=temp;
    }

    /**
     * 新增文字
     * @param v
     */
    public void display(View v){
        EditText name = (EditText) findViewById(R.id.edit_text);
        TextView get_text = (TextView) findViewById(R.id.edit_text);
        name.setText(get_text.getText() + "111111111");
        int a = 3;
        System.out.println(a + "adfadf");

    }
}
