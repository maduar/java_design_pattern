package factoryMethod;

import factoryMethod.FileLoggerFactory;
import factoryMethod.Logger;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
public class XMLUtil {
  //该方法用于从XML配置文件中提取图表类型，并返回类型名
  public static Object getBean() throws Exception, NoClassDefFoundError {
    SAXReader reader = new SAXReader();
    String path = XMLUtil.class.getClassLoader().
        getResource("config.xml").getPath();
    System.out.println("path： " + path);
    Document document = reader.read(new File(path));
    Element root = document.getRootElement();

    // iterate through child elements of root
    for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
      Element element = it.next();
      // do something
    }
    String cName = document.selectSingleNode("/config/className").getText();
    //通过类名生成实例对象并将其返回
    Class<?> c = Class.forName(cName);
    Object obj = c.newInstance();
    return obj;
  }

  public static void main(String[] args) throws Exception{
    FileLoggerFactory fileLoggerFactory = (FileLoggerFactory)XMLUtil.getBean();
    Logger logger = fileLoggerFactory.createLogger();
    logger.writeLog();
  }
}