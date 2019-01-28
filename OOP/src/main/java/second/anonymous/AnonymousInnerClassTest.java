package second.anonymous;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * В этой программе демонстрируется применение анонимных
 * внутренних классов.
 *
 * @author Cay Horstmann
 * @version 1.11 2015-05-12
 */
public class AnonymousInnerClassTest {

    public static void main(String[] args) {
        AnonymousInnerClassTest anonymousInnerClassTest = new AnonymousInnerClassTest();
        AnonymousInnerClassTest.TalkingClock clock = anonymousInnerClassTest.new TalkingClock();
        clock.start(1000, true);

        // выполнять программу до тех пор, пока пользователь
        // не щелкнет на кнопке ОК
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

    /**
     * Часы, выводящие время через регулярные промежутки.
     */
    private class TalkingClock {
        /**
         * Запускает часы.
         *
         * @param interval Интервал между сообщениями (в миллисекундах).
         * @param beep     Истинно, если часы должны издавать звуковой сигнал.
         */
        public void start(int interval, boolean beep) {
            ActionListener listener = new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    System.out.println("At the tone, the time is" + new Date());
                    if (beep) {
                        Toolkit.getDefaultToolkit().beep();
                    }
                }
            };
            Timer t = new Timer(interval, listener);
            t.start();
        }
    }
}