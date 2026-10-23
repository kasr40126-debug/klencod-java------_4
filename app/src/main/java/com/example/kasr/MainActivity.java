
package com.kaser.muslimencyclopedia;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    LinearLayout layout;
    int count = 0;

    @Override
    public void onCreate(Bundle b) {
        super.onCreate(b);

        layout = new LinearLayout(this);
        layout.setOrientation(1);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(16, 16, 16, 16);
        layout.setBackgroundColor(Color.WHITE);
        setContentView(layout);

        title("موسوعة المسلم الشاملة", 25);

        button("القرآن الكريم", "القرآن الكريم");
        button("الأذكار", "سبحان الله وبحمده");
        button("الأدعية", "اللهم اغفر لي وارحمني");
        button("الأحاديث", "إنما الأعمال بالنيات");
        button("أسماء الله الحسنى", "الرحمن، الرحيم، الملك");
        button("السبحة الإلكترونية", "");
    }

    void title(String text, int size) {
        TextView t = new TextView(this);
        t.setText(text);
        t.setTextSize(size);
        t.setTextColor(Color.rgb(0, 100, 60));
        t.setGravity(Gravity.CENTER);
        layout.addView(t);
    }

    void button(String name, String text) {
        Button b = new Button(this);
        b.setText(name);
        layout.addView(b);

        b.setOnClickListener(v -> {
            if (name.equals("السبحة الإلكترونية")) {
                count++;
                b.setText("التسبيح: " + count);
            } else {
                Toast.makeText(this, text,
                    Toast.LENGTH_LONG).show();
            }
        });
    }
}
