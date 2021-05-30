package admission.management.system;

import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
import java.awt.Color;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class engineering extends JFrame
{ 
  JTextArea jta1;
  Font f;
  engineering()
  {
      setBounds(50, 50, 700, 500);
     f=new Font("Arial",Font.BOLD,15);
     
      String s1="\n" +"Eligibility for B. Tech Programs (Duration: 4 years)\n" +"\n";
      String s2=  "(a) Nationality and Age\n" +"\n";
      String s3=  "(i) Resident Indian or Non-Resident Indian (NRI), holder of PIO or OCI card issued by Government of India are eligible to apply for Selection Process." +"\n" +
 "Note: NRIs, holders of PIO or OCI card issued by Government of India must apply under International student category only." +"\n" +
 
"(ii)Should have attained the age of 16 + on the 31st July of the calendar year in which the 12th Board or examination is to be held.\n" +"\n";

     String s4="(b) Qualifying Examination:"+"\n";
     String s5="\nAll B. Tech programmes:Minimum 60% aggregate in PCM" +"\n" +

"\n(i) Passed in the Higher secondary examination (10+2 pattern) or appearing in Higher Secondary examination in the current academic year with Physics, Chemistry and Mathematics (PCM)\n as major subjects in the regular stream from any state board within India, CBSE, ISCE, Matriculation, or NIOS" +"\n" +

"(ii) International Baccalaureate (IB) A-level with Physics, Chemistry, and Mathematics as major subjects in any International school within India"+"\n";
      
      
     jta1=new JTextArea();
     jta1.append(s1+"\n");
     jta1.append(s2+"\n");
     jta1.append(s3+"\n");
     jta1.append(s4+"\n");
     jta1.append(s5+"\n");
     
     add(jta1);
     jta1.setEditable(false);
     jta1.setFont(f);
     jta1.setForeground(Color.blue);
    
  }
  
 public static void main(String[] args)
    {
        arts obj=new arts();  
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
    }
         
}
