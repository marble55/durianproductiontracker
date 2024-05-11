/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sss.durianproductiontracker;

/**
 *
 * @author JIM
 */
public class DurianBatch {
   private String variety;
   private String quality;
   private String harvestTyp;
   private double frtWeight;
   private int pieces;
   
   DurianBatch(){
      variety = "";
      quality = "";
      harvestTyp = "";
      frtWeight = 0.0;
      pieces = 0;   
   }
   DurianBatch(String vrty, String qlty, String typ, double frtW, int pcs){
      variety = vrty;
      quality = qlty;
      harvestTyp = typ;
      frtWeight = frtW;
      pieces = pcs;   
   }
   DurianBatch(String vrty, String qlty, String typ){
      variety = vrty;
      quality = qlty;
      harvestTyp = typ;   
   }
   DurianBatch(DurianBatch db){
      variety = db.variety;
      quality = db.quality;
      harvestTyp = db.harvestTyp;
      frtWeight = db.frtWeight;
      pieces = db.pieces;   
   }
   //MUTATORS//
   public void setVrty(String v){
      variety = v;
   }
   public String getVrty(){
      return variety;
   }
   public void setQlty(String q){
      quality = q;
   }
   public String getQlty(){
      return quality;
   }
   public void setHtype(String ht){
      harvestTyp = ht;
   }
   public String getHtype(){
      return harvestTyp;
   }
   public void setfrtWeight(double fw){
      frtWeight = fw;
   }
   public double getfrtWeight(){
      return frtWeight;
   }
   public void setPieces(int p){
      pieces = p;
   }
   public int getPieces(){
      return pieces;
   }
   
   public String toString(){
      return variety + " " + quality + " " + harvestTyp + " " + frtWeight + " " + pieces;  
   }
   public String Identification (){
      return variety + " " + quality + " " + harvestTyp; 
   }
   
   public boolean equals(DurianBatch db){
      return (this.Identification().compareTo(db.Identification()) == 0);
   }
}
