/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sss.durianproductiontracker;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class DurianProductionTracker { 

   public static void main(String[] args) {
      try {
         recievedController.LoadFile();
         openedController.LoadFile();
         packagingController.LoadFile();
         separationController.LoadFile();
      } catch (FileNotFoundException ex) {
         Logger.getLogger(DurianProductionTracker.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      MainJFrame mainJF = new MainJFrame();
      mainJF.setVisible(true);
      
      
      
   }
}
