package com.example.fontfamily;
//1.用font fmaily加入Google字形 res/font/.ttf
//2.自訂font字形設定

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ResourcesCompat.getFont(@NonNull Context context, @FontRes int id)://取得Res文字種類(1.這個頁面 2.Res文字格式資源區)(回傳Typeface)
        final Typeface typeface = ResourcesCompat.getFont(this,R.font.simonetta_black_italicc);//取得Res文字種類
        final TextView txt = findViewById(R.id.txt1);

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TextView.setTypeface(@Nullable Typeface tf): //設定文字類型(Typeface文字種類)
                txt.setTypeface(typeface);  //設定文字類型
            }
        });
    }
}
