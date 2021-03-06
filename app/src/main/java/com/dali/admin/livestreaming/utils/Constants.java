package com.dali.admin.livestreaming.utils;

/**
 * @description: 静态函数
 */
public class Constants {

	public static final int PAGESIZE = 10;
	public static final int LIVE_PLAYER_REQUEST_CODE = 1000;
	public static final int START_LIVE_PLAY = 100;

	public static final int STATE_NORMAL = 0;
	public static final int STATE_REFRESH = 1;
	public static final int STATE_MORE = 2;


	/**
	 * 腾讯云服务配置专区（请自主替换）发布使用
	 */
	//云通信服务相关配置
	public static int IMSDK_ACCOUNT_TYPE = 9744;
	public static int IMSDK_APPID = 1400022288;

	/**
	 * 常量字符串
	 */
	public static final String USER_ID = "user_id";
	public static final String USER_NICK = "user_nick";
	public static final String USER_HEADPIC = "user_headpic";
	public static final String USER_LOC = "user_location";


	private final static int MAIN_CALL_BACK = 1;
	private final static int MAIN_PROCESS = 2;
	private final static int UPLOAD_AGAIN = 3;

	//封面图
	public final static int LIVE_COVER_TYPE = 1;
	//头像
	public final static int USER_HEAD_TYPE = 2;

	//主播退出广播字段
	public static final String EXIT_APP = "EXIT_APP";

	//文字长度限制
	public static final int USER_INFO_MAXLEN = 20;//用户信息最大长度
	public static final int TV_TITLE_MAX_LEN = 30;//直播标题最大长度
	public static final int NICKNAME_MAX_LEN = 20;//昵称最大长度

	//直播类型
	public static final int RECORD_TYPE_CAMERA = 991;//摄像头直播
	public static final int RECORD_TYPE_SCREEN = 992;//录屏直播

	//封面图片类型
	public static final int PICK_IMAGE_CAMERA = 100;//相机
	public static final int PICK_IMAGE_LOCAL = 200;//本地相册
	public static final int CROP_CHOOSE = 10;//已裁剪图片进行上传

	//码率
	public static final int BITRATE_SLOW = 900;//流畅
	public static final int BITRATE_NORMAL = 1200;//高清
	public static final int BITRATE_FAST = 1600;//超清

	//直播端右下角listview显示type
	public static final int AVIMCMD_TEXT_TYPE = 0;
	public static final int AVIMCMD_EnterLive = 1;          // 用户加入直播, Group消息  1
	public static final int AVIMCMD_ExitLive = 2;         // 用户退出直播, Group消息  2
	public static final int AVIMCMD_Praise = 3;           // 点赞消息, Demo中使用Group消息  3
	public static final int AVIMCMD_Host_Leave = 4;         // 主播离开, Group消息  4
	public static final int AVIMCMD_Host_Back = 5;         // 主播回来, Demo中使用Group消息  5
	public static final int AVIMCMD_SET_SILENCE = 7;  // 禁言消息、设置场控消息  7 // userId，userImage,nickName,type //1、禁言，2、场控 3、取消场控
	public static final int AVIMCMD_FOLLOW = 8;           // 关注    8
	public static final int AVIMCMD_Praise_first = 9;         // 观众第一次点心时发送该消息  9
	public static final int AVIMCMD_SYSTEM_NOTIFY = 10;         // 官方提示消息   10
	public static final int AVIMCMD_GIFT = 12;         // 礼物消息   12
	public static final int AVIMCMD_SHOW_INFO = 17;       // 显示消息  message ,color ,type （1 评论列中显示， 2 评论之上显示）
	public static final int AVIMCMD_DANMU = 19;       // 直播回调状态消息。
	public static final int MSG_SHOW_ADMIN = 71;       // 场控相关评论样式

	//权限
	public static final int LOCATION_PERMISSION_REQ_CODE = 1;//定位权限
	public static final int WRITE_PERMISSION_REQ_CODE = 2;//写入外部存储权限

	public static final String PUBLISH_URL = "publish_url";
	public static final String ROOM_ID = "room_id";
	public static final String ROOM_TITLE = "room_title";
	public static final String COVER_PIC = "cover_pic";
	public static final String IS_RECORD = "is_record";
	public static final String BITRATE = "bitrate";
	public static final String GROUP_ID = "group_id";
	public static final String PLAY_URL = "play_url";
	public static final String PLAY_TYPE = "play_type";
	public static final String PUSHER_AVATAR = "pusher_avatar";
	public static final String PUSHER_ID = "pusher_id";
	public static final String PUSHER_NAME = "pusher_name";
	public static final String MEMBER_COUNT = "member_count";
	public static final String HEART_COUNT = "heart_count";
	public static final String FILE_ID = "file_id";
	public static final String ACTIVITY_RESULT = "activity_result";
	public static final String LIVEID = "live_id";
	public static final String LIVE_INFO = "live_info";

	public static final String CMD_KEY = "userAction";
	public static final String DANMU_TEXT = "actionParam";

	public static final String NOTIFY_QUERY_USERINFO_RESULT = "notify_query_userinfo_result";


	//ERROR CODE TYPE
	public static final int ERROR_GROUP_NOT_EXIT = 10010;
	public static final int ERROR_QALSDK_NOT_INIT = 6013;
	public static final int ERROR_JOIN_GROUP_ERROR = 10015;
	public static final int SERVER_NOT_RESPONSE_CREATE_ROOM = 1002;
	public static final int NO_LOGIN_CACHE = 1265;



	//直播端错误信息
//	public static final String ERROR_MSG_CREATE_GROUP_FAILED =  LiveApp.getApplication().getString(R.string.create_group_error);
//	public static final String ERROR_MSG_GET_PUSH_URL_FAILED =  LiveApp.getApplication().getString(R.string.push_url_error);
//	public static final String ERROR_MSG_RECORD_PERMISSION_FAIL =  LiveApp.getApplication().getString(R.string.recorde_permission_error);
//	public static final String ERROR_MSG_NO_LOGIN_CACHE =  LiveApp.getApplication().getString(R.string.no_login_error);
//
//	//播放端错误信息
//	public static final String ERROR_MSG_GROUP_NOT_EXIT =  LiveApp.getApplication().getString(R.string.group_not_exit_error);
//	public static final String ERROR_MSG_JOIN_GROUP_FAILED =  LiveApp.getApplication().getString(R.string.join_group_error);
//	public static final String ERROR_MSG_LIVE_STOPPED =  LiveApp.getApplication().getString(R.string.live_stop_error);
//	public static final String ERROR_MSG_NOT_QCLOUD_LINK =  LiveApp.getApplication().getString(R.string.not_qcloud_link);
//	public static final String ERROR_RTMP_PLAY_FAILED = LiveApp.getApplication().getString(R.string.rtmp_play_error);
//
//	public static final String TIPS_MSG_STOP_PUSH = LiveApp.getApplication().getString(R.string.msg_stop_push_error);

	//网络类型
	public static final int NETTYPE_WIFI = 0;//wifi
	public static final int NETTYPE_NONE = 1;//未知
	public static final int NETTYPE_2G = 2;//2g
	public static final int NETTYPE_3G = 3;//3g
	public static final int NETTYPE_4G = 4;//4g
}
