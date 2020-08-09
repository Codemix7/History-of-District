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


public class momenshahi extends AppCompatActivity {



    /* renamed from: com.trmlab.history_of_64_districts.momenshahi$a */
    public class C1942a implements OnClickListener {
        public C1942a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(momenshahi.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_60.html");
            momenshahi.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.momenshahi$b */
    public class C1943b implements OnClickListener {
        public C1943b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(momenshahi.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_61.html");
            momenshahi.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.momenshahi$c */
    public class C1944c implements OnClickListener {
        public C1944c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(momenshahi.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_62.html");
            momenshahi.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.momenshahi$d */
    public class C1945d implements OnClickListener {
        public C1945d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(momenshahi.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/doc_63.html");
            momenshahi.this.startActivity(intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_momenshahi);
        Button button = (Button) findViewById(R.id.bt61);
        Button button2 = (Button) findViewById(R.id.bt62);
        Button button3 = (Button) findViewById(R.id.bt63);
        ((Button) findViewById(R.id.bt60)).setOnClickListener(new C1942a());
        button.setOnClickListener(new C1943b());
        button2.setOnClickListener(new C1944c());
        button3.setOnClickListener(new C1945d());

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
