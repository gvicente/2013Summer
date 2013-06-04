package me.xiangchen.app.dolcefarniente;

import android.widget.LinearLayout;

import com.sony.smallapp.SmallAppWindow;
import com.sony.smallapp.SmallApplication;

public class DolceFarNiente extends SmallApplication {

	final int width = 200;
	final int height = 300; 
	LinearLayout layout;
	@Override
    public void onCreate() {
        super.onCreate();
        
        layout = new LinearLayout(this);
        setContentView(layout);
        
        SmallAppWindow.Attributes attr = getWindow().getAttributes();
        attr.width = width;
        attr.height = height;
        
        getWindow().setAttributes(attr);
	}
	
	@Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
	
}
