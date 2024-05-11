/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sss.durianproductiontracker;
import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author JC
 */
public class DurianPackaging extends DurianOpened {
   
   private LocalDate datePackaged;
   private int piecesPackaged;
   
   DurianPackaging(){
      super();
      datePackaged = LocalDate.of(0,0,0);
      piecesPackaged = 0;
   }
   
   DurianPackaging(String vrty, String qlty, String typ, 
                   double frtW, int pcs, int yR, int mR, int dR, 
                   int yOp, int mOp, int dOp, double pW, int pcsOp, 
                   int yPkg, int mPkg, int dPkg, int pcsPkg){
      super(vrty, qlty, typ, frtW, pcs, yR, mR, dR, yOp, mOp, dOp, pW, pcsOp);
      datePackaged = LocalDate.of(yPkg, mPkg, dPkg);
      piecesPackaged = pcsPkg;
   }
   DurianPackaging(String vrty, String qlty, String typ, double frtW, int pcs, int yrOp, int mOp, int dOp, double pW, int yPkg, int mPkg, int dPkg){
      //super(vrty, qlty, typ, frtW, pcs, yrOp, mOp, dOp, pW);
      datePackaged = LocalDate.of(yPkg, mPkg, dPkg);
   }
   DurianPackaging(DurianOpened batch, int yPkg, int mPkg, int dPkg, int pcsPkg){
       super(batch);
       datePackaged = LocalDate.of(yPkg, mPkg, dPkg);
       piecesPackaged = pcsPkg;
   }
   DurianPackaging(String vrty, String qlty, String typ, LocalDate dateRec, LocalDate dateOp, LocalDate datePack){
      super(vrty, qlty, typ, dateRec, dateOp);
      datePackaged = datePack;
   }
   DurianPackaging(DurianPackaging dp){
      super(dp);
      datePackaged = dp.datePackaged;
      piecesPackaged = dp.piecesPackaged;
   }
   
   public void setDatePackaged(int y, int m, int d){
      datePackaged = LocalDate.of(y,m,d);
   }
   public void setDatePackaged(LocalDate inputDate){
      datePackaged = inputDate;
   }
   public LocalDate getDatePackaged(){
      return datePackaged;
   }
   
    public void setYearPackaged(int year){
      datePackaged.withYear(year);
   }
   public int getYearPackaged(){
      return datePackaged.getYear();
   }
   
   public void setMonthPackaged(int month){
      datePackaged.withMonth(month);
   }
   public int getMonthPackaged(){
      return datePackaged.getMonthValue();
   }
   
   public void setDayPackaged(int day){
      datePackaged.withDayOfMonth(day);
   }
   public int getDayPackaged(){
      return datePackaged.getDayOfMonth();
   }
   
   void setPcsPackaged(int pcs){
       piecesPackaged = pcs;
   }
   public int getPcsPackaged(){
       return piecesPackaged;
   }
   
   public String Identification(){
      return super.Identification() + " " + datePackaged;
   }
   public String Status2(){
      return super.Identification();
   }

   
   public boolean equals(DurianPackaging batch){
      return (this.Identification().compareTo(batch.Identification()) == 0);
   }
   public boolean equalsDate(LocalDate dateCompare){
      return (this.datePackaged.compareTo(dateCompare) == 0);
   }
   public boolean equalsDate(DurianPackaging DurianBatch){
      return (this.datePackaged.compareTo(DurianBatch.getDatePackaged()) == 0);
   }
   
   
   public String toString(){
      return super.toString() + " " + datePackaged;
   }
}
