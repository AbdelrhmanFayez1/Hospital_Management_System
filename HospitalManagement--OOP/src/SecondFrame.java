
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class SecondFrame extends Frame implements ActionListener,MouseListener,MouseMotionListener {

    Label L1 = new Label("Welcome To Cairo Hospital");
    Button B1 = new Button("DOCTORS");
    Button B2 = new Button("PATEINTS");
    Button Ex = new Button("Exit");
    ////////////////////Constructor and frame css

    SecondFrame() {
        
        setLayout(null);
        setVisible(true);
        setBounds(400, 200, 700, 600);
        setBackground(Color.WHITE);
        this.setLocation(450, 200);
        
       
        ///////////////////////////////////////////Buttons 1&2&exit
        B1.setBounds(200, 230, 300, 60);
        B1.setBackground(Color.WHITE);
        B1.setForeground(Color.BLACK);
        ////////2//2//2/2/2/
        B2.setBounds(200, 360, 300, 60);
        B2.setBackground(Color.WHITE);
        B2.setForeground(Color.BLACK);
        /////////////////////////////////////////////////////////////_____---exit____//////

        Ex.setBounds(500, 500, 130, 35);
        Ex.setBackground(Color.red);
        Ex.setForeground(Color.white);
        Ex.setFont(new Font("SegoeUlBold", Font.PLAIN, 18));
        /////////////////////////////////////////////////////////////////label__1 welcome//////
        L1.setBounds(175, 100, 500, 50);
        L1.setBackground(Color.WHITE);
        L1.setForeground(Color.BLACK); 
        L1.setFont(new Font("SegoeUlBold", Font.PLAIN, 28));
        /////////////////////////////////////////////////////////addition///////
        add(B1);
        add(B2);
        add(L1);
        add(Ex);
        
        B1.addActionListener(this);
        B1.addMouseListener(this);
        
        B2.addActionListener(this);
        B2.addMouseListener(this);
      
        Ex.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
/////////////////////////////////////////////////////////
        if (e.getSource() == B1) {

            doctors Doc = new doctors();
            Doc.setVisible(true);
            
            dispose();
         }
        /////////
        if (e.getSource() == B2) {

            patient Pat = new patient();
            Pat.setVisible(true);
            dispose();

        }
        ////////////////////////////////////////////////////exit
        if (e.getSource() == Ex) {
            System.exit(0);
        }
/////////////////////////////////////////////////////______main___/////////////////////
    }

    public static void main(String[] args) {
        SecondFrame s1 = new SecondFrame();
    }
///////////////////////////////////////////////////////////mouseeeee////
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //////////////////////////////////////////////////////////////////////////enter
        if(e.getSource()==B1){
        B1.setBackground(Color.DARK_GRAY);
         B1.setForeground(Color.WHITE);
        }
     if(e.getSource()==B2){
          B2.setBackground(Color.DARK_GRAY);
         B2.setForeground(Color.WHITE);
     }
     ///////////////////////////////////////////////////////////////////////////////////    
    }

    @Override
    public void mouseExited(MouseEvent e) {
        /////////////////////////////////////////////////////////////////////////////leave
        if(e.getSource()==B1){
        B1.setBackground(Color.WHITE);
        B1.setForeground(Color.BLACK);
     
        }
           if(e.getSource()==B2){ 
         B2.setBackground(Color.WHITE);
        B2.setForeground(Color.BLACK);
        }
    //////////////////////////////////////////////////////////////////////////////////////
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       
    }

}
