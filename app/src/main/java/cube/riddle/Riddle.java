package cube.riddle;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by A N Khare on 31-08-2015.
 */
public class Riddle extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "xYE7ORZZx48NByxo9N3vEPMFi0Xqwsa4nF7N2YOm", "Sz5RSEVGPVKYUyB5JGtnuU7TLuMdWkaKyF4JDIA0");

    }
}
