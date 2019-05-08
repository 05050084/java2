import java.awt.*;
import java.awt.event.*;

public class hw8_2 extends java.awt.Frame {  

  java.awt.TextField textfield;

  public static void main(String args[]){
    new hw8_2();
  }
  
  // �غc�禡
  public hw8_2() {
    super("hw8_2 TextField Event Demo");

    // �w�q Layout Manager �� FlowLayout
    setLayout(new FlowLayout());

    // �غc�禡 1
    textfield = new TextField();
    // �]�w��r��쪺��ܤ�r
    textfield.setText("TextField 1");
    // �]�w��r��쪺��ܤ�r�r��
    textfield.setColumns(10);
    // �]�w�I���C��
    textfield.setBackground(Color.PINK);
    // �]�w�e���C��
    textfield.setForeground(Color.CYAN);
    // ����Ҧ�����r���e
    textfield.selectAll();
    
    // �HInner Class���覡�ϥ�TextListener����
    textfield.addTextListener(new TextListener() {
      public void textValueChanged(TextEvent e) {
        if (e.getID() == TextEvent.TEXT_VALUE_CHANGED)
          System.out.println("��r��줺�e����");
      }
    });
	
	textfield.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource().equals(textfield))
				System.out.println("���r���W���UEnter��");
		}
	});
	
	textfield.addKeyListener(new KeyListener(){
		public void keyPressed(KeyEvent e){
			int i=e.getKeyCode();
			
			System.out.println("Key Pressed: "+i);
		}
		public void keyReleased(KeyEvent e){
			System.out.println("Char: "+e.getKeyChar());
		}
		public void keyTyped(KeyEvent e){}
	});
	
	textfield.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent e){
		  System.out.println("���U������ƹ�����" + e.getX() + ", y: " + e.getY());
	  }
	  public void mouseEntered(MouseEvent e){
		  System.out.println("�ƹ����ܪ���W��"+ e.getX() + ", y: " + e.getY());
	  }
	  public void mouseExited(MouseEvent e){
		  System.out.println("�ƹ����}����"+ e.getX() + ", y: " + e.getY());
	  }
	  public void mousePressed(MouseEvent e){
		  System.out.println("���U�ƹ�����"+ e.getX() + ", y: " + e.getY());

	  }
	  public void mouseReleased(MouseEvent e){
		  System.out.println("����ƹ�����"+ e.getX() + ", y: " + e.getY());
	  }
	});
	
	textfield.addMouseMotionListener(new MouseMotionListener(){
			public void mouseDragged(MouseEvent e){
		  System.out.println("���U�ƹ�����é즲�ƹ� "+"x: " + e.getX() + ", y: " + e.getY());
	  }
	  public void mouseMoved(MouseEvent e){
		  System.out.println("�b����W�貾�ʷƹ� "+"x: " + e.getX() + ", y: " + e.getY());
	  }
	});
    add(textfield);

    // �]�w�������j�p
    this.setSize(200, 100);

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