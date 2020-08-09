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


public class chittagong extends AppCompatActivity {



    /* renamed from: com.trmlab.history_of_64_districts.chittagong$a */
    public class C1921a implements OnClickListener {
        public C1921a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(chittagong.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_22.html");
            chittagong.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.chittagong$b */
    public class C1922b implements OnClickListener {
        public C1922b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(chittagong.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_23.html");
            chittagong.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.chittagong$c */
    public class C1923c implements OnClickListener {
        public C1923c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(chittagong.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_64.html");
            chittagong.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.chittagong$d */
    public class C1924d implements OnClickListener {
        public C1924d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(chittagong.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_14.html");
            chittagong.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.chittagong$e */
    public class C1925e implements OnClickListener {
        public C1925e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(chittagong.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_15.html");
            chittagong.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.chittagong$f */
    public class C1926f implements OnClickListener {
        public C1926f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(chittagong.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_16.html");
            chittagong.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.chittagong$g */
    public class C1927g implements OnClickListener {
        public C1927g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(chittagong.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_17.html");
            chittagong.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.chittagong$h */
    public class C1928h implements OnClickListener {
        public C1928h() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(chittagong.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_18.html");
            chittagong.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.chittagong$i */
    public class C1929i implements OnClickListener {
        public C1929i() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(chittagong.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_19.html");
            chittagong.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.chittagong$j */
    public class C1930j implements OnClickListener {
        public C1930j() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(chittagong.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_20.html");
            chittagong.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.chittagong$k */
    public class C1931k implements OnClickListener {
        public C1931k() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(chittagong.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_21.html");
            chittagong.this.startActivity(intent);
        }
    }

    public chittagong() {
        Class<chittagong> cls = chittagong.class;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_chittagong);
        Button button = (Button) findViewById(R.id.bt14);
        Button button2 = (Button) findViewById(R.id.bt15);
        Button button3 = (Button) findViewById(R.id.bt16);
        Button button4 = (Button) findViewById(R.id.bt17);
        Button button5 = (Button) findViewById(R.id.bt18);
        Button button6 = (Button) findViewById(R.id.bt19);
        Button button7 = (Button) findViewById(R.id.bt20);
        Button button8 = (Button) findViewById(R.id.bt21);
        Button button9 = (Button) findViewById(R.id.bt22);
        Button button10 = (Button) findViewById(R.id.bt23);
        ((Button) findViewById(R.id.bt64)).setOnClickListener(new C1923c());
        button.setOnClickListener(new C1924d());
        button2.setOnClickListener(new C1925e());
        button3.setOnClickListener(new C1926f());
        button4.setOnClickListener(new C1927g());
        button5.setOnClickListener(new C1928h());
        button6.setOnClickListener(new C1929i());
        button7.setOnClickListener(new C1930j());
        button8.setOnClickListener(new C1931k());
        button9.setOnClickListener(new C1921a());
        button10.setOnClickListener(new C1922b());

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
