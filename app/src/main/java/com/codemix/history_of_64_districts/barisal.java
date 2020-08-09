package com.codemix.history_of_64_districts;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;


import androidx.appcompat.app.AppCompatActivity;


public class barisal extends AppCompatActivity {



    /* renamed from: com.trmlab.history_of_64_districts.barisal$a */
    public class C1909a implements OnClickListener {
        public C1909a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(barisal.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_42.html");
            barisal.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.barisal$b */
    public class C1910b implements OnClickListener {
        public C1910b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(barisal.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_43.html");
            barisal.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.barisal$c */
    public class C1911c implements OnClickListener {
        public C1911c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(barisal.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_44.html");
            barisal.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.barisal$d */
    public class C1912d implements OnClickListener {
        public C1912d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(barisal.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_45.html");
            barisal.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.barisal$e */
    public class C1913e implements OnClickListener {
        public C1913e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(barisal.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_46.html");
            barisal.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.barisal$f */
    public class C1914f implements OnClickListener {
        public C1914f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(barisal.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_47.html");
            barisal.this.startActivity(intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_barisal);
        Button button = (Button) findViewById(R.id.bt43);
        Button button2 = (Button) findViewById(R.id.bt44);
        Button button3 = (Button) findViewById(R.id.bt45);
        Button button4 = (Button) findViewById(R.id.bt46);
        Button button5 = (Button) findViewById(R.id.bt47);
        ((Button) findViewById(R.id.bt42)).setOnClickListener(new C1909a());
        button.setOnClickListener(new C1910b());
        button2.setOnClickListener(new C1911c());
        button3.setOnClickListener(new C1912d());
        button4.setOnClickListener(new C1913e());
        button5.setOnClickListener(new C1914f());

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.shareid) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            String string = getString(R.string.share);
            intent.putExtra("android.intent.extra.SUBJECT", "");
            intent.putExtra("android.intent.extra.TEXT", string);
            startActivity(Intent.createChooser(intent, " আপনার বন্ধুদের জন্য শেয়ার করুন"));
        }
        String str = "android.intent.action.VIEW";
        if (menuItem.getItemId() == R.id.UpdateId) {
            Intent intent2 = new Intent(str);
            intent2.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.trmlab.history_of_64_districts"));
            startActivity(intent2);
        }
        if (menuItem.getItemId() == R.id.Privacy) {
            Intent intent3 = new Intent(str);
            intent3.setData(Uri.parse(getString(R.string.privacy_policy)));
            startActivity(intent3);
        }
        if (menuItem.getItemId() == R.id.aboutusid) {
            startActivity(new Intent(this, about.class));
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
