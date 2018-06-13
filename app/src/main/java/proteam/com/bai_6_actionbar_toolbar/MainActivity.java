package proteam.com.bai_6_actionbar_toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private AppCompatButton btnActionBar;
    private AppCompatButton btnToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActionBar = (AppCompatButton) findViewById(R.id.btnActionBar);
        btnToolBar = (AppCompatButton) findViewById(R.id.btnToolBar);
        btnActionBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ActionBarActivity.class));
            }
        });

        btnToolBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ToolBarActivity.class));
            }
        });

    }

}
