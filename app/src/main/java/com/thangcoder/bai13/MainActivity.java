package com.thangcoder.bai13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvName;
    private RadioButton rbtnGay;
    private RadioButton rbtnLess;

    private CheckBox cbMautim;
    private CheckBox cbMauhong;
    private CheckBox cbNoitam;
    private CheckBox cbKhoctham;

    private ImageButton imgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();

        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sologan = "";
                sologan = String.valueOf(tvName.getText());
                if(cbMautim.isChecked()){
                    sologan = sologan + cbMautim.getText() +" - ";
                }
                if(cbMauhong.isChecked()){
                    sologan =  sologan + cbMauhong.getText()+" - ";
                }
                if(cbNoitam.isSelected()){
                    sologan = sologan + cbNoitam.getText()+" - ";
                }
                if(cbKhoctham.isChecked()){
                    sologan = sologan + cbKhoctham.getText()+" - ";
                }
                if(rbtnLess.isChecked()){
                    sologan = sologan + rbtnLess.getText();
                }else {
                    sologan = sologan + rbtnGay.getText();
                }
                Toast.makeText(MainActivity.this, sologan, Toast.LENGTH_LONG).show();
            }
        });
    }

    public void initWidget() {
        tvName = (TextView) findViewById(R.id.tv_name);
        rbtnGay = (RadioButton) findViewById(R.id.rbtn_gay);
        rbtnLess = (RadioButton) findViewById(R.id.rbtn_less);

        cbMautim= (CheckBox) findViewById(R.id.cb_mautim);
        cbMauhong= (CheckBox) findViewById(R.id.cb_mauhong);
        cbNoitam= (CheckBox) findViewById(R.id.cb_noitam);
        cbKhoctham= (CheckBox) findViewById(R.id.cb_khoctham);
        imgButton = (ImageButton) findViewById(R.id.img_button);
    }
}
