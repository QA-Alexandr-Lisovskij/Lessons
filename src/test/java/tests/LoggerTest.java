package tests;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LoggerTest {
    private static final Logger logger = LogManager.getLogger(LoggerTest.class);

    @Test
    public void logTest(){
        logger.trace("Trace massage: test start..");
        logger.debug("Trace massage: test start..");
        logger.info("Trace massage: test start..");
        logger.error("Trace massage: test start..");
        logger.fatal("Trace massage: test start..");
    }

    @Test
    public void loginTest(){
        logger.trace("login test is started... ");
        logger.trace("initialization start variables...");

    }
}
