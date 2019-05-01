import java.awt.*;
import java.awt.event.*;

public class ScrollbarDemo extends java.awt.Frame {
	
	Scrollbar scrollbar;
	Label label = new Label();
	int red = 0;
  public static void main(String args[]){
    new ScrollbarDemo();
  }
  
  // 建構函式
  public ScrollbarDemo() {
    super("Scrollbar Demo");

    // 定義 Layout Manager 為 BorderLayout
    setLayout(new BorderLayout());

    java.awt.Scrollbar scrollbar;

    // 建構函式 1
    scrollbar = new Scrollbar();
    // 設定捲軸最大值
    scrollbar.setMaximum(500);
    // 設定捲軸最小值
    scrollbar.setMinimum(0);
    // 設定捲軸的配置方向為垂直捲軸
    scrollbar.setOrientation(Scrollbar.VERTICAL);
    // 設定捲軸方塊的大小值
    scrollbar.setVisibleAmount(10);
    // 設定捲軸之目前值
    scrollbar.setValue(300);
	//設定Block遞增或遞減數目為15
	scrollbar.setBlockIncrement(15);
	//設定Unit遞增或遞減數目為3
	scrollbar.setUnitIncrement(3);
	
    add(scrollbar, BorderLayout.EAST);
	
    // 建構函式 3
    // 設定配置方向為垂直捲軸
    //     目前值為100
    //     捲軸方塊大小值為60
    //     最小值為0
    //     最大值為300
  /*  scrollbar = new Scrollbar(Scrollbar.VERTICAL, 100, 60, 0, 300);
    add(scrollbar, BorderLayout.EAST);*/

    // 設定視窗的大小
    this.setSize(200, 200);

    // Center the frame
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();

    if (frameSize.height > screenSize.height)
      frameSize.height = screenSize.height;

    if (frameSize.width > screenSize.width)
      frameSize.width = screenSize.width;

    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

    // 顯示視窗
    this.setVisible(true);

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
}
