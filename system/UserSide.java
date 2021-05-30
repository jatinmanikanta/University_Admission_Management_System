package admission.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class UserSide extends JFrame implements ActionListener{
    UserSide(){
        super("UNIVERSITY ADMISSION MANAGEMENT SYSTEM");
        
        setSize(1920,1030);
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("admission/management/system/icons/Srmm.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1300,720,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        
        add(l1);
        //Eligibility Criteriea
        
        JMenuBar mb  = new JMenuBar();
        JMenu master = new JMenu("Admission Details");
        JMenuItem m1 = new JMenuItem("Engineering and Sciences");
        JMenuItem m2 = new JMenuItem("Liberal Arts and Management");
        master.setForeground(Color.BLACK);
        
        m1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("admission/management/system/icons/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setBackground(Color.WHITE);
        
        m2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("admission/management/system/icons/icon1.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setBackground(Color.WHITE);
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        
    //part2 online admission form
        JMenu user = new JMenu("Admission Form");
        JMenuItem u1 = new JMenuItem("New Student Admission");
        JMenuItem u2 = new JMenuItem("Instructions For Admission");
        user.setForeground(Color.BLACK);
        
        u1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("admission/management/system/icons/icon3.png"));
        Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setBackground(Color.WHITE);
        
        u2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("admission/management/system/icons/icon4.jpg"));
        Image image5 = icon5.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u2.setIcon(new ImageIcon(image5));
        u2.setBackground(Color.WHITE);
        
      
        u1.addActionListener(this);
        u2.addActionListener(this);
       
   //part3 Fee Details and Payment
             
        JMenu fee = new JMenu("Fee Details");
        JMenuItem s1 = new JMenuItem("Fee Structure");
        JMenuItem s2 = new JMenuItem("Student Fee Form");
        fee.setForeground(Color.BLACK);
        
        s1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon14 = new ImageIcon(ClassLoader.getSystemResource("admission/management/system/icons/icon7.png"));
        Image image15 = icon14.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        s1.setIcon(new ImageIcon(image15));
        s1.setBackground(Color.WHITE);
        
        s1.addActionListener(this);
        
        s2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon16 = new ImageIcon(ClassLoader.getSystemResource("admission/management/system/icons/icon8.png"));
        Image image17 = icon16.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        s2.setIcon(new ImageIcon(image17));
        s2.setBackground(Color.WHITE);
        
        s2.addActionListener(this);

        
        //About College
        JMenu about = new JMenu("About");
        JMenuItem aboutus = new JMenuItem("About Us");
        about.setForeground(Color.BLACK);
        
        aboutus.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon21 = new ImageIcon(ClassLoader.getSystemResource("admission/management/system/icons/icon13.jpg"));
        Image image22 = icon21.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        aboutus.setIcon(new ImageIcon(image22));
        aboutus.setBackground(Color.WHITE);
        about.add(aboutus);
        aboutus.addActionListener(this);

        
        //Exit
        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.BLACK);
        

        ex.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("admission/management/system/icons/icon12.png"));
        Image image11 = icon11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setBackground(Color.WHITE);
        
        ex.addActionListener(this);
        
        master.add(m1);
        master.add(m2);
        
        user.add(u1);
        user.add(u2);

        fee.add(s1);
        fee.add(s2);
        
       
        exit.add(ex);
        
        mb.add(master);
        mb.add(user);
        mb.add(fee);
        mb.add(about);
        mb.add(exit);
        
        setJMenuBar(mb);    
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
 
   public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("New Student Admission")){
            new AddStudent().f.setVisible(true);
            
        }else if(msg.equals("Engineering and Sciences")){
            new engineering().setVisible(true);
            
        }else if(msg.equals("Instructions For Admission")){
            new Instructions().setVisible(true);
           
        }
        else if(msg.equals("Liberal Arts and Management")){
            new arts().setVisible(true);
           
        }
        
        else if(msg.equals("Fee Structure")){
            new FeeStructure().setVisible(true);
           
        }
        else if(msg.equals("Student Fee Form")){
            new StudentFeeForm().setVisible(true);
           
        }
      
        else if(msg.equals("Exit")){
            System.exit(0);
        }
        else if(msg.equals("About Us")){
            new AboutUs().setVisible(true);
        }
        
    }
    
    
    public static void main(String[] args){
        new UserSide().setVisible(true);
    }
    
}

        