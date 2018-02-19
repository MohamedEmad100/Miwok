package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.miwok.Adapter.WordAdapter;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One","Lutti",R.drawable.number_one));
        words.add(new Word("Two","Otiiko",R.drawable.number_two));
        words.add(new Word("Three","Tolookosu",R.drawable.number_three));
        words.add(new Word("Four","Oyyisa",R.drawable.number_four));
        words.add(new Word("Five","Massokka",R.drawable.number_five));
        words.add(new Word("Six","Temmokka",R.drawable.number_six));
        words.add(new Word("Seven","Kenekaku",R.drawable.number_seven));
        words.add(new Word("Eight","Kawinta",R.drawable.number_eight));
        words.add(new Word("Nine","Wo’e",R.drawable.number_nine));
        words.add(new Word("Ten","Na’aacha",R.drawable.number_ten));



        WordAdapter itemsAdapter = new WordAdapter(this, words ,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

//        // Verify the contents of the list by printing out each element to the logs
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
//        Log.v("NumbersActivity", "Word at index 1: " + words.get(1));
//        Log.v("NumbersActivity", "Word at index 2: " + words.get(2));
//        Log.v("NumbersActivity", "Word at index 3: " + words.get(3));
//        Log.v("NumbersActivity", "Word at index 4: " + words.get(4));
//        Log.v("NumbersActivity", "Word at index 5: " + words.get(5));
//        Log.v("NumbersActivity", "Word at index 6: " + words.get(6));
//        Log.v("NumbersActivity", "Word at index 7: " + words.get(7));
//        Log.v("NumbersActivity", "Word at index 8: " + words.get(8));
//        Log.v("NumbersActivity", "Word at index 9: " + words.get(9));


//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        for (int index = 0; index < words.size(); index++){
//
//            TextView word = new TextView(this);
//            word.setText(words.get(index));
//            rootView.addView(word);
//
//        }

    }
}
