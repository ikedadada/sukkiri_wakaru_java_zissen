package p5.p5_4_2_use_logback_to_logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Logback Required
// logback-classic-1.5.3.jar
// logback-core-1.5.3.jar
// slf4j-api-2.0.12.jar

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        if (args.length != 2) {
            logger.error("起動引数の数が異常:{}", args.length);
        }
    }
}
