package com.example.programshub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import thereisnospon.codeview.CodeView;
import thereisnospon.codeview.CodeViewTheme;

public class display_code extends Activity {
    RecyclerView recyclerView;
    CodeView codeView;
    MyRecyclerAdapter myRecyclerAdapter;
    codes Code;
    String dis_code="";
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_code);


        String[] c_code=new String[]{"kjxsx","xnhsksk","jxbsxsx","xnsjxdsn","bdhjsbdsb"};

        Intent intent=getIntent();
        String posi=  intent.getStringExtra("pos");

        codeView=findViewById(R.id.codeview_display_code);
        codeView.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
       if(posi.equals("0")){
           codeView.showCode(c_code[0]);
       }
        if(posi.equals("1")){
            codeView.showCode(c_code[1]);
        }
        if(posi.equals("2")){
            codeView.showCode(c_code[2]);
        }
        if(posi.equals("3")){
            codeView.showCode(c_code[3]);
        }
        if(posi.equals("4")){
            codeView.showCode(c_code[4]);
        }






    }
}

