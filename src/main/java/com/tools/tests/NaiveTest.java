package com.tools.tests;


import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.*;
import org.junit.*;


public class NaiveTest {
  private Naive naive;

  @BeforeMethod 
  public void setUp() {
    naive = new Naive();
    naive.setVisible(true);
  }

  @Test public void shouldChangeTextInTextFieldWhenClickingButton() throws AWTException {
    JButton button = naive.getButton();
    click(button);
    JTextField textField = naive.getTextField();
    assertEquals(textField.getText(), "Bye!");
  }

  private void click(JButton button) throws AWTException {
    Point point = button.getLocationOnScreen();
    Robot robot = new Robot();
    robot.setAutoWaitForIdle(true);
    robot.mouseMove(point.x + 10, point.y + 10);
    robot.mousePress(MouseEvent.BUTTON1_MASK);
    robot.mouseRelease(MouseEvent.BUTTON1_MASK);
  }
}