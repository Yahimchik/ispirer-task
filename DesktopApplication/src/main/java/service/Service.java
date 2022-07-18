package service;

import action.ChangedAction;

/**
 * @author Egor Yahimovich
 * @version 1.0
 */

public class Service {

    /**
     * Static method, which tracks changes on list
     *
     * @param start  Start list size
     * @param end    End list size
     * @param method Method that modifies the list
     */

    public static void checkChanged(int start, int end, String method) {
        ChangedAction action = new ChangedAction();
        if (start != end) {
            action.changed(method);
        }
    }
}
