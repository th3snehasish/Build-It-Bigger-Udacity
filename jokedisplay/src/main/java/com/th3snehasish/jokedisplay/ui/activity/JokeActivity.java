package com.th3snehasish.jokedisplay.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.th3snehasish.jokedisplay.R;
import com.th3snehasish.jokedisplay.ui.fragment.JokeFragment;

/**
 * Created by th3snehasish on 11/08/16.
 */
public class JokeActivity extends AppCompatActivity {

    public static String EXTRA_JOKE = "extra_joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        if (savedInstanceState == null) {
            Bundle bundle = new Bundle();
            bundle.putString(EXTRA_JOKE, getIntent().getStringExtra(EXTRA_JOKE));

            JokeFragment frag = new JokeFragment();
            frag.setArguments(bundle);

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, frag)
                    .commit();
        }
    }
}
