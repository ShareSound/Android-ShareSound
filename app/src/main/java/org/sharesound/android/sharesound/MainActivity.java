package org.sharesound.android.sharesound;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.NavigationView;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = MainActivity.class.getName();
    private DrawerLayout mDrawer;
    private TextView mTextNavUserName, mTextNavUserEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        /*switch (item.getItemId()) {
            case R.id.menu_nav_logout:
                Public.AudioS.userLogout().enqueue(mLogoutCallback);
                Toast.makeText(MainActivity.this, R.string.processing, Toast.LENGTH_SHORT).show();
                break;
        }
        mDrawer.closeDrawer(GravityCompat.START);*/
        return true;
    }
}
