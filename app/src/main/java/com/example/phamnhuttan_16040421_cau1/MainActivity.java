package com.example.phamnhuttan_16040421_cau1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb;
    Button btn, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb = (CheckBox) findViewById(R.id.checkBox);
        btn = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb.isChecked()){
                    Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu", Toast.LENGTH_LONG).show();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alerdialog();
            }
        });
    }
    private void alerdialog(){
        AlertDialog.Builder al =  new AlertDialog.Builder(this);
        al.setTitle("Thông báo");
        al.setMessage("Bạn có muốn thoát hay không ?");
        al.setPositiveButton("có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Bạn chọn có", Toast.LENGTH_SHORT).show();
            }
        });
        al.setNegativeButton("không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Bạn chọn không", Toast.LENGTH_SHORT).show();

            }
        });
//        AlertDialog alert = al.create();
        al.show();

    }
}
