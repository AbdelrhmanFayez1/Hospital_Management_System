


//////////////////////////////import classes
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class Login1 extends Frame implements ActionListener {
/////////////////////////////////////////////////////////////////////create objects///////////////// 
    Label L1=new Label("       LOGIN PAGE ");
    
  
    Label L2=new Label("Username");
    Label L3=new Label("Password");
    JRadioButton r1 = new JRadioButton("White");
    JRadioButton r2 = new JRadioButton("Black");
    
  TextField T1 =new TextField();
    TextField T2 =new TextField();
    
    Button B1 =new Button("SIGN IN");
    Button Ex =new Button("Exit");
    
  ////////////////////////////////////////////////////////////////main constructor of this class/////////
    Login1(){
        //////////frame css///////////  
        setTitle("Login_Form");
       setLayout(null);
       this.setLocation(430, 200);
      
       setVisible(true);
       this.setSize(750, 596);
       setBackground(Color.WHITE);
       
   //////////////////////////////////////////////////////////////////another objects css/////////////
        L1.setBounds(245,100,210,50);
       L1.setBackground(Color.WHITE);
       L1.setForeground(Color.BLACK);
       L1.setSize(250, 100);
       L1.setFont(new Font("Arial", Font.PLAIN, 25));
       T1.setFont(new Font("Arial", Font.PLAIN, 16));
       T2.setFont(new Font("Arial", Font.PLAIN, 16));
       
       
   ////////////////////////////////////////////////////////////////////////////Label//////////////////////
   L2.setBounds(100,220,100,30);
       L2.setBackground(Color.WHITE);
       
          L3.setBounds(100,280,100,30);
       L3.setBackground(Color.WHITE);
      L3.setFont(new Font("SegoeUlBold", Font.PLAIN, 18));
       L2.setFont(new Font("SegoeUlBold", Font.PLAIN, 18));
  ///////////////////////////////////////////////////////////////////////TextField and Button////////////////
       T1.setBounds(250,220,300,30);
       T1.setBackground(Color.WHITE);
       
          T2.setBounds(250,280,300,30);
       T2.setBackground(Color.WHITE);
       ////////
       B1.setBounds(300,400,130,50);
       B1.setBackground(Color.white);
       ///////exit
       Ex.setBounds(500, 500, 130, 35);
       Ex.setBackground(Color.red);
       Ex.setForeground(Color.WHITE);
       Ex.setFont(new Font("SegoeUlBold", Font.PLAIN, 18));
       //////////////////////////////////////////////////////////////////radio buttons
       r1.setLayout(null);
       r2.setLayout(null);
       r1.setBounds(650,30,250,20);
       r2.setBounds(650,60,250,20);
       
 /////////////////////////////////////////////////////////////addition/////////////
    add(L1);
        add(T1);
        add(T2);
            add(L2);
            add(L3);
                 add(B1);
                 add(Ex);
                 add(r1);
                  add(r2);
B1.addActionListener(this);
Ex.addActionListener(this);
r2.addActionListener(this);
r1.addActionListener(this);

    
    }
    
    
  ////////////////////////////////////////////main
    public static void main(String[] args) {   
        Login1 log =new Login1();
          
        
    }
////////////////////////////////////////////transiaction from button to second frame if user &pass valid
    @Override
   public void actionPerformed(ActionEvent e) {
                //////////////////////////////////////////
   String username =T1.getText();
    String password =T2.getText();
                ///////////////////////////////////////////
        if(e.getSource() == B1){
           if(username.equals("admin") && password.equals("admin")){
          
               SecondFrame secf =new SecondFrame();
               secf.setVisible(true); 
               dispose();
              
            }
           else{
               System.out.println("errorrrrrrr");
           }
           /////////////////////////////////////////////////////////////////exit
            }
        if(e.getSource()==Ex){
            System.exit(0);
        }
        ////////////////////////////////////////////////////////////////////radio colors
        if(e.getSource()==r2)
        {
          setBackground(Color.BLACK);
          L1.setBackground(Color.BLACK);
          L1.setForeground(Color.WHITE);
          L2.setBackground(Color.BLACK);
          L2.setForeground(Color.WHITE);
          L3.setBackground(Color.BLACK);
          L3.setForeground(Color.WHITE);
        }
         if(e.getSource()==r1){
          setBackground(Color.WHITE);
          L1.setBackground(Color.WHITE);
          L1.setForeground(Color.BLACK);
          L2.setBackground(Color.WHITE);
          L2.setForeground(Color.BLACK);
          L3.setBackground(Color.WHITE);
          L3.setForeground(Color.black);
            
        }
            
        }
        
    }


  
