package org.crazyit.foxmail.exception;

/**
 * 邮箱连接异常
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class MailConnectionException extends RuntimeException {

	public MailConnectionException(String s) {
		super(s);
	}
}
