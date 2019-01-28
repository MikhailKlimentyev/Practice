package first.inner;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * В этой программе демонстрируется применение внутренних классов.
 *
 * @author Cay Horstmann
 * @version 2015-05-12
 */
public class InnerClassTest {

    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        // выполнять программу до тех пор, пока пользователь
        // не щелкнет на кнопке ОК
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

/**
 * Часы, выводящие время через регулярные промежутки
 */
class TalkingClock {

    private int interval;
    private boolean beep;

    /**
     * Конструирует "говорящие часы".
     *
     * @param interval Интервал между сообщениями (вмиллисекундах)
     * @param beep     Истинно, если часы должныиздавать звуковой сигнал
     */
    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    /**
     * Запускает часы.
     */
    public void start() {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

    public class TimePrinter implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("At the tone, the time is " + new Date());
            if (beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}