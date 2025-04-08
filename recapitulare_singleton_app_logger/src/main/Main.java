package main;

import clase.*;

public class Main implements Runnable {

    public static void main(String[] args) {
        LoggerEager loggerEager = LoggerEager.getInstance();
        loggerEager.log(LogLevel.DEBUG, "Linie executata!");

        LoggerEager loggerEager2 = LoggerEager.getInstance();
        loggerEager2.log(LogLevel.INFO, "Informatia se afla in consola!");

        System.out.println(loggerEager.getTotalLogs());
        System.out.println(loggerEager2.getTotalLogs());

        LoggerStaticBlock loggerStaticBlock = LoggerStaticBlock.getInstance();
        LoggerStaticBlock loggerStaticBlock2 = LoggerStaticBlock.getInstance();

        loggerStaticBlock.log(LogLevel.ERROR, "A critical error was logged");
        loggerStaticBlock2.log(LogLevel.ERROR, "A minor error was logged");

        System.out.println(loggerStaticBlock.getTotalLogs());
        System.out.println(loggerStaticBlock2.getTotalLogs());

        LoggerLazy loggerLazy = LoggerLazy.getInstance();
        LoggerLazy loggerLazy2 = LoggerLazy.getInstance();

        loggerLazy.log(LogLevel.WARNING, "This is deprecated and will be removed!");
        loggerLazy2.log(LogLevel.ERROR, "Something went wrong!");

        System.out.println(loggerLazy.getTotalLogs());
        System.out.println(loggerLazy2.getTotalLogs());


        new Main().run();
        new Main().run();
    }

    @Override
    public void run() {
        LoggerThreadSafe loggerThreadSafe = LoggerThreadSafe.getInstance();
        loggerThreadSafe.log(LogLevel.DEBUG, "Din thread");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(loggerThreadSafe.getTotalLogs());
    }
}
