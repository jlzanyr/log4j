package log4j.admin;

import log4j.report.SampleReport;
import org.apache.log4j.Logger;

/**
 * @author sprudnikov
 * @version 1.0
 */
public class SampleAdmin {
    static final Logger logger = Logger.getLogger(SampleAdmin.class);

    public SampleAdmin() {
        logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
    }

    public void generateReport(){
        new SampleReport().getReport();
    }
}
