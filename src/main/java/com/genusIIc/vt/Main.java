package com.genusIIc.vt;

import org.apache.logging.log4j.*;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws Exception {
        if ((args.length > 2) || (args.length < 2)){
            System.err.println("You didn't enter the parameters completely. Check them out.");
            logger.error("Parameters entered incorrectly");
        } else {
            ComparisonDoc cd = new ComparisonDoc();
            cd.compare(args[0], args[1]);
        }
    }
}