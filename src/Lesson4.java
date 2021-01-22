import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lesson4 {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i=i+1) // (изменили на 3 занятии)
		{
			// НАЧИНАЕМ В 15:00!
			// ВСЕМ ПРИВЕТ, ЕСЛИ ВИДИШЬ ЭКЛИПС СТАВЬ +
			JFrame frame = new JFrame("Моё окно № "+i);
			JPanel panel = new JPanel(); // написали на 3 занятии
			panel.setBackground(rndColor()); 
			Random rnd = new Random(); // написали на 3 занятии
			// frame.setBounds(x,y,x размер окна по ширине,по высоте)(изменили на 3 занятии)
			frame.setBounds(rnd.nextInt(700),rnd.nextInt(200),300+rnd.nextInt(100),300+rnd.nextInt(100));
			frame.setResizable(false); // Запрет на изменение размера окна (написали на 3 занятии)
			frame.setUndecorated(true); // Убрать оформление окна (написали на 3 занятии)
			frame.add(panel); // написали на 3 занятии
			frame.setVisible(true);
		}		
	}

	// написали на 3 занятии
	static Color rndColor()
	{
		Random rcolor = new Random();
		int r = rcolor.nextInt(255);
		int g = rcolor.nextInt(255);
		int b = rcolor.nextInt(255);
		return new Color(r,g,b);
	}
}
