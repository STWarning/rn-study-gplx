package com.rnstudyproj;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactRootView;
import com.swmansion.gesturehandler.react.RNGestureHandlerEnabledRootView;
import android.os.Bundle;
import com.facebook.react.ReactFragmentActivity;

public class MainActivity extends ReactFragmentActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(null);
     }

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "RNStudyProj";
    }

    protected ReactActivityDelegate createReactActivityDelegate() {
     return new ReactActivityDelegate(this, getMainComponentName()) {
       @Override
       protected ReactRootView createRootView() {
        return new RNGestureHandlerEnabledRootView(MainActivity.this);
       }
     };
   }
}
