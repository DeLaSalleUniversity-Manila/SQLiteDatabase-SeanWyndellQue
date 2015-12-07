package com.example.wynsean.petdatabase;

/**
 * Created by Jerald on 10/20/2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PhonesActivity extends Activity {

    public static final String EXTRA_DOGNO = "dogNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);

        //Get the drink from the intent
        int dogNo = (Integer)getIntent().getExtras().get(EXTRA_DOGNO);
        Phones dogs = Phones.dogs[dogNo];

        //Populate the drink image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(dogs.getImageResourceId());
        photo.setContentDescription(dogs.getName());

        //Populate the drink name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(dogs.getName());

        //Populate the drink description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(dogs.getDescription());
    }
}
