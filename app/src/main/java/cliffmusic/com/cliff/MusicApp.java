package cliffmusic.com.cliff;

import android.app.Application;
import android.os.Environment;

import java.io.File;

import cliffmusic.com.cliff.service.ServiceManager;

/**
 * Created by Peter on 2015/7/24.
 */
public class MusicApp extends Application {
    public static boolean mIsSleepClockSettiing = false;
    public static ServiceManager mServiceManager = null;
    private static String rootPath = "/cliffMusic";
    public static String lrcPath = "/lrc";

    @Override
    public void onCreate() {
        super.onCreate();
        mServiceManager=new ServiceManager(this);
        initPath();
    }
    private void initPath(){
        String ROOT="";
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){
            ROOT=Environment.getExternalStorageDirectory().getPath();
        }
        rootPath=ROOT+rootPath;
        lrcPath=rootPath+lrcPath;
        File lrcFile=new File(lrcPath);
        if (lrcFile.exists()){
            lrcFile.mkdir();
        }
    }
}
