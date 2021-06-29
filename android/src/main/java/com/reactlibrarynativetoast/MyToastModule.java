// MyToastModule.java

package com.reactlibrarynativetoast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import android.content.Context;
import android.widget.Toast;

public class MyToastModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public MyToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "MyToast";
    }

    @ReactMethod
    public void show(String text) {
        Context context = getReactApplicationContext();
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }

    @ReactMethod
    public void showMyName() {
        Context context = getReactApplicationContext();
        Toast.makeText(context, "אבישי", Toast.LENGTH_LONG).show();
    }
}
