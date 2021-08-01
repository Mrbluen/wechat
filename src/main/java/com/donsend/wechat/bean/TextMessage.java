package com.donsend.wechat.bean;

import lombok.Data;

/**
 * @author ch
 * @version 1.0
 * @date 2021/7/31 13:42
 */
@Data
public class TextMessage {

    /**
     * 开发者微信号
     */
    private String ToUserName;

    /**
     * 发送方帐号（一个OpenID）
     */
    private String FromUserName;

    /**
     * 消息创建时间 （整型）
     */
    private long CreateTime;

    /**
     * text
     */
    private String MsgType;

    /**
     * 文本消息内容
     */
    private String Content;

    /**
     * 消息id，64位整型
     */
    private String MsgId;
}
