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

public record RadioButtonListener(JLabel label,
                                  JRadioButton radioButton,
                                  JRadioButton radioButton1,
                                  JButton button,
                                  ResourceBundle bundleRU,
                                  ResourceBundle bundleEN) implements ActionListener {

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        if (radioButton.isSelected()) {
            label.setText(bundleRU.getString("label"));
            button.setText(bundleRU.getString("button"));
        } else if (radioButton1.isSelected()) {
            label.setText(bundleEN.getString("label"));
            button.setText(bundleEN.getString("button"));
        }
    }
}