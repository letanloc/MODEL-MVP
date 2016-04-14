package efood.com.mvp.Persenter;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;

import efood.com.mvp.Model.Counter;
import efood.com.mvp.Views.CounterView;

/**
 * Created by loc on 14/04/2016.
 */

public class CouterPersenter implements Persenter<CounterView> {

    CounterView view;
    private Counter counter;

    public CouterPersenter() {
        this(new Counter(0));
    }

    @VisibleForTesting
    public CouterPersenter(@NonNull Counter counter) {
        this.counter = counter;
    }

    @Override
    public void setView(CounterView v) {
        this.view = v;

    }

    public void DoInBackGroud() {
            // thực hien tra du lieu ve string cho view nhân
        view.setCounterText(String.valueOf(counter.Sumcouter())
        );
    }
}

