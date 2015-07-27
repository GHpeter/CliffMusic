package cliffmusic.com.cliff.constantInterface;

/**
 * 项目中所用到的常量
 * Created by Peter on 2015/7/24.
 */
public interface MyConstants {
    //广播
    public static final String BROADCAST_NAME = "cliffmusic.com.cliff.broadcast";
    public static final String SERVICE_NAME = "cliffmusic.com.cliff.service.MediaService";
    public static final String BROADCAST_QUERY_COMPLETE_NAME = "cliffmusic.com.cliff.service.querycomplete.broadcast";
    public static final String BROADCAST_CHANGEBG = "cliffmusic.com.cliff.changebg";
    //是否开启了震动模式
    public static final String SHAKE_ON_OFF = "SHAKE_ON_OFF";
    //SharedPreferences
    public static final String SP_NAME = "cliffmusic.com.cliff.preference";
    public static final String SP_BG_PATH = "bg_path";
    public static final String SP_SHAEK_CHANGE_SONG = "shake_change_song";
    public static final String SP_AUTO_DOWNLOAD_LYRIC = "auto_download_lyric";
    public static final String SP_FILTER_SIZE = "filter_size";
    public static final String SP_FILTER_TIME = "filter_time";
    public static final int REFRESH_PROGRESS_EVENT = 1;
    //播放状态
    public static final int MPS_NOFILE = -1; // 无音乐文件
    public static final int MPS_INVALID = 0; // 当前音乐文件无效
    public static final int MPS_PREPARE = 1; // 准备就绪
    public static final int MPS_PLAYING = 2; // 播放中
    public static final int MPS_PAUSE = 3; // 暂停
    // 播放模式
    public static final int MPM_LIST_LOOP_PLAY = 0; // 列表循环
    public static final int MPM_ORDER_PLAY = 1; // 顺序播放
    public static final int MPM_RANDOM_PLAY = 2; // 随机播放
    public static final int MPM_SINGLE_LOOP_PLAY = 3; // 单曲循环

    public static final String PLAY_STATE_NAME = "PLAY_STATE_NAME";
    public static final String PLAY_MUSIC_INDEX = "PLAY_MUSIC_INDEX";

    //歌手和专辑列表点击都会进入MyMusic 此时要传递参数表明是从哪里进入的
    public static final String FROM = "from";
    public static final int START_FROM_ARTIST = 1;//艺术家
    public static final int START_FROM_ALBUM = 2;//专辑
    public static final int START_FROM_LOCAL = 3;//本地
    public static final int START_FROM_FOLDER = 4;//文件夹
    public static final int START_FROM_FAVORITE = 5;//喜欢

    public static final int FOLDER_TO_MYMUSIC = 6;//文件夹-》音乐
    public static final int ALBUM_TO_MYMUSIC = 7;//专辑-》音乐
    public static final int ARTIST_TO_MYMUSIC = 8;//艺术家-》音乐

    public static final int MENU_BACKGROUND = 9;//后台


}
