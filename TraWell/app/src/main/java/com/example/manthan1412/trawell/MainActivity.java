package com.example.manthan1412.trawell;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.text.ParseException;
import java.util.List;

import static com.example.manthan1412.trawell.R.id.navigation_drawer;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "eEATgoc82MA0HW8Vx0fW18CKWwpFfod7bAwFNtQg", "Mo3zMcxShre7j8Glf4Oz9LGeSp02LbjwrKDsxoDk");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();

        /*String[] s = {"Lords","Belle View In","Silver Stay","Lively Lounge"};
        ListAdapter l = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,s);
        ListView lv = (ListView)findViewById(R.id.lview);
        lv.setAdapter(l);

        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent,View view,int position,long id){
                        String a = String.valueOf(parent.getItemAtPosition(position+1));
                        Toast.makeText(MainActivity.this, a, Toast.LENGTH_LONG).show();
                    }

                }
        );*/

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }
    /*public void reverse() {
        EditText e1 = (EditText) findViewById(R.id.editText2);
        EditText e2 = (EditText) findViewById(R.id.editText3);
        String s = e1.getText().toString();
        e1.setText(e2.getText().toString());
        e2.setText(s);
    }*/

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        switch(position){
            case 0:
                mTitle = getString(R.string.title_section1);
                TrendingFragment fragment = new TrendingFragment();
                ft.replace(R.id.container, fragment)
                        .commit();
                break;
            case 1:
                mTitle = getString(R.string.title_section2);
                PlanFragment fragment1 = new PlanFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.container, fragment1)
                        .commit();
                break;
            case 2:
                mTitle = getString(R.string.title_section3);
                LocalFragment fragment2 = new LocalFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.container, fragment2)
                        .commit();
                break;
            case 3:



                mTitle = getString(R.string.title_section4);
                HotelFragment fragment3 = new HotelFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.container, fragment3)
                        .commit();
                break;
            case 8:
                mTitle = getString(R.string.title_section9);
                FeedFragment fragment4 = new FeedFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.container, fragment4)
                        .commit();

               /* Button button = (Button)findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText edit = (EditText)findViewById(R.id.editText);
                        String s = edit.getText().toString();
                        ParseObject testObject = new ParseObject("FeedBack");
                        testObject.put("feedback", s);
                        testObject.saveInBackground();
                    }
                });*/
                break;
            case 5:

                /*ParseQuery<ParseObject> query = ParseQuery.getQuery("NearBy");
                query.findInBackground(new FindCallback<ParseObject>() {

                    public void done(List<ParseObject> userList, ParseException e) {
                        if (e == null) {
                            if (userList.size() > 0) {
                                String s = new String();
                                for (int i = 0; i < userList.size(); i++) {
                                    ParseObject p = userList.get(i);
                                    String from = p.getString("From");
                                    String to = p.getString("To");
                                    String distance = p.getString("Distance");
                                    s = s+from + "    "+to+"  "+" "+distance+"\n";
                                }
                                TextView t = (TextView) findViewById(R.id.textView2);
                                t.setText(s);
                            }

                        } else {
                            Log.d("score", "Error: " + e.getMessage());
                            // Alert.alertOneBtn(getActivity(),"Something went wrong!");
                        }
                    }

                    @Override
                    public void done(List<ParseObject> parseObjects, com.parse.ParseException e) {

                    }
                });*/

                /*ParseQuery<ParseObject> query = ParseQuery.getQuery("GameScore");
                query.getInBackground("xWMyZ4YEGZ", new GetCallback<ParseObject>() {
                    public void done(ParseObject object, ParseException e) {
                        if (e == null) {
                            if(object.size())
                        } else {
                            // something went wrong
                        }
                    }

                    @Override
                    public void done(ParseObject parseObject, com.parse.ParseException e) {

                    }
                });*/

                    /*@Override
                    public void done(ParseObject parseObject, com.parse.ParseException e) {

                    }
                });*/

                mTitle = getString(R.string.title_section6);
                break;
            case 6:
                mTitle = getString(R.string.title_section7);
                break;
            case 7:
                mTitle = getString(R.string.title_section8);
                break;
            case 4:
                mTitle = getString(R.string.title_section5);
                LogFragment fragment5 = new LogFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.container, fragment5)
                        .commit();
                break;
        }
        /*FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit();*/
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
            case 4:
                mTitle = getString(R.string.title_section4);
                break;
            case 5:
                mTitle = getString(R.string.title_section5);
                break;
            case 6:
                mTitle = getString(R.string.title_section6);
                break;
            case 7:
                mTitle = getString(R.string.title_section7);
                break;
            case 8:
                mTitle = getString(R.string.title_section8);
                break;
            case 9:
                mTitle = getString(R.string.title_section9);
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
