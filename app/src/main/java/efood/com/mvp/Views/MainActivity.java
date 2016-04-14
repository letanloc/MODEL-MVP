package efood.com.mvp.Views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import efood.com.mvp.Persenter.CouterPersenter;
import efood.com.mvp.R;

public class MainActivity extends AppCompatActivity implements CounterView {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.BtnCount);
        final CouterPersenter couterPersenter = new CouterPersenter();
        couterPersenter.setView(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                couterPersenter.DoInBackGroud();
            }
        });
    }

    @Override
    public void setCounterText(String text) {
        button.setText(text);

    }
}
