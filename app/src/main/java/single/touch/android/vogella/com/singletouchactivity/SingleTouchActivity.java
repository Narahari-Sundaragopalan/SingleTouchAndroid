package single.touch.android.vogella.com.singletouchactivity;


import android.os.Bundle;
import android.app.Activity;

public class SingleTouchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new TouchEventView(this, null));
    }
}
