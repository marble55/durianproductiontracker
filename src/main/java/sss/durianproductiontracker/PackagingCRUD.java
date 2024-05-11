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
public class PackagingCRUD {
   
   private ArrayList<DurianPackaging> PackagingList;
   private DurianPackaging dp;
   
   PackagingCRUD(){
      PackagingList = new ArrayList<>();
   }
   
   void createDurianPackaged(DurianPackaging dp){
      PackagingList.add(dp);
   }
   
   public DurianPackaging retrieveDurianPackaging(DurianPackaging searchBatch){
       for(DurianPackaging x: PackagingList){
           if(x.equals(searchBatch)){
               return x;
           }
       }
       return null;
   }
   
   public boolean ifCurrentStatus(DurianRecieved batch){
       for(DurianPackaging x: PackagingList){      
           if (batch.Identification().compareTo(x.Status()) == 0){
               return true;
               
           }
            
        }
       return false;
   }
   public boolean ifCurrentStatusO(DurianOpened batch){
       for(DurianPackaging x: PackagingList){      
           if (batch.Identification().compareTo(x.Status2()) == 0){
               return true;
               
           }
            
        }
       return false;
   }
   
   public DurianPackaging getCurrentStatus(DurianRecieved batch){
       for(DurianPackaging x: PackagingList){
           if (batch.Identification().compareTo(x.Status()) == 0){
               return x; 
           }
        }
       
       return null;
   }
      
   public void updateDurianPackaging (DurianPackaging dp, DurianPackaging NewdpDetails){
      DurianPackaging batch = retrieveDurianPackaging(dp);
      
      if(batch == null){}
      else{
            batch.setDateRecieved(NewdpDetails.getDateRecieved());
            batch.setVrty(NewdpDetails.getVrty());
            batch.setQlty(NewdpDetails.getQlty());
            batch.setPieces(NewdpDetails.getPieces());
            batch.setfrtWeight(NewdpDetails.getfrtWeight());
            batch.setDateOpened(NewdpDetails.getDateOpened());
            batch.setPcsOpened(NewdpDetails.getPcsOpened());
            batch.setPulpWeight(NewdpDetails.getPulpWeight());
            batch.setDatePackaged(NewdpDetails.getDatePackaged());
            batch.setPcsPackaged(NewdpDetails.getPcsPackaged());
            
      }       
            
   }
   
   public void deleteDurianPackaging (DurianPackaging dp){
      boolean found = false; 
      
      for(int i=0; i<PackagingList.size() && found != true; i++){
         
         found = PackagingList.get(i).equals(dp);
         if(found){
            PackagingList.remove(i);
            return;
         }
      }
   }
   
   public ArrayList<DurianPackaging>  getList(){
       return PackagingList;
   } 
    
   
   public String toStringOutput(){
      String str = "";
      
      for(DurianPackaging dp: PackagingList) str+= "Variety: " + dp.getVrty() + "\n" + "Quality: " + dp.getQlty() + "\n" + "Harvest Type: " + dp.getHtype()
                    + "\n" + "Fruit Weight: " + dp.getfrtWeight() + "\n" + "Recieved Pieces: " + dp.getPieces() + "\n" + "Date Recieved: " + dp.getDateRecieved() 
                    + "\n" + "Date Opened: " + dp.getDateOpened() + "\n" + "Pulp Weight: " + dp.getPulpWeight() + "\n" + "Pieces Opened:" + dp.getPcsOpened() 
                    + "\n" + "Date Packaged: " + dp.getDatePackaged() + "\n" + "Pieces Packaged: " + dp.getPcsPackaged();      
      return str;
   }
   
   public String toString(){
       String str = "";
       
       for(DurianPackaging dp: PackagingList) 
                    str += dp.getVrty() + "\n" + dp.getQlty() + "\n" + dp.getHtype() + "\n" + dp.getfrtWeight() + "\n" + dp.getPieces() 
                        + "\n" + dp.getYear() + "\n" + dp.getMonth() + "\n" + dp.getDay()
                        + "\n" + dp.getYearOpened() + "\n" + dp.getMonthOpened() + "\n" + dp.getDayOpened() 
                        + "\n" + dp.getPulpWeight() + "\n" + dp.getPcsOpened()
                        + "\n" + dp.getYearPackaged() + "\n" + dp.getMonthPackaged() + "\n" + dp.getDayPackaged() 
                        + "\n" + dp.getPcsPackaged() + "\n";
       
       return str;

   }
}
