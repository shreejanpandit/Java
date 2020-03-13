import java.awt.*;
import java.awt.event.*;

public class FocusListenerDemo {
   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;

   public FocusListenerDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      FocusListenerDemo  focusListenerDemo = new FocusListenerDemo();  
      focusListenerDemo.showFocusListenerDemo();
   }

   private void prepareGUI(){
      mainFrame = new Frame("Java AWT Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
   
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      statusLabel = new Label();        
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350,100);

      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

       
   private void showFocusListenerDemo(){

      headerLabel.setText("Listener in action: FocusListener");      

      Button okButton = new Button("OK");
      Button cancelButton = new Button("Cancel");
      okButton.addFocusListener(new CustomFocusListener());  
      cancelButton.addFocusListener(new CustomFocusListener());  

      controlPanel.add(okButton);
      controlPanel.add(cancelButton);     
      mainFrame.setVisible(true);  
   }

   class CustomFocusListener implements FocusListener{
      public void focusGained(FocusEvent e) {
         statusLabel.setText(statusLabel.getText() 
         + e.getComponent().getClass().getSimpleName() + " gained focus. ");
      }

      public void focusLost(FocusEvent e) {
         statusLabel.setText(statusLabel.getText() 
         + e.getComponent().getClass().getSimpleName() + " lost focus. ");
      }
   }
}