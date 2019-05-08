import java.awt.*;
import java.awt.event.*;

public class TextAreaEventDemo extends java.awt.Frame {

  java.awt.TextArea textarea;

  public static void main(String args[]){
    new TextAreaEventDemo();
  }
  
  // �غc�禡
  public TextAreaEventDemo() {
    super("TextArea Event Demo");

    textarea = new TextArea();
    // �]�w��ܤ�r
    textarea.setText("TextArea Event Demo");
    // �]�wTextArea����ܦC��
    textarea.setRows(10);
    // �]�wTextArea����ܦ��
    textarea.setColumns(30);

    // �HInner Class���覡�ϥ�TextListener����
    textarea.addTextListener(new TextListener() {
      public void textValueChanged(TextEvent e) {
        if (e.getID() == TextEvent.TEXT_VALUE_CHANGED)
          System.out.println("��r�ϰ줺�e����");
      }
    });

	
	textarea.addKeyListener(new KeyListener(){
		public void keyPressed(KeyEvent e){
			int i=e.getKeyCode();
			
			System.out.println("Key Pressed: "+i);
		}
		public void keyReleased(KeyEvent e){
			System.out.println("Char: "+e.getKeyChar());
		}
		public void keyTyped(KeyEvent e){}
	});
	
	textarea.addMouseListener(new  MouseListener(){ 
	public void mouseEntered( MouseEvent e)
	{
		System.out.println("�i�J��r��X=" + e.getX() + "\tY=" + e.getY()); 
	}
	public void mouseExited( MouseEvent e)
	{
		System.out.println("���}��r��X=" + e.getX() + "\tY=" + e.getY()); 
	}
	public void mousePressed(MouseEvent e){
		  System.out.println("���U�ƹ�����"+ e.getX() + ", y: " + e.getY());

	  }
	public void mouseReleased(MouseEvent e){
		  System.out.println("����ƹ�����"+ e.getX() + ", y: " + e.getY());
	  }
	public void mouseClicked(MouseEvent e){
		  System.out.println("���U������ƹ�����" + e.getX() + ", y: " + e.getY());
	  }
	
	});
	
	textarea.addMouseMotionListener(new MouseMotionListener(){ 
	public void mouseMoved( MouseEvent e)
	{
	System.out.println("����W�貾��X=" + e.getX() + "\tY=" + e.getY()); 
	}
	public void mouseDragged( MouseEvent e)
	{
	System.out.println("���U�ƹ�����W�貾��X=" + e.getX() + "\tY=" + e.getY()); 
	}
	});



    java.awt.Panel panel1 = new Panel();
    panel1.add(textarea);
    add(panel1);

    // �]�w�������j�p
    this.setSize(250, 220);

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