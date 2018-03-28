package com.avans2018.klasd.cineapp.presentation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.avans2018.klasd.cineapp.R;
import com.avans2018.klasd.cineapp.application_logic.OnItemClickListener;
import com.avans2018.klasd.cineapp.util.StringLimiter;

public class SeatSelectionActivity extends AppCompatActivity implements OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_selection);

        // TextView
        getSupportActionBar().setTitle(StringLimiter.limit(getResources().getString(R.string.seat_selection_title), 25));

        // Hier nog alle losse stoelen toevoegen

    }

    @Override
    public void onItemClick(int position) {

    }
}
