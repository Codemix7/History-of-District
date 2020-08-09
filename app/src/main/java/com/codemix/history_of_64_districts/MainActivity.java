package com.codemix.history_of_64_districts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    /* renamed from: s */
    public ProgressBar f5672s;

    /* renamed from: t */
    public int f5673t;

    /* renamed from: com.trmlab.history_of_64_districts.MainActivity$a */
    public class C1908a implements Runnable {
        public C1908a() {
        }

        public void run() {
            MainActivity.this.mo6752r();
            MainActivity.this.mo6753s();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        this.f5672s = (ProgressBar) findViewById(R.id.progressbar);
        new Thread(new C1908a()).start();
    }

    /* renamed from: r */
    public void mo6752r() {
        this.f5673t = 20;
        while (this.f5673t <= 100) {
            try {
                Thread.sleep(600);
                this.f5672s.setProgress(this.f5673t);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f5673t += 20;
        }
    }

    /* renamed from: s */
    public void mo6753s() {
        startActivity(new Intent(this, Main2Activity.class));
        finish();
    }
}
