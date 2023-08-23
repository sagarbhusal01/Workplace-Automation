# Workplace-Automation
Workplace-Automation is a simple Automation Bot.
It just opens the pinned application of taskbar in 3 different desktop .
It basically works by simulating the keypress.

it opens the 5th, 4th and 3rd app in 1st, 2nd and 3rd desktop

As my 5th app is vs code,4th is figma and 3rd is brave browser I  made the method name to represent my preferences

- --
- [Download Executable Workplace-Automation file](https://github.com/sagarbhusal01/Workplace-Automation/releases/download/stable/Workplace-Automation.zip)
- --
```java

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
```

As the name have already revealed it chanage the desktop to left   

```java

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
```
While this to the right 
```java
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
```

this is the packages used in this project
```java

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;
```

And 
```java 
Thread.sleep(2500);
```
is used to wait between each task.
