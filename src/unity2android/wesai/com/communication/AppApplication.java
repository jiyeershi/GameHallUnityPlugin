package unity2android.wesai.com.communication;

import android.util.Log;

import com.wesai.games.joint.sdk.WSGameSDKApplication;

public class AppApplication extends WSGameSDKApplication {
    public void onCreate() {
        super.onCreate();
        Log.d("unity2android.wesai", "WSGameSDKApplication");
    }
}
