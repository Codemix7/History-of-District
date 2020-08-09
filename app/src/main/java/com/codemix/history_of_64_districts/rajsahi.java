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


public class rajsahi extends AppCompatActivity {



    /* renamed from: com.trmlab.history_of_64_districts.rajsahi$a */
    public class C1954a implements OnClickListener {
        public C1954a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(rajsahi.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_24.html");
            rajsahi.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.rajsahi$b */
    public class C1955b implements OnClickListener {
        public C1955b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(rajsahi.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_25.html");
            rajsahi.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.rajsahi$c */
    public class C1956c implements OnClickListener {
        public C1956c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(rajsahi.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_26.html");
            rajsahi.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.rajsahi$d */
    public class C1957d implements OnClickListener {
        public C1957d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(rajsahi.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_27.html");
            rajsahi.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.rajsahi$e */
    public class C1958e implements OnClickListener {
        public C1958e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(rajsahi.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_28.html");
            rajsahi.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.rajsahi$f */
    public class C1959f implements OnClickListener {
        public C1959f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(rajsahi.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_29.html");
            rajsahi.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.rajsahi$g */
    public class C1960g implements OnClickListener {
        public C1960g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(rajsahi.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_30.html");
            rajsahi.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.rajsahi$h */
    public class C1961h implements OnClickListener {
        public C1961h() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(rajsahi.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_31.html");
            rajsahi.this.startActivity(intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_rajsahi);
        Button button = (Button) findViewById(R.id.bt25);
        Button button2 = (Button) findViewById(R.id.bt26);
        Button button3 = (Button) findViewById(R.id.bt27);
        Button button4 = (Button) findViewById(R.id.bt28);
        Button button5 = (Button) findViewById(R.id.bt29);
        Button button6 = (Button) findViewById(R.id.bt30);
        Button button7 = (Button) findViewById(R.id.bt31);
        ((Button) findViewById(R.id.bt24)).setOnClickListener(new C1954a());
        button.setOnClickListener(new C1955b());
        button2.setOnClickListener(new C1956c());
        button3.setOnClickListener(new C1957d());
        button4.setOnClickListener(new C1958e());
        button5.setOnClickListener(new C1959f());
        button6.setOnClickListener(new C1960g());
        button7.setOnClickListener(new C1961h());

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
