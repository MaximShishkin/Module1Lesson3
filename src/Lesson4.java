import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lesson4 {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i=i+1) // (�������� �� 3 �������)
		{
			// �������� � 15:00!
			// ���� ������, ���� ������ ������ ����� +
			JFrame frame = new JFrame("�� ���� � "+i);
			JPanel panel = new JPanel(); // �������� �� 3 �������
			panel.setBackground(rndColor()); 
			Random rnd = new Random(); // �������� �� 3 �������
			// frame.setBounds(x,y,x ������ ���� �� ������,�� ������)(�������� �� 3 �������)
			frame.setBounds(rnd.nextInt(700),rnd.nextInt(200),300+rnd.nextInt(100),300+rnd.nextInt(100));
			frame.setResizable(false); // ������ �� ��������� ������� ���� (�������� �� 3 �������)
			frame.setUndecorated(true); // ������ ���������� ���� (�������� �� 3 �������)
			frame.add(panel); // �������� �� 3 �������
			frame.setVisible(true);
		}		
	}

	// �������� �� 3 �������
	static Color rndColor()
	{
		Random rcolor = new Random();
		int r = rcolor.nextInt(255);
		int g = rcolor.nextInt(255);
		int b = rcolor.nextInt(255);
		return new Color(r,g,b);
	}
}
