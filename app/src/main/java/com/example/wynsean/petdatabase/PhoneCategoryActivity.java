package com.example.wynsean.petdatabase;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Jerald on 10/20/2015.
 */
public class PhoneCategoryActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    ListView listDogs = getListView();
    ArrayAdapter<Phones> listAdapter = new ArrayAdapter<Phones>(this,
            android.R.layout.simple_list_item_1,
            Phones.dogs);
    listDogs.setAdapter(listAdapter);
}

    @Override
    public void onListItemClick(ListView listView,
                                View itemView,
                                int position,
                                long id) {
        Intent intent = new Intent(PhoneCategoryActivity.this, PhonesActivity.class);
        intent.putExtra(PhonesActivity.EXTRA_DOGNO, (int) id);
        startActivity(intent);
    }

}
