/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sss.durianproductiontracker;

/**
 *
 * @author JC
 */

import java.util.ArrayList;
        
public class OpenedCRUD {
   private ArrayList<DurianOpened> OpenedList;
   private DurianOpened Do;
   
   OpenedCRUD(){
      OpenedList = new ArrayList<>();
   }
   
   void createDurianOpened(DurianOpened Do){
      
      OpenedList.add(Do);
   }
   
   public DurianOpened retrieveDurianOpened (DurianOpened Do){
      for(DurianOpened x: OpenedList){
         if (x.equals(Do))
            return x;
      }
      return null;
          
   }
   
    public ArrayList<DurianOpened>  getList(){
       return OpenedList;
   }
   public DurianRecieved getBatch(int i){
       return OpenedList.get(i);
   }
   
   public int getCurrentProcess(DurianOpened x){
          if(packagingController.PList.ifCurrentStatusO(x) == false && separationController.SList.ifCurrentStatusO(x) == false){
              return 0;
          }
          else if(packagingController.PList.ifCurrentStatusO(x) == true && separationController.SList.ifCurrentStatusO(x) == false ){
              return 1;
          }
          else{
              return 2;
          }
   }
   
   
   public boolean ifCurrentStatus(DurianRecieved batch){
       for(DurianOpened x: OpenedList){
           if (batch.Identification().compareTo(x.Status()) == 0){
               return true;
           }          
        }
       return false;
   }
   
   public DurianOpened getCurrentStatus(DurianRecieved batch){
       for(DurianOpened x: OpenedList){
           if (batch.Identification().compareTo(x.Status()) == 0){
               return x; 
           }
        }
       
       return null;
   }
 
   public void updateDurianOpened (DurianOpened DurianOp, DurianOpened NewDurianOpDetails){
       DurianOpened batch = retrieveDurianOpened(DurianOp);
       
       if(batch == null){
           System.out.print("Update Failed!!!");
       }
       else{
            batch.setDateRecieved(NewDurianOpDetails.getDateRecieved());
            batch.setVrty(NewDurianOpDetails.getVrty());
            batch.setQlty(NewDurianOpDetails.getQlty());
            batch.setPieces(NewDurianOpDetails.getPieces());
            batch.setfrtWeight(NewDurianOpDetails.getfrtWeight());
            batch.setDateOpened(NewDurianOpDetails.getDateOpened());
            batch.setPcsOpened(NewDurianOpDetails.getPcsOpened());
            batch.setPulpWeight(NewDurianOpDetails.getPulpWeight());
            
       }
   }
 
   
   public void deleteDurianOpened (DurianOpened Do){
      DurianOpened searchBatch = retrieveDurianOpened(Do);
      if(searchBatch == null){}
      else{
          OpenedList.remove(searchBatch);
      }
         
      
   }
   
   public String toStringOutput(){
       String str = "";
       
       for(DurianOpened Do: OpenedList) str+= "Variety: " + Do.getVrty() + "\n" + "Quality: " + Do.getQlty() + "\n" + "Harvest Type: " + Do.getHtype()
                    + "\n" + "Fruit Weight: " + Do.getfrtWeight() + "\n" + "Recieved Pieces: " + Do.getPieces() + "\n" + "Date Recieved: " + Do.getDateRecieved() 
                    + "\n" +  "Date Opened: " + Do.getDateOpened() + "\n" + "Pulp Weight: " + Do.getPulpWeight() + "\n" + "Pieces Opened:" + Do.getPcsOpened() + "\n";
       
       return str;
   }
   
   public String toString(){
       String str = "";
       
       for(DurianOpened Do: OpenedList) 
                    str += Do.getVrty() + "\n" + Do.getQlty() + "\n" + Do.getHtype() + "\n" + Do.getfrtWeight() + "\n" + Do.getPieces() 
                        + "\n" + Do.getYear() + "\n" + Do.getMonth() + "\n" + Do.getDay()
                        + "\n" + Do.getYearOpened() + "\n" + Do.getMonthOpened() + "\n" + Do.getDayOpened() 
                        + "\n" + Do.getPulpWeight() + "\n" + Do.getPcsOpened() + "\n";
       
       return str;

   }
}

