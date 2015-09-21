package cn.codehero.ioc.factory;

import junit.framework.TestCase;

import cn.codehero.ioc.beans.factory.XmlBeanFactory;
import cn.codehero.ioc.context.ApplicationContext;

public class XmlBeanFactoryTest extends TestCase {

	ApplicationContext ctx;
	
	protected void setUp() throws Exception {
		ctx = new XmlBeanFactory(new String[]{"/resources/factory/XmlBeanFactory.xml"});
	}

	protected void tearDown() throws Exception {
		ctx = null;
	}
	
	/**
	 * 测试bean是否在容器创建的时候被初始化
	 */
	public void testGetBean() {
		//test1没有被请求, 所以容器创建的时候没有被创建
		Object obj = ctx.getBeanIgnoreCreate("test1");
		assertNull(obj);
		obj = ctx.getBean("test1");
		assertNotNull(obj);
	}

}
