package admission.management.system;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
          super("About Us - SRM University");
            setBackground(new Color(173, 216, 230));
            setBounds(50, 50, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("admission/management/system/icons/ss.jpg"));
            
            l1 = new JLabel(i1);
            l1.setBounds(720, 200, 550, 400);
            contentPane.add(l1);



            JLabel l3 = new JLabel("SRM");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(210, 5, 150, 150);
            contentPane.add(l3);

            JLabel l4 = new JLabel("University");
            l4.setForeground(new Color(127, 120, 120));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(180, 35, 170, 170);
            contentPane.add(l4);

            JLabel l5 = new JLabel("Andhra Pradesh");
            l5.setForeground(new Color(30, 144, 150));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(165, 55, 190, 190);
            contentPane.add(l5);


            JLabel l6 = new JLabel("<html>SRM University, Andhra Pradesh is a multi-stream research university with focus on diverse fields.<br> From engineering to medicine and from liberal arts to management, SRM’s vision is to emerge as a world-class university that is globally connected, nationally relevant, and regionally transformative.</br> It has the ambitious plan to be in the top world class universities in ten years with 20000 + students and 1500 faculty members.</html>");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(100, 100, 600, 600);
            contentPane.add(l6);

           

         


            JLabel l10 = new JLabel("Phone +91-866-2429299 / 1800-599-2233");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(100, 570, 400, 200);
            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.WHITE);
	}
        

}


