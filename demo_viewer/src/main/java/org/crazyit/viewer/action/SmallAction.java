package org.crazyit.viewer.action;

import org.crazyit.viewer.ViewerFrame;
import org.crazyit.viewer.ViewerService;

/**
 * 缩小图片的Action
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @author Kelvin Mak kelvin.mak125@gmail.com
 * @version  1.0
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class SmallAction implements Action {

	public void execute(ViewerService service, ViewerFrame frame) {
		service.zoom(frame, false);
	}

}
