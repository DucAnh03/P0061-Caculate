package controller;

import common.Algorithm;
import view.Menu;

public class Management{

    private final String[] MAIN_MENU_ITEMS = {
        " Rectangle",
        " Circle",
        " Triangle",
        " Exit",};

    Algorithm algorithm = new Algorithm();

    Menu mainMenu = new Menu("=====Calculator Shape Program=====", MAIN_MENU_ITEMS) {
        @Override
        public void execute(int choice) {
            switch (choice) {
                case 1:
                    algorithm.displayRectangle();
                    break;
                case 2:
                    algorithm.displayCircle();
                    break;
                case 3:
                    algorithm.displayTriangle();
                    break;
                case 4:
                    System.exit(0);
                    break;

            }
        }
    };

    public void run() {
        mainMenu.run();
    }
}
