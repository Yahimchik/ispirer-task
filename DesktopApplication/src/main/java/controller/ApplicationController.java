package controller;

import graphic.WindowApplication;

/**
 * @author Egor Yahimovich
 * @version 1.0
 */

public class ApplicationController {

    /**
     * Starts a windowed application
     */

    public static void main(String[] args) {
        new WindowApplication()
                .setVisible(true);
    }
}
