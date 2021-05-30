package admission.management.system;

import javax.swing.*;
import java.awt.*;

public class FeeStructure extends JFrame{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    JLabel i1;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10,bb11,bb12,bb13,bb14,bb15,bb16,bb17,bb18;
    JLabel m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
    
    public FeeStructure(){
        
        setSize(1700,800);
        setLocation(100,100);
        setLayout(null);
        
        i1 = new JLabel("Fee Structure");
        i1.setFont(new Font("serif",Font.ITALIC,56));
        i1.setBounds(600,10,400,70);
        add(i1);
        
        l1 = new JLabel("Course");
        l1.setBounds(80,100,100,40);
        l1.setFont(new Font("serif",Font.BOLD,26));
        add(l1);
        
        l2 = new JLabel("BTech");
        l2.setBounds(280,100,100,40);
        l2.setFont(new Font("serif",Font.BOLD,26));
        add(l2);
        
        l3 = new JLabel("BBA");
        l3.setBounds(480,100,100,40);
        l3.setFont(new Font("serif",Font.BOLD,26));
        add(l3);
        
        l4 = new JLabel("BSC");
        l4.setBounds(680,100,100,40);
        l4.setFont(new Font("serif",Font.BOLD,26));
        add(l4);
        
        bb5 = new JLabel("Rs 25000");
        bb5.setBounds(680,170,150,40);
        bb5.setFont(new Font("serif",Font.PLAIN,26));
        add(bb5);
        
        bb6 = new JLabel("Rs 25000");
        bb6.setBounds(680,240,150,40);
        bb6.setFont(new Font("serif",Font.PLAIN,26));
        add(bb6);
        
        bb7 = new JLabel("Rs 25000");
        bb7.setBounds(680,310,150,40);
        bb7.setFont(new Font("serif",Font.PLAIN,26));
        add(bb7);
        
        bb8 = new JLabel("Rs 25000");
        bb8.setBounds(680,380,150,40);
        bb8.setFont(new Font("serif",Font.PLAIN,26));
        add(bb8);
        
        bb13 = new JLabel("Rs 25000");
        bb13.setBounds(680,450,150,40);
        bb13.setFont(new Font("serif",Font.PLAIN,26));
        add(bb13);
        
        bb14 = new JLabel("Rs 25000");
        bb14.setBounds(680,520,150,40);
        bb14.setFont(new Font("serif",Font.PLAIN,26));
        add(bb14);
        
        
        
        l10 = new JLabel("Semester 1");
        l10.setBounds(80,170,150,40);
        l10.setFont(new Font("serif",Font.BOLD,26));
        add(l10);
        
        l11 = new JLabel("Semester 2");
        l11.setBounds(80,240,150,40);
        l11.setFont(new Font("serif",Font.BOLD,26));
        add(l11);
        
        l12 = new JLabel("Semester 3");
        l12.setBounds(80,310,150,40);
        l12.setFont(new Font("serif",Font.BOLD,26));
        add(l12);
        
        l13 = new JLabel("Semester 4");
        l13.setBounds(80,380,150,40);
        l13.setFont(new Font("serif",Font.BOLD,26));
        add(l13);
        
        l14 = new JLabel("Semester 5");
        l14.setBounds(80,450,150,40);
        l14.setFont(new Font("serif",Font.BOLD,26));
        add(l14);
        
        l15 = new JLabel("Semester 6");
        l15.setBounds(80,520,150,40);
        l15.setFont(new Font("serif",Font.BOLD,26));
        add(l15);
        
        l16 = new JLabel("Semester 7");
        l16.setBounds(80,590,150,40);
        l16.setFont(new Font("serif",Font.BOLD,26));
        add(l16);
        
        l17 = new JLabel("Semester 8");
        l17.setBounds(80,660,150,40);
        l17.setFont(new Font("serif",Font.BOLD,26));
        add(l17);
        
        
        b1 = new JLabel("Rs 60000");
        b1.setBounds(280,170,100,40);
        b1.setFont(new Font("serif",Font.PLAIN,26));
        add(b1);
        
        b2 = new JLabel("Rs 60000");
        b2.setBounds(280,240,100,40);
        b2.setFont(new Font("serif",Font.PLAIN,26));
        add(b2);
        
        b3 = new JLabel("Rs 60000");
        b3.setBounds(280,310,100,40);
        b3.setFont(new Font("serif",Font.PLAIN,26));
        add(b3);
        
        b4 = new JLabel("Rs 60000");
        b4.setBounds(280,380,100,40);
        b4.setFont(new Font("serif",Font.PLAIN,26));
        add(b4);
        
        b5 = new JLabel("Rs 60000");
        b5.setBounds(280,450,100,40);
        b5.setFont(new Font("serif",Font.PLAIN,26));
        add(b5);
        
        b6 = new JLabel("Rs 60000");
        b6.setBounds(280,520,100,40);
        b6.setFont(new Font("serif",Font.PLAIN,26));
        add(b6);
        
        b7 = new JLabel("Rs 60000");
        b7.setBounds(280,590,100,40);
        b7.setFont(new Font("serif",Font.PLAIN,26));
        add(b7);
        
        b8 = new JLabel("Rs 60000");
        b8.setBounds(280,660,100,40);
        b8.setFont(new Font("serif",Font.PLAIN,26));
        add(b8);
        
        
        bb1 = new JLabel("Rs 32000");
        bb1.setBounds(480,170,100,40);
        bb1.setFont(new Font("serif",Font.PLAIN,26));
        add(bb1);
        
        bb2 = new JLabel("Rs 32000");
        bb2.setBounds(480,240,100,40);
        bb2.setFont(new Font("serif",Font.PLAIN,26));
        add(bb2);
        
        bb3 = new JLabel("Rs 32000");
        bb3.setBounds(480,310,100,40);
        bb3.setFont(new Font("serif",Font.PLAIN,26));
        add(bb3);
        
        bb4 = new JLabel("Rs 32000");
        bb4.setBounds(480,380,100,40);
        bb4.setFont(new Font("serif",Font.PLAIN,26));
        add(bb4);
        
        bb17 = new JLabel("Rs 32000");
        bb17.setBounds(480,450,100,40);
        bb17.setFont(new Font("serif",Font.PLAIN,26));
        add(bb17);
        
        bb18 = new JLabel("Rs 32000");
        bb18.setBounds(480,520,100,40);
        bb18.setFont(new Font("serif",Font.PLAIN,26));
        add(bb18);
        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new FeeStructure().setVisible(true);
    }
}