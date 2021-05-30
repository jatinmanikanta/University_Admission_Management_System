package admission.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdminView extends JFrame implements ActionListener{
    AdminView(){
        super("UNIVERSITY ADMISSION MANAGEMENT SYSTEM");
        
        setSize(1920,1030);
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("admission/management/system/icons/Srmm.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1300,720,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        
        add(l1);
        //Student Details
        
        JMenuBar mb  = new JMenuBar();
        JMenu report = new JMenu("Details");
        JMenuItem r1 = new JMenuItem("Student Details");
        JMenuItem r2 = new JMenuItem("Update students");
        report.setForeground(Color.BLACK);
        
        r1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("admission/management/system/icons/icon5.png"));
        Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setBackground(Color.WHITE);
        
        r1.addActionListener(this);
        
        r2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon iconn = new ImageIcon(ClassLoader.getSystemResource("admission/management/system/icons/icon6.png"));
        Image imagee = iconn.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r2.setIcon(new ImageIcon(imagee));
        r2.setBackground(Color.WHITE);
        
        r2.addActionListener(this);
        
        
        
        
        
    //part2  Fee Details
        JMenu fees = new JMenu("Fees");
        JMenuItem w1 = new JMenuItem("Fee Details");
        fees.setForeground(Color.BLACK);
        
        w1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("admission/management/system/icons/icon3.png"));
        Image image5 = icon5.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        w1.setIcon(new ImageIcon(image5));
        w1.setBackground(Color.WHITE);
        
    
        w1.addActionListener(this);
     
       
   //part3 Merit list
             
        JMenu list = new JMenu("Merit List");
        
        JMenuItem s2 = new JMenuItem("Final List");
        list.setForeground(Color.BLACK);
        
        
        s2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon16 = new ImageIcon(ClassLoader.getSystemResource("admission/management/system/icons/icon8.png"));
        Image image17 = icon16.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        s2.setIcon(new ImageIcon(image17));
        s2.setBackground(Color.WHITE);
        
        s2.addActionListener(this);
        
   
        //part4 About us
      
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

        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.BLACK);
        

        ex.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("admission/management/system/icons/icon12.png"));
        Image image11 = icon11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setBackground(Color.WHITE);
        
        ex.addActionListener(this);
        
        report.add(r1);
        report.add(r2);
        
        fees.add(w1);
        

       
        list.add(s2);


        exit.add(ex);
        
        mb.add(report);
        mb.add(fees);
        mb.add(list);
        mb.add(about);
        mb.add(exit);
        
        setJMenuBar(mb);    
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("Student Details")){
            new StudentDetails().setVisible(true);
            
        } else if(msg.equals("Update students")){
            new UpdateStudent().f.setVisible(true);
           
        }else if(msg.equals("Student Details")){
            new StudentDetails().setVisible(true);
            
        }

        else if(msg.equals("Fee Details")){
            new Fee().setVisible(true);
           
        }
       
        else if(msg.equals("Final List")){
          new FinalList().setVisible(true);
        }
       
            
        else if(msg.equals("Exit")){
            System.exit(0);
        }else if(msg.equals("About Us")){
            new AboutUs().setVisible(true);
        }
        
        
    }
    
    
    public static void main(String[] args){
        new AdminView().setVisible(true);
    }
    
}

        
