package unity2android.wesai.com.communication;

import android.os.Bundle;
import android.util.Log;

import com.unity3d.player.UnityPlayerActivity;

public class MainActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("--------", "-------------------------------------------------");
    }

    public int add(int a, int b){
        return a + b;
    }
}
