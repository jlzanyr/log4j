package log4j.report;

import org.apache.log4j.Logger;

/**
 * @author sprudnikov
 * @version 1.0
 */
public class SampleReport {
    static final Logger logger = Logger.getLogger(SampleReport.class);

    public void getReport() {
        logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
    }
}
