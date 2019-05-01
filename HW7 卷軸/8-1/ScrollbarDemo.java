import java.awt.*;
import java.awt.event.*;

public class ScrollbarDemo extends java.awt.Frame {
	
	Scrollbar scrollbar;
	Label label = new Label();
	int red = 0;
  public static void main(String args[]){
    new ScrollbarDemo();
  }
  
  // �غc�禡
  public ScrollbarDemo() {
    super("Scrollbar Demo");

    // �w�q Layout Manager �� BorderLayout
    setLayout(new BorderLayout());

    java.awt.Scrollbar scrollbar;

    // �غc�禡 1
    scrollbar = new Scrollbar();
    // �]�w���b�̤j��
    scrollbar.setMaximum(500);
    // �]�w���b�̤p��
    scrollbar.setMinimum(0);
    // �]�w���b���t�m��V���������b
    scrollbar.setOrientation(Scrollbar.VERTICAL);
    // �]�w���b������j�p��
    scrollbar.setVisibleAmount(10);
    // �]�w���b���ثe��
    scrollbar.setValue(300);
	//�]�wBlock���W�λ���ƥج�15
	scrollbar.setBlockIncrement(15);
	//�]�wUnit���W�λ���ƥج�3
	scrollbar.setUnitIncrement(3);
	
    add(scrollbar, BorderLayout.EAST);
	
    // �غc�禡 3
    // �]�w�t�m��V���������b
    //     �ثe�Ȭ�100
    //     ���b����j�p�Ȭ�60
    //     �̤p�Ȭ�0
    //     �̤j�Ȭ�300
  /*  scrollbar = new Scrollbar(Scrollbar.VERTICAL, 100, 60, 0, 300);
    add(scrollbar, BorderLayout.EAST);*/

    // �]�w�������j�p
    this.setSize(200, 200);

    // Center the frame
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();

    if (frameSize.height > screenSize.height)
      frameSize.height = screenSize.height;

    if (frameSize.width > screenSize.width)
      frameSize.width = screenSize.width;

    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

    // ��ܵ���
    this.setVisible(true);

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
}
