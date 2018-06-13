package proteam.com.bai_6_actionbar_toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ActionBarActivity extends AppCompatActivity {
    private AppCompatButton btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actionbar);

        btnNext = (AppCompatButton)findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActionBarActivity.this, SecondActivity.class));
            }
        });

        // set title of actionbar
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        setTitle("This is Activity 1");

        // change button home default of actionbar
         getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);

        //nhan nut home tra ve 1 level chu khong ve top level
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Toast.makeText(ActionBarActivity.this, "Click Home button",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_bookmark:
                Toast.makeText(ActionBarActivity.this, "Ban vua chon nut Selected",
                        Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_save:
                Toast.makeText(ActionBarActivity.this, "Ban vua chon nut Save",
                        Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_search:
                Toast.makeText(ActionBarActivity.this, "Ban vua chon nut Search",
                        Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_share:
                Toast.makeText(ActionBarActivity.this, "Ban vua chon nut Share",
                        Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_delete:
                Toast.makeText(ActionBarActivity.this, "Ban vua chon nut Delete",
                        Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_preferences:
                Toast.makeText(ActionBarActivity.this, "Ban vua chon nut Preferences",
                        Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
