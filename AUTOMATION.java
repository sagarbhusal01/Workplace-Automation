import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;

class Automate {
        void ChangeDesktopToRight() {
                try {

                        Robot robot = new Robot();
                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.keyPress(KeyEvent.VK_WINDOWS);
                        robot.keyPress(KeyEvent.VK_RIGHT);
                        // release key
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.keyRelease(KeyEvent.VK_WINDOWS);
                        robot.keyRelease(KeyEvent.VK_RIGHT);

                } catch (AWTException e) {
                        e.printStackTrace();
                }
        }

        void ChangeDesktopToLeft() {
                try {

                        Robot robot = new Robot();
                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.keyPress(KeyEvent.VK_WINDOWS);
                        robot.keyPress(KeyEvent.VK_LEFT);
                        // release key
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.keyRelease(KeyEvent.VK_WINDOWS);
                        robot.keyRelease(KeyEvent.VK_LEFT);

                } catch (AWTException e) {
                        e.printStackTrace();
                }
        }

        void OpenBrowser() {
                try {

                        Robot robot = new Robot();

                        // opening brave
                        robot.keyPress(KeyEvent.VK_WINDOWS);
                        robot.keyPress(KeyEvent.VK_3);
                        robot.keyRelease(KeyEvent.VK_WINDOWS);
                        robot.keyRelease(KeyEvent.VK_3);

                } catch (AWTException e) {
                        e.printStackTrace();
                }
        }

        void OpenFigma() {
                try {

                        Robot robot = new Robot();
                        robot.keyPress(KeyEvent.VK_WINDOWS);
                        robot.keyPress(KeyEvent.VK_4);
                        // release key

                        robot.keyRelease(KeyEvent.VK_WINDOWS);
                        robot.keyRelease(KeyEvent.VK_4);

                } catch (AWTException e) {
                        e.printStackTrace();
                }
        }

        void OpenCode() {
                try {

                        Robot robot = new Robot();
                        robot.keyPress(KeyEvent.VK_WINDOWS);
                        robot.keyPress(KeyEvent.VK_5);
                        // release key

                        robot.keyRelease(KeyEvent.VK_WINDOWS);
                        robot.keyRelease(KeyEvent.VK_5);

                } catch (AWTException e) {
                        e.printStackTrace();
                }
        }

}

public class AUTOMATION {
        public static void main(String[] args) throws IOException,
                        AWTException, InterruptedException {
                Automate a = new Automate();
                // first its goes to first desktop to start with
                a.ChangeDesktopToLeft();
                Thread.sleep(100);
                a.ChangeDesktopToLeft();
                Thread.sleep(100);
                a.ChangeDesktopToLeft();
                Thread.sleep(100);
                a.ChangeDesktopToLeft();
                Thread.sleep(100);
                //
                // Open Application
                Thread.sleep(500);
                a.OpenCode();
                Thread.sleep(2500);
                a.ChangeDesktopToRight();
                a.OpenFigma();
                Thread.sleep(2500);
                a.ChangeDesktopToRight();
                a.OpenBrowser();
                Thread.sleep(2500);
                //
                // return to the first desktop
                a.ChangeDesktopToLeft();
                Thread.sleep(150);
                a.ChangeDesktopToLeft();
                Thread.sleep(150);
                a.ChangeDesktopToLeft();
                Thread.sleep(150);
                a.ChangeDesktopToLeft();
                Thread.sleep(150);

        }
}