package a20180316.myplayer2;

import android.accessibilityservice.AccessibilityService;
import android.support.annotation.NonNull;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;

/**
 * Created by WHY on 2018/3/16.
 */

public class MyService extends AccessibilityService {
    private static final String TAG = "MyService";
    @Override
    public Object getSystemService(@NonNull String name) {
        return super.getSystemService(name);
    }

    @Override
    protected boolean onKeyEvent(KeyEvent event) {

        return super.onKeyEvent(event);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {

    }

    @Override
    public void onInterrupt() {

    }
}
