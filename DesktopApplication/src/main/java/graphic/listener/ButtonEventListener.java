package graphic.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see ActionListener
 */

public record ButtonEventListener(JRadioButton radioButton,
                                  JRadioButton radioButton1,
                                  ResourceBundle bundleRU,
                                  ResourceBundle bundleEN) implements ActionListener {

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        String message = "";

        if (radioButton.isSelected()) {
            message = bundleRU.getString("message");
        } else if (radioButton1.isSelected()) {
            message = bundleEN.getString("message");
        }

        JOptionPane
                .showMessageDialog(
                        null,
                        message,
                        "MESSAGE",
                        JOptionPane.PLAIN_MESSAGE);
    }
}
