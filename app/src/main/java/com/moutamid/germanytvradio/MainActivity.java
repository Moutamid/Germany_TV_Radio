package com.moutamid.germanytvradio;

import static com.moutamid.germanytvradio.Settings_Activity.SHARED_PREFS;
import static com.moutamid.germanytvradio.Settings_Activity.TEXT1_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class MainActivity extends AppCompatActivity {

    CardView fav , setting , help , policy , more , rate , report;
    CardView channel , radio;
    TextView title_main;
    TextView title_lang;
    TextView text_fav;
    TextView text_setting;
    TextView text_help;
    TextView text_term;
    TextView text_more;
    TextView text_rate;
    TextView text_report;
    TextView text_channel;
    TextView text_radio;

    Context context;
    Resources resources;
    private String text1_1;

    @Override
    protected void onStart() {
        loadData();
        String lang = title_lang.getText().toString().trim();
        if (lang.equals("English")){
            context = LocaleHelper.setLocale(MainActivity.this, "en");
            resources = context.getResources();
            title_main.setText(resources.getString(R.string.germany_tv_radio));
            text_fav.setText(resources.getString(R.string.favorites));
            text_setting.setText(resources.getString(R.string.settings));
            text_help.setText(resources.getString(R.string.help));
            text_term.setText(resources.getString(R.string.policy_terms));
            text_more.setText(resources.getString(R.string.more_apps));
            text_rate.setText(resources.getString(R.string.rate_us));
            text_report.setText(resources.getString(R.string.report));
            text_channel.setText(resources.getString(R.string.live_tv_channels));
            text_radio.setText(resources.getString(R.string.live_radio));
        }
        if (lang.equals("French")){
            context = LocaleHelper.setLocale(MainActivity.this, "fr");
            resources = context.getResources();
            title_main.setText(resources.getString(R.string.germany_tv_radio));
            text_fav.setText(resources.getString(R.string.favorites));
            text_setting.setText(resources.getString(R.string.settings));
            text_help.setText(resources.getString(R.string.help));
            text_term.setText(resources.getString(R.string.policy_terms));
            text_more.setText(resources.getString(R.string.more_apps));
            text_rate.setText(resources.getString(R.string.rate_us));
            text_report.setText(resources.getString(R.string.report));
            text_channel.setText(resources.getString(R.string.live_tv_channels));
            text_radio.setText(resources.getString(R.string.live_radio));
        }
        if (lang.equals("German")){
            context = LocaleHelper.setLocale(MainActivity.this, "de");
            resources = context.getResources();
            title_main.setText(resources.getString(R.string.germany_tv_radio));
            text_fav.setText(resources.getString(R.string.favorites));
            text_setting.setText(resources.getString(R.string.settings));
            text_help.setText(resources.getString(R.string.help));
            text_term.setText(resources.getString(R.string.policy_terms));
            text_more.setText(resources.getString(R.string.more_apps));
            text_rate.setText(resources.getString(R.string.rate_us));
            text_report.setText(resources.getString(R.string.report));
            text_channel.setText(resources.getString(R.string.live_tv_channels));
            text_radio.setText(resources.getString(R.string.live_radio));
        }
        if (lang.equals("Arabic")){
            context = LocaleHelper.setLocale(MainActivity.this, "ar");
            resources = context.getResources();
            title_main.setText(resources.getString(R.string.germany_tv_radio));
            text_fav.setText(resources.getString(R.string.favorites));
            text_setting.setText(resources.getString(R.string.settings));
            text_help.setText(resources.getString(R.string.help));
            text_term.setText(resources.getString(R.string.policy_terms));
            text_more.setText(resources.getString(R.string.more_apps));
            text_rate.setText(resources.getString(R.string.rate_us));
            text_report.setText(resources.getString(R.string.report));
            text_channel.setText(resources.getString(R.string.live_tv_channels));
            text_radio.setText(resources.getString(R.string.live_radio));
        }
        if (lang.equals("Turkish")){
            context = LocaleHelper.setLocale(MainActivity.this, "tr");
            resources = context.getResources();
            title_main.setText(resources.getString(R.string.germany_tv_radio));
            text_fav.setText(resources.getString(R.string.favorites));
            text_setting.setText(resources.getString(R.string.settings));
            text_help.setText(resources.getString(R.string.help));
            text_term.setText(resources.getString(R.string.policy_terms));
            text_more.setText(resources.getString(R.string.more_apps));
            text_rate.setText(resources.getString(R.string.rate_us));
            text_report.setText(resources.getString(R.string.report));
            text_channel.setText(resources.getString(R.string.live_tv_channels));
            text_radio.setText(resources.getString(R.string.live_radio));
        }
        if (lang.equals("Russian")){
            context = LocaleHelper.setLocale(MainActivity.this, "ru");
            resources = context.getResources();
            title_main.setText(resources.getString(R.string.germany_tv_radio));
            text_fav.setText(resources.getString(R.string.favorites));
            text_setting.setText(resources.getString(R.string.settings));
            text_help.setText(resources.getString(R.string.help));
            text_term.setText(resources.getString(R.string.policy_terms));
            text_more.setText(resources.getString(R.string.more_apps));
            text_rate.setText(resources.getString(R.string.rate_us));
            text_report.setText(resources.getString(R.string.report));
            text_channel.setText(resources.getString(R.string.live_tv_channels));
            text_radio.setText(resources.getString(R.string.live_radio));
        }
        if (lang.equals("Spanish")){
            context = LocaleHelper.setLocale(MainActivity.this, "es");
            resources = context.getResources();
            title_main.setText(resources.getString(R.string.germany_tv_radio));
            text_fav.setText(resources.getString(R.string.favorites));
            text_setting.setText(resources.getString(R.string.settings));
            text_help.setText(resources.getString(R.string.help));
            text_term.setText(resources.getString(R.string.policy_terms));
            text_more.setText(resources.getString(R.string.more_apps));
            text_rate.setText(resources.getString(R.string.rate_us));
            text_report.setText(resources.getString(R.string.report));
            text_channel.setText(resources.getString(R.string.live_tv_channels));
            text_radio.setText(resources.getString(R.string.live_radio));
        }
        if (lang.equals("Urdu")){
            context = LocaleHelper.setLocale(MainActivity.this, "ur");
            resources = context.getResources();
            title_main.setText(resources.getString(R.string.germany_tv_radio));
            text_fav.setText(resources.getString(R.string.favorites));
            text_setting.setText(resources.getString(R.string.settings));
            text_help.setText(resources.getString(R.string.help));
            text_term.setText(resources.getString(R.string.policy_terms));
            text_more.setText(resources.getString(R.string.more_apps));
            text_rate.setText(resources.getString(R.string.rate_us));
            text_report.setText(resources.getString(R.string.report));
            text_channel.setText(resources.getString(R.string.live_tv_channels));
            text_radio.setText(resources.getString(R.string.live_radio));
        }

        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title_main = findViewById(R.id.title_main);
        title_lang = findViewById(R.id.title_lang);
        text_fav = findViewById(R.id.text_fav);
        text_setting = findViewById(R.id.text_setting);
        text_help = findViewById(R.id.text_help);
        text_term = findViewById(R.id.text_term);
        text_more = findViewById(R.id.text_more);
        text_rate = findViewById(R.id.text_rate);
        text_report = findViewById(R.id.text_report);
        text_channel = findViewById(R.id.text_channel);
        text_radio = findViewById(R.id.text_radio);

        fav = findViewById(R.id.card_fav_geramny);
        setting = findViewById(R.id.card_setting_geramny);
        help = findViewById(R.id.card_help_geramny);
        policy = findViewById(R.id.card_policy_geramny);
        more = findViewById(R.id.card_more_geramny);
        rate = findViewById(R.id.card_rate_geramny);
        report = findViewById(R.id.card_report_geramny);
        channel = findViewById(R.id.card_channel_germany);
        radio = findViewById(R.id.card_radio_germany);

        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Favorities.class);
                startActivity(intent);
                Animatoo.animateShrink(MainActivity.this);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Settings_Activity.class);
                startActivity(intent);
                Animatoo.animateShrink(MainActivity.this);
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
                startActivity(browserIntent);
            }
        });

        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
                startActivity(browserIntent);
            }
        });

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
                startActivity(browserIntent);
            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=$packageName")));
            }
        });

        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:to@gmail.com")));
            }
        });

        channel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Channel_Activity.class);
                startActivity(intent);
                Animatoo.animateShrink(MainActivity.this);
            }
        });

        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Radio_Activity.class);
                startActivity(intent);
                Animatoo.animateShrink(MainActivity.this);
            }
        });

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS , MODE_PRIVATE);
        text1_1 = sharedPreferences.getString(TEXT1_1 , "English");
        title_lang.setText(text1_1);
    }
}