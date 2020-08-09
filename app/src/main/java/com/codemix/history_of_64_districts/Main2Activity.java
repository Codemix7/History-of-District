package com.codemix.history_of_64_districts;


import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;


import com.google.android.material.navigation.NavigationView;


public class Main2Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout Q;
    private NavigationView nv;
    ActionBarDrawerToggle toggle;

    private CardView Dhaka,khulna,ctg,barisal,Rangpur,Rajsahi,sylet,moymong,bibit,post,share,rating;


    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main2);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        this.Q = (DrawerLayout) this.findViewById(R.id.drawerlayoutid);
        toggle = new ActionBarDrawerToggle(this, Q, R.string.nav_open, R.string.nav_close);
        Q.addDrawerListener(toggle);
        toggle.syncState();
        nv = (NavigationView)findViewById(R.id.navigationid);
        nv.setNavigationItemSelectedListener(this);

          Dhaka= findViewById(R.id.card_dhaka);
          Rajsahi= findViewById(R.id.card_rajsahi);
         khulna= findViewById(R.id.card_khullna);
         barisal= findViewById(R.id.card_barishal);
        sylet= findViewById(R.id.card_sylhet);
        bibit= findViewById(R.id.card_bibid);
        ctg= findViewById(R.id.card_ctg);
        moymong= findViewById(R.id.card_mymsnsingh);
        Rangpur= findViewById(R.id.card_rangpur);
        rating= findViewById(R.id.card_rating);
        share= findViewById(R.id.card_share);
        post= findViewById(R.id.card_play);

        Dhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Dhaka.class);
                startActivity(intent);

            }
        });

        Rajsahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, rajsahi.class);
                startActivity(intent);

            }
        });

        Rangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, rongpur.class);
                startActivity(intent);

            }
        });

        barisal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, barisal.class);
                startActivity(intent);

            }
        });

        khulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, khulna.class);
                startActivity(intent);

            }
        });

        moymong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, momenshahi.class);
                startActivity(intent);

            }
        });

        bibit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, bibid.class);
                startActivity(intent);

            }
        });

        sylet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, sylhet.class);
                startActivity(intent);

            }
        });

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, post.class);
                startActivity(intent);

            }
        });

        ctg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, chittagong.class);
                startActivity(intent);

            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Dhaka.class);
                startActivity(intent);

            }
        });
        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Dhaka.class);
                startActivity(intent);

            }
        });



    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.home) {
            Intent intent = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(intent);
        }

        String str = "https://www.facebook.com/codemix7";
        String str2 = "android.intent.action.VIEW";
        if (menuItem.getItemId() == R.id.facebook) {
            Intent intent = new Intent(str2);
            intent.setData(Uri.parse(str));
            startActivity(intent);
        }
        if (menuItem.getItemId() == R.id.rateid) {
            Intent intent2 = new Intent(str2);
            intent2.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.codemix.car_repair"));
            startActivity(intent2);
        }

        if (menuItem.getItemId() == R.id.moreappsmend) {
            Intent intent4 = new Intent(str2);
            intent4.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Code+Mix"));
            startActivity(intent4);
        }
        if (menuItem.getItemId() == R.id.UpdateId) {
            String url = "https://play.google.com/store/apps/details?id=com.codemix.car_repair";
            Intent up = new Intent(Intent.ACTION_VIEW);
            up.setData(Uri.parse(url));
            startActivity(up);

        }
        if (menuItem.getItemId() == R.id.gk) {
            Intent intent6 = new Intent(str2);
            intent6.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.codemix.powerofpositivethink"));
            startActivity(intent6);
        }
        if (menuItem.getItemId() == R.id.EnglishSikun) {
            Intent intent7 = new Intent(str2);
            intent7.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.codemix.iloveyousms"));
            startActivity(intent7);
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.aboutusid:
                Intent i = new Intent(Main2Activity.this, about.class);
                startActivity(i);

                break;
            case R.id.shareid:

                Intent s = new Intent(Intent.ACTION_SEND);
                s.setAction(Intent.ACTION_SEND);
                s.setType("text/plain");
                s.putExtra(Intent.EXTRA_TEXT, "Car problem and solution \\n\\n Be a Master in the Car problem and solution. \\n Any suggestion and advice highly appreciated from all of you. Please rate us and give your comments in rating box. \\n\\n App Link: https://play.google.com/store/apps/details?id=com.codemix.car_repair");

                startActivity(s);
                break;
            case R.id.exit:
                AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
                builder.setTitle("Rate Us");
                builder.setIcon(R.drawable.logo);
                builder.setMessage("Click the 'Rate' button to give your valuable feedback and 5 star rating. Click 'Get Out' button to get out!")
                        .setPositiveButton("RATE US", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                String url = "https://play.google.com/store/apps/details?id=com.codemix.car_repair";
                                Intent up = new Intent(Intent.ACTION_VIEW);
                                up.setData(Uri.parse(url));
                                startActivity(up);
                            }
                        })
                        .setNeutralButton("MORE APPS", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                String url = "https://play.google.com/store/apps/developer?id=Code+Mix";
                                Intent up = new Intent(Intent.ACTION_VIEW);
                                up.setData(Uri.parse(url));
                                startActivity(up);
                            }
                        })
                        .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                            }


                        });
                AlertDialog alert = builder.create();
                alert.show();
                break;

        }


        if (toggle.onOptionsItemSelected(item))


            return true;
        return super.onOptionsItemSelected(item);


    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
        builder.setTitle("Rate Us");
        builder.setIcon(R.drawable.logo);
        builder.setMessage("Click the 'Rate' button to give your valuable feedback and 5 star rating. Click 'Get Out' button to get out!")
                .setPositiveButton("RATE US", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        String url = "https://play.google.com/store/apps/details?id=com.codemix.car_repair";
                        Intent up = new Intent(Intent.ACTION_VIEW);
                        up.setData(Uri.parse(url));
                        startActivity(up);
                    }
                })
                .setNeutralButton("MORE APPS", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        String url = "https://play.google.com/store/apps/developer?id=Code+Mix";
                        Intent up = new Intent(Intent.ACTION_VIEW);
                        up.setData(Uri.parse(url));
                        startActivity(up);
                    }
                })
                .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }


                });
        AlertDialog alert = builder.create();
        alert.show();

    }



}
