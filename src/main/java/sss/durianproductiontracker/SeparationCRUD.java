/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sss.durianproductiontracker;

/**
 *
 * @author JC
 */

import java.util.*;

public class SeparationCRUD {
   private ArrayList<DurianSeparation> SeparationList;
   private DurianSeparation ds;
    
   SeparationCRUD(){
      SeparationList = new ArrayList<>();
   }
    
   void createDurianSeparated(DurianSeparation ds){
      SeparationList.add(ds);
   }
   
   
    
   public DurianSeparation retriveDurianSeparation (DurianSeparation ds){
      for(DurianSeparation x: SeparationList){
         if (x.equals(ds))
            return x;
      }
      return null;
            
   }
   
   public boolean ifCurrentStatus(DurianRecieved batch){
       for(DurianSeparation x: SeparationList){
           if (batch.Identification().compareTo(x.Status()) == 0){
               return true; 
           }
        }
       
       return false;
   }
   public DurianSeparation getCurrentStatus(DurianRecieved batch){
       for(DurianSeparation x: SeparationList){
           if (batch.Identification().compareTo(x.Status()) == 0){
               return x; 
           }
        }
       
       return null;
   }
   
   public boolean ifCurrentStatusO(DurianOpened batch){
       for(DurianSeparation x: SeparationList){      
           if (batch.Identification().compareTo(x.Status2()) == 0){
               return true;
               
           }
            
        }
       return false;
   } 
    
   public void updateDurianSeparation (DurianSeparation ds, DurianSeparation NewdsDetails){
      DurianSeparation batch = retriveDurianSeparation(ds); 
      
      if(ds == null){}
      else{
            batch.setDateRecieved(NewdsDetails.getDateRecieved());
            batch.setVrty(NewdsDetails.getVrty());
            batch.setQlty(NewdsDetails.getQlty());
            batch.setPieces(NewdsDetails.getPieces());
            batch.setfrtWeight(NewdsDetails.getfrtWeight());
            batch.setDateOpened(NewdsDetails.getDateOpened());
            batch.setPcsOpened(NewdsDetails.getPcsOpened());
            batch.setPulpWeight(NewdsDetails.getPulpWeight());
            batch.setDateSeparation(NewdsDetails.getDateSeparation());
            batch.setMeatWithSeed(NewdsDetails.getMeatWithSeed());
            batch.setMeatWithoutSeed(NewdsDetails.getMeatWithoutSeed());
            batch.setcolor(NewdsDetails.getcolor());
      }
      
      
   }
    
   public void deleteDurianSeparation (DurianSeparation ds){
      DurianSeparation searchBatch = retriveDurianSeparation(ds);
      if(searchBatch == null){}
      else{
          SeparationList.remove(searchBatch);
      }
   }
   
   public ArrayList<DurianSeparation>  getList(){
       return SeparationList;
   } 
    
   public String toStringOutput(){
      String str = "";
        
      for(DurianSeparation ds: SeparationList) str+= "Variety: " + ds.getVrty() + "\n" + "Quality " + ds.getQlty() + "\n" + "Harvest Type: " + ds.getHtype()
                + "\n" + "Fruit Weight: " + ds.getfrtWeight() + "\n" + "Pieces : " + ds.getPieces() + "\n" + "Date Recieved: " + ds.getDateRecieved() 
                + "\n" +  "Date Opened: " + ds.getDateOpened()+ "\n" + "Date Separated :" + ds.getDateSeparation() 
                + "\n" + "Meat w/ Seed: " + ds.getMeatWithSeed() + "\n" + "Meat w/o Seed: " + ds.getMeatWithoutSeed() + "\n" + "Color: " + ds.getcolor() ;
        
      return str;
   }
   
   public String toString(){
       String str = "";
       
       for(DurianSeparation ds: SeparationList) 
                    str += ds.getVrty() + "\n" + ds.getQlty() + "\n" + ds.getHtype() + "\n" + ds.getfrtWeight() + "\n" + ds.getPieces() 
                        + "\n" + ds.getYear() + "\n" + ds.getMonth() + "\n" + ds.getDay()
                        + "\n" + ds.getYearOpened() + "\n" + ds.getMonthOpened() + "\n" + ds.getDayOpened() 
                        + "\n" + ds.getPulpWeight() + "\n" + ds.getPcsOpened()
                        + "\n" + ds.getYearSeparation() + "\n" + ds.getMonthSeparation() + "\n" + ds.getDaySeparation()
                        + "\n" + ds.getMeatWithSeed() + "\n" + ds.getMeatWithoutSeed() + "\n" + ds.getcolor() + "\n";
       
       return str;

   } 
    
}