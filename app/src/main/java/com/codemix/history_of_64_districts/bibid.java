package com.codemix.history_of_64_districts;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class bibid extends AppCompatActivity {



    /* renamed from: com.trmlab.history_of_64_districts.bibid$a */
    public class C1915a implements OnClickListener {
        public C1915a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(bibid.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/h7.html");
            bibid.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.bibid$b */
    public class C1916b implements OnClickListener {
        public C1916b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(bibid.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/h1.html");
            bibid.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.bibid$c */
    public class C1917c implements OnClickListener {
        public C1917c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(bibid.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/h2.html");
            bibid.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.bibid$d */
    public class C1918d implements OnClickListener {
        public C1918d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(bibid.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/h3.html");
            bibid.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.bibid$e */
    public class C1919e implements OnClickListener {
        public C1919e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(bibid.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/h4.html");
            bibid.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.bibid$f */
    public class C1920f implements OnClickListener {
        public C1920f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(bibid.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/h5.html");
            bibid.this.startActivity(intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_bibid);
        CardView cardView = (CardView) findViewById(R.id.card_1);
        CardView cardView2 = (CardView) findViewById(R.id.card_2);
        CardView cardView3 = (CardView) findViewById(R.id.card_3);
        CardView cardView4 = (CardView) findViewById(R.id.card_4);
        CardView cardView5 = (CardView) findViewById(R.id.card_5);
        ((CardView) findViewById(R.id.card_6)).setOnClickListener(new C1915a());
        cardView.setOnClickListener(new C1916b());
        cardView2.setOnClickListener(new C1917c());
        cardView3.setOnClickListener(new C1918d());
        cardView4.setOnClickListener(new C1919e());
        cardView5.setOnClickListener(new C1920f());

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
