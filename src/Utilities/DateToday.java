package Utilities;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;
import java.util.Date;

public class DateToday extends MIDlet implements CommandListener {
  private Display display;

  private Form form = new Form("Today's Date");

  private Date today = new Date(System.currentTimeMillis());

  private Command exit = new Command("Exit", Command.EXIT, 1);

  private DateField datefield = new DateField("", DateField.DATE_TIME);

  public DateToday() {
    display = Display.getDisplay(this);
    datefield.setDate(today);
    form.append(datefield);
    form.addCommand(exit);
    form.setCommandListener(this);
  }

  public void startApp() {
    display.setCurrent(form);
  }

  public void pauseApp() {
  }

  public void destroyApp(boolean unconditional) {
  }

  public void commandAction(Command command, Displayable displayable) {
    if (command == exit) {
      destroyApp(false);
      notifyDestroyed();
    }
  }
}

