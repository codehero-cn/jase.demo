package cn.codehero.ioc;

import cn.codehero.ioc.context.BeanCreatorTest;
import cn.codehero.ioc.context.PropertyHandlerTest;
import cn.codehero.ioc.context.XmlApplicationContextTest;
import cn.codehero.ioc.factory.XmlBeanFactoryTest;
import cn.codehero.ioc.xml.ElementLoaderTest;
import cn.codehero.ioc.xml.ElementReaderTest;
import cn.codehero.ioc.xml.XmlHolderTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses( { ElementReaderTest.class, ElementLoaderTest.class, 
	XmlHolderTest.class,BeanCreatorTest.class, PropertyHandlerTest.class,
	XmlApplicationContextTest.class, XmlBeanFactoryTest.class})
public class MainTest {
	
}
