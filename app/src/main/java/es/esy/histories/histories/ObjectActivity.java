package es.esy.histories.histories;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.customtabs.CustomTabsIntent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ObjectActivity extends AppCompatActivity {

    public String name;
    public String description;
    public String website;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object);

        name = getIntent().getStringExtra("name");
        description = getIntent().getStringExtra("description");
        website = getIntent().getStringExtra("website");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(name);
        setSupportActionBar(toolbar);

        TextView descriptionArea = (TextView) findViewById(R.id.sight_content_description);
        descriptionArea.setText(description);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                CustomTabsIntent customTabsIntent = builder.setToolbarColor(ContextCompat.getColor(ObjectActivity.this, R.color.colorPrimary)).build();
                customTabsIntent.launchUrl(ObjectActivity.this, Uri.parse(website));
            }
        });
    }
}
