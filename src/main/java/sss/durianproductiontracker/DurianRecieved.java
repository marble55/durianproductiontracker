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
public class DurianRecieved extends DurianBatch{
   
    private LocalDate dateRecieved;
   
   DurianRecieved(){
      super();
      dateRecieved = LocalDate.of(0, 0, 0);
   }
   
   DurianRecieved(String vrty, String qlty, String typ, double frtW, int pcs, int y, int m, int d){
      super(vrty, qlty, typ, frtW, pcs);
      dateRecieved = LocalDate.of(y, m, d);
      
   }
   DurianRecieved(String vrty, String qlty, String typ, LocalDate inputDate){
      super(vrty, qlty, typ);
      dateRecieved = inputDate;
   }
   DurianRecieved(String vrty, String qlty, String typ, double frtW, int pcs){
      super(vrty, qlty, typ, frtW, pcs);
   }
   
   DurianRecieved(DurianRecieved dr){
      super(dr);
      dateRecieved = dr.dateRecieved;
   }
   
   public void setDateRecieved(int y, int m, int d){
      dateRecieved = LocalDate.of(y,m,d);
   }
   public void setDateRecieved(LocalDate inputDate){
      dateRecieved = inputDate;
   }
   public LocalDate getDateRecieved(){
      return dateRecieved;
   }
   
   public void setYear(int year){
      dateRecieved.withYear(year);
   }
   public int getYear(){
      return dateRecieved.getYear();
   }
   
   public void setMonth(int month){
      dateRecieved.withDayOfMonth(month);
   }
   public int getMonth(){
      return dateRecieved.getMonthValue();
   }
   
   public void setDay(int day){
      dateRecieved.withDayOfMonth(day);
   }
   public int getDay(){
      return dateRecieved.getDayOfMonth();
   }
   
   public String toString (){
      return super.toString() + " " + dateRecieved;
   }
   public String Identification(){
      return super.Identification() + " " + dateRecieved;
   }
   
   public boolean equals(DurianRecieved dr){
      return (this.Identification().compareTo(dr.Identification()) == 0);
   }
   public boolean equalsDate(LocalDate dateCompare){
      return (this.dateRecieved.compareTo(dateCompare) == 0);
   }
   public boolean equalsDate(DurianRecieved DurianBatch){
      return (this.dateRecieved.compareTo(DurianBatch.getDateRecieved()) == 0);
   }
}