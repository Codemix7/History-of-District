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


public class khulna extends AppCompatActivity {



    /* renamed from: com.trmlab.history_of_64_districts.khulna$a */
    public class C1932a implements OnClickListener {
        public C1932a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(khulna.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_41.html");
            khulna.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.khulna$b */
    public class C1933b implements OnClickListener {
        public C1933b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(khulna.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_32.html");
            khulna.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.khulna$c */
    public class C1934c implements OnClickListener {
        public C1934c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(khulna.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_33.html");
            khulna.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.khulna$d */
    public class C1935d implements OnClickListener {
        public C1935d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(khulna.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_34.html");
            khulna.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.khulna$e */
    public class C1936e implements OnClickListener {
        public C1936e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(khulna.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_35.html");
            khulna.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.khulna$f */
    public class C1937f implements OnClickListener {
        public C1937f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(khulna.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_36.html");
            khulna.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.khulna$g */
    public class C1938g implements OnClickListener {
        public C1938g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(khulna.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_37.html");
            khulna.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.khulna$h */
    public class C1939h implements OnClickListener {
        public C1939h() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(khulna.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_38.html");
            khulna.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.khulna$i */
    public class C1940i implements OnClickListener {
        public C1940i() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(khulna.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_39.html");
            khulna.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.khulna$j */
    public class C1941j implements OnClickListener {
        public C1941j() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(khulna.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_40.html");
            khulna.this.startActivity(intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_khulna);
        Button button = (Button) findViewById(R.id.bt33);
        Button button2 = (Button) findViewById(R.id.bt34);
        Button button3 = (Button) findViewById(R.id.bt35);
        Button button4 = (Button) findViewById(R.id.bt36);
        Button button5 = (Button) findViewById(R.id.bt37);
        Button button6 = (Button) findViewById(R.id.bt38);
        Button button7 = (Button) findViewById(R.id.bt39);
        Button button8 = (Button) findViewById(R.id.bt40);
        Button button9 = (Button) findViewById(R.id.bt41);
        ((Button) findViewById(R.id.bt32)).setOnClickListener(new C1933b());
        button.setOnClickListener(new C1934c());
        button2.setOnClickListener(new C1935d());
        button3.setOnClickListener(new C1936e());
        button4.setOnClickListener(new C1937f());
        button5.setOnClickListener(new C1938g());
        button6.setOnClickListener(new C1939h());
        button7.setOnClickListener(new C1940i());
        button8.setOnClickListener(new C1941j());
        button9.setOnClickListener(new C1932a());

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
