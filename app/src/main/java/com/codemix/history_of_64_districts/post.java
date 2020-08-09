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



public class post extends AppCompatActivity {



    /* renamed from: com.trmlab.history_of_64_districts.post$a */
    public class C1946a implements OnClickListener {
        public C1946a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(post.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/b1.html");
            post.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.post$b */
    public class C1947b implements OnClickListener {
        public C1947b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(post.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/b2.html");
            post.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.post$c */
    public class C1948c implements OnClickListener {
        public C1948c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(post.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/b3.html");
            post.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.post$d */
    public class C1949d implements OnClickListener {
        public C1949d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(post.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/b3.html");
            post.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.post$e */
    public class C1950e implements OnClickListener {
        public C1950e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(post.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/b4.html");
            post.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.post$f */
    public class C1951f implements OnClickListener {
        public C1951f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(post.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/b5.html");
            post.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.post$g */
    public class C1952g implements OnClickListener {
        public C1952g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(post.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/b6.html");
            post.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.history_of_64_districts.post$h */
    public class C1953h implements OnClickListener {
        public C1953h() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(post.this, Main3Activity.class);
            intent.putExtra("URL", "file:///android_asset/b7.html");
            post.this.startActivity(intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_post);

        CardView cardView = (CardView) findViewById(R.id.card_1);
        CardView cardView2 = (CardView) findViewById(R.id.card_2);
        CardView cardView3 = (CardView) findViewById(R.id.card_3);
        CardView cardView4 = (CardView) findViewById(R.id.card_4);
        CardView cardView5 = (CardView) findViewById(R.id.card_5);
        CardView cardView6 = (CardView) findViewById(R.id.card_7);
        ((CardView) findViewById(R.id.card_6)).setOnClickListener(new C1946a());
        cardView.setOnClickListener(new C1947b());
        cardView2.setOnClickListener(new C1948c());
        cardView2.setOnClickListener(new C1949d());
        cardView3.setOnClickListener(new C1950e());
        cardView4.setOnClickListener(new C1951f());
        cardView5.setOnClickListener(new C1952g());
        cardView6.setOnClickListener(new C1953h());

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
