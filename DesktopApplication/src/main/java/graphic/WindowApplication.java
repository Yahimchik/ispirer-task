package graphic;

import graphic.listener.ButtonEventListener;
import graphic.listener.RadioButtonListener;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Creates window application
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see JFrame
 */

public class WindowApplication extends JFrame {

    ResourceBundle bundleRU = ResourceBundle
            .getBundle("language", new Locale("ru", "RU"));
    ResourceBundle bundleEN = ResourceBundle
            .getBundle("language", new Locale("en", "EN"));

    /**
     * Creates window
     */

    public WindowApplication() {
        super("Window Application");
        this.setBounds(100, 100, 200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        ButtonGroup group = new ButtonGroup();

        JRadioButton radioButton = new JRadioButton("RU");
        JRadioButton radioButton1 = new JRadioButton("EN");

        JButton button = new JButton("Ввод");
        JLabel label = new JLabel("Выберите язык");

        container.setLayout(new GridLayout(4, 0));
        container.add(label);

        container.add(radioButton);
        container.add(radioButton1);

        group.add(radioButton);
        group.add(radioButton1);

        radioButton.setSelected(true);
        container.add(button);

        radioButton.addActionListener(
                new RadioButtonListener(
                        label,
                        radioButton,
                        radioButton1,
                        button,
                        bundleRU,
                        bundleEN)
        );

        radioButton1.addActionListener(
                new RadioButtonListener(
                        label,
                        radioButton,
                        radioButton1,
                        button,
                        bundleRU,
                        bundleEN)
        );

        button.addActionListener(
                new ButtonEventListener(
                        radioButton,
                        radioButton1,
                        bundleRU,
                        bundleEN)
        );
    }
}


