/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sss.durianproductiontracker;

/**
 *
 * @author JC
 */

import java.time.LocalDate;
import java.util.ArrayList;

public class RecievedCRUD {
   private ArrayList <DurianRecieved> RecievedList;
   private DurianRecieved dr;
    
   RecievedCRUD(){
      RecievedList = new ArrayList<>();
   }
    
   void createRecieveBatch (DurianRecieved dr){ 
      RecievedList.add(dr);
   }
    
   public DurianRecieved retrieveDurianRecieved (DurianRecieved dr){
      for(DurianRecieved x: RecievedList){
         if (x.equals(dr))
            return x;
      }
      return null;     
   }
   public DurianRecieved retrieveByDate (LocalDate inputDate){
      for(DurianRecieved x: RecievedList){
         if (x.equalsDate(inputDate))
            return x;
      }
      return null;     
   }
   
   public int getCurrentProcess(DurianRecieved x){
          if(openedController.OList.ifCurrentStatus(x) == false && packagingController.PList.ifCurrentStatus(x) == false && separationController.SList.ifCurrentStatus(x) == false){
              return 0;
          }
          else if(openedController.OList.ifCurrentStatus(x) == true && packagingController.PList.ifCurrentStatus(x) == true && separationController.SList.ifCurrentStatus(x) == false ){
              return 2;
          }
          else if(openedController.OList.ifCurrentStatus(x) == true && packagingController.PList.ifCurrentStatus(x) == false && separationController.SList.ifCurrentStatus(x) == true ){
              return 3;
          }
          else{
              return 1;
          }
   }
   
   public ArrayList<DurianRecieved>  getList(){
       return RecievedList;
   } 
    
   public void updateDurianRecieved (DurianRecieved dr, DurianRecieved NewDRDetails){
       DurianRecieved batch = retrieveDurianRecieved(dr);
       
        if (batch == null){
            }
        else{
            batch.setDateRecieved(NewDRDetails.getDateRecieved());
            batch.setVrty(NewDRDetails.getVrty());
            batch.setQlty(NewDRDetails.getQlty());
            batch.setPieces(NewDRDetails.getPieces());
            batch.setfrtWeight(NewDRDetails.getfrtWeight());
            
      }    
   }
        
   public void deleteDurianRecieved (DurianRecieved dr){
      boolean found = false; 
        
      for(int i=0; i<RecievedList.size() && found != true; i++){
            
         found = RecievedList.get(i).equals(dr);
         if(found){
            RecievedList.remove(i);
            return;
         }
      }
   }
        
   public String toStringOutput(){
      String str = "";
        
      for(DurianRecieved dr: RecievedList) str+= "Variety: " + dr.getVrty() + "\n" + "Quality: " + dr.getQlty() + "\n" + "Harvest Type: " + dr.getHtype()
              + "\n" + "Fruit Weight: " + dr.getfrtWeight() + "\n" + "Pieces : " + dr.getPieces() + "\n" + "Date Recieved: " + dr.getDateRecieved() + "\n";
        
      return str;
   }
   
   public String toString(){
       String str = "";
        
      for(DurianRecieved dr: RecievedList) str+= dr.getVrty() + "\n" + dr.getQlty() + "\n" + dr.getHtype()
              + "\n" + dr.getfrtWeight() + "\n" + dr.getPieces() 
              + "\n" + dr.getYear() + "\n" + dr.getMonth() + "\n" + dr.getDay() + "\n";
        
      return str;

   }
}
