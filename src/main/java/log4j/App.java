package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Hello world!
 *
 */
public class App 
{
    static final Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
//        BasicConfigurator.configure();
//        PropertyConfigurator.configure("log4j.properties");
        DOMConfigurator.configure("log4j.xml");
        logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");


//        new SampleAdmin().generateReport();
    }
}
