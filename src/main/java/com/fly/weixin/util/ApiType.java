package com.fly.weixin.util;

/**
 * Created by think on 15-7-11.
 */
public enum ApiType {
    Get_Access_Token("获取access_token",2000),
    Menu_Create("自定义菜单创建",1000),
    Menu_Query("自定义菜单查询",10000),
    Menu_Delete("自定义菜单删除",1000),
    Group_Create("创建分组",1000),
    Group_Get("获取分组",1000),
    Group_ModifyName("修改分组名",1000),
    Group_MoveUser("移动用户分组",100000),
    MediaFile_Upload("上传多媒体文件",5000),
    MediaFile_Download("下载多媒体文件",10000),
    CallCenterMessage_("发送客服消息",500000),
    Bulk_Message("高级群发接口",1000),
    TextMessage_Upload("上传图文消息接口",10),
    TextMessage_Delete("删除图文消息接口",10),
    BarCode_Get("获取带参数的二维码",100000),
    User_Get("获取关注者列表",2000),
    User_GetInfo("获取用户基本信息",5000000),
    Access_Token_Get("获取网页授权access_token",-1),
    Access_Token_Refresh("刷新网页授权access_token",-1),
    Access_Token_GetUserInfo("网页授权获取用户信息",-1),
    User_GetMemoName("设置用户备注名",10000);

    private String apiTypeDesc;
    private Integer limitTimes;

    private  ApiType(String apiTypeDesc, Integer limitTimes){
        this.apiTypeDesc=apiTypeDesc;
        this.limitTimes=limitTimes;
    }
}
