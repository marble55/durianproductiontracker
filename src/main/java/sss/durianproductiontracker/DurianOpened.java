/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sss.durianproductiontracker;
import java.time.LocalDate;

/**
 *
 * @author JC
 */
public class DurianOpened extends DurianRecieved {

   private LocalDate dateOpened;
   private double pulpWeight;
   private int piecesOpened;

   DurianOpened(){
      super();
      dateOpened = LocalDate.of(0,0,0);
      pulpWeight = 0.0;
      piecesOpened = 0;
   }
   DurianOpened(String vrty, String qlty, String typ, 
           double frtW, int pcs, int yR, int mR, int dR, 
           int yOp, int mOp, int dOp, double pW, int pcsOp){
      super(vrty, qlty, typ, frtW, pcs, yR, mR, dR);
      dateOpened = LocalDate.of(yOp, mOp, dOp);
      pulpWeight = pW;
      piecesOpened = pcsOp;
   }
   DurianOpened(DurianRecieved batch, int yOp, int mOp, int dOp, double pW, int pcsOp){
      super(batch);
      dateOpened = LocalDate.of(yOp, mOp, dOp);
      pulpWeight = pW;
      piecesOpened = pcsOp;
   }
   DurianOpened(DurianRecieved batch, LocalDate date, double pW, int pcsOp){
      super(batch);
      dateOpened = date;
      pulpWeight = pW;
      piecesOpened = pcsOp;
   }
   DurianOpened(String vrty, String qlty, String typ, LocalDate dateRec, LocalDate dateOp){
      super(vrty, qlty, typ, dateRec);
      dateOpened = dateOp;
   }
   DurianOpened(String vrty, String qlty, String typ, double frtW, int pcs, int yOp, int mOp, int dOp, double pW, int pcsOp){
      super(vrty, qlty, typ, frtW, pcs);
      dateOpened = LocalDate.of(yOp, mOp, dOp);
      pulpWeight = pW;
      piecesOpened = pcsOp;
   }
   DurianOpened(DurianOpened dOp){
      super(dOp);
      dateOpened = dOp.dateOpened;
      pulpWeight = dOp.pulpWeight;
      piecesOpened = dOp.piecesOpened;
   }
   
   public void setDateOpened(int y, int m, int d){
      dateOpened = LocalDate.of(y,m,d);
   }
   public void setDateOpened(LocalDate inputDate){
      dateOpened = inputDate;
   }
   public LocalDate getDateOpened(){
      return dateOpened;
   }
   
   public void setYearOpened(int year){
      dateOpened.withYear(year);
   }
   public int getYearOpened(){
      return dateOpened.getYear();
   }
   
   public void setMonthOpened(int month){
      dateOpened.withMonth(month);
   }
   public int getMonthOpened(){
      return dateOpened.getMonthValue();
   }
   
   public void setDayOpened(int day){
      dateOpened.withDayOfMonth(day);
   }
   public int getDayOpened(){
      return dateOpened.getDayOfMonth();
   }

   void setPulpWeight(double pulpWeight){
      this.pulpWeight = pulpWeight;
   }
   public double getPulpWeight(){
      return pulpWeight;
   }
   
   void setPcsOpened(int pcs){
      piecesOpened = pcs;
   }
   public int getPcsOpened(){
      return piecesOpened;
   }
 
   public String toString(){
      return super.toString() + " " + dateOpened + " " + pulpWeight + " " + piecesOpened;
   }
   
   public String Identification(){
      return super.Identification() + " " + dateOpened;
   }
   public String Status(){
      return getVrty() + " " + getQlty() + " " + getHtype() + " " + getDateRecieved();
   }
   
   public boolean equals(DurianRecieved dr){
      return (this.Identification().compareTo(dr.Identification()) == 0);
   }
   public boolean equalsDate(LocalDate dateCompare){
      return (this.dateOpened.compareTo(dateCompare) == 0);
   }
   public boolean equalsDate(DurianOpened DurianBatch){
      return (this.dateOpened.compareTo(DurianBatch.getDateOpened()) == 0);
   }
}
