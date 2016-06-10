package aja.jp.percuma.lib;

public class PrintLib {
  public void log(Object o, String m) {
    java.util.logging.Logger.getLogger(o.getClass().getName()).info(m);
  }
}
