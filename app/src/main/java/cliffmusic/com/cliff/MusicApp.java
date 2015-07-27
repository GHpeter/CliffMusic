package cliffmusic.com.cliff;

import android.app.Application;

import cliffmusic.com.cliff.service.ServiceManager;

/**
 * Created by Peter on 2015/7/24.
 */
public class MusicApp extends Application {
    public static boolean mIsSleepClockSettiing = false;
    public static ServiceManager mServiceManager = null;
    private static String rootPath = "/cliffMusic";
    public static String lrcPath = "/lrc";
}
