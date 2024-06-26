package com.sparta.lm;

import java.util.logging.*;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new CustomLogFormatter());
        logger.addHandler(consoleHandler);

//        logger.log(Level.INFO, "this is an info message");
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);
        logger.info("This is an info message");
        logger.warning("This is a WARNING message!");
        logger.fine("This is a fine message");


    }
}
