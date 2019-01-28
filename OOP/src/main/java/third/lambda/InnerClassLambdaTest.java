package third.lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * В этой программе демонстрируется применение анонимных
 * внутренних классов.
 *
 * @author Cay Horstmann
 * @version 1.11 2015-05-12
 */
public class InnerClassLambdaTest {

    public static void main(String[] args) {
        InnerClassLambdaTest innerClassLambdaTest = new InnerClassLambdaTest();
        InnerClassLambdaTest.TalkingClock clock = innerClassLambdaTest.new TalkingClock();
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
            Timer t = new Timer(interval, event -> {
                System.out.println("At the tone, the time is" + new Date());
                if (beep) {
                    Toolkit.getDefaultToolkit().beep();
                }
            });
            t.start();
        }
    }
}