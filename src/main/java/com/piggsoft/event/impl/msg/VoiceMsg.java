package com.piggsoft.event.impl.msg;

import com.piggsoft.event.WXEvent;
import com.piggsoft.annotation.XmlMsgType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 声音消息
 * <br>Created by user on 2015/11/19.
 * @author piggsoft@163.com
 */
@XmlMsgType(msgType = "voice")
@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class VoiceMsg extends WXEvent {
}
