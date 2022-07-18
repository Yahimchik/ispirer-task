package action;

import impl.ChangedInterface;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see ChangedInterface
 */

public class ChangedAction implements ChangedInterface {

    /**
     * Shows information about changing the list
     */
    @Override
    public void changed(String s) {
        System.out.println("Resizing in: " + s);
    }
}
