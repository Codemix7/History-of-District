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


public class rongpur extends AppCompatActivity {



    /* renamed from: com.trmlab.history_of_64_districts.rongpur$a */
    public class C1962a implements OnClickListener {
        public C1962a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(rongpur.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_52.html");
            rongpur.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.rongpur$b */
    public class C1963b implements OnClickListener {
        public C1963b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(rongpur.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_53.html");
            rongpur.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.rongpur$c */
    public class C1964c implements OnClickListener {
        public C1964c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(rongpur.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_54.html");
            rongpur.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.rongpur$d */
    public class C1965d implements OnClickListener {
        public C1965d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(rongpur.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_55.html");
            rongpur.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.rongpur$e */
    public class C1966e implements OnClickListener {
        public C1966e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(rongpur.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_56.html");
            rongpur.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.rongpur$f */
    public class C1967f implements OnClickListener {
        public C1967f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(rongpur.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_57.html");
            rongpur.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.rongpur$g */
    public class C1968g implements OnClickListener {
        public C1968g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(rongpur.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_58.html");
            rongpur.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.rongpur$h */
    public class C1969h implements OnClickListener {
        public C1969h() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(rongpur.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_59.html");
            rongpur.this.startActivity(intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_rongpur);
        Button button = (Button) findViewById(R.id.bt53);
        Button button2 = (Button) findViewById(R.id.bt54);
        Button button3 = (Button) findViewById(R.id.bt55);
        Button button4 = (Button) findViewById(R.id.bt56);
        Button button5 = (Button) findViewById(R.id.bt57);
        Button button6 = (Button) findViewById(R.id.bt58);
        Button button7 = (Button) findViewById(R.id.bt59);
        ((Button) findViewById(R.id.bt52)).setOnClickListener(new C1962a());
        button.setOnClickListener(new C1963b());
        button2.setOnClickListener(new C1964c());
        button3.setOnClickListener(new C1965d());
        button4.setOnClickListener(new C1966e());
        button5.setOnClickListener(new C1967f());
        button6.setOnClickListener(new C1968g());
        button7.setOnClickListener(new C1969h());

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
