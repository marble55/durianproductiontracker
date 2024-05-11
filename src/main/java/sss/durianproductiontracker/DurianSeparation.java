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

public class DurianSeparation extends DurianOpened {
    
    private LocalDate dateSeparation;
    private double MeatWithSeed, MeatWithoutSeed;
    private String color;
    
    DurianSeparation(){
        super();
        dateSeparation = LocalDate.of(0,0,0);
        MeatWithSeed = 0.0;
        MeatWithoutSeed = 0.0;
        color = null;
    }
    
    DurianSeparation(String vrty, String qlty, String typ, 
                   double frtW, int pcs, int yR, int mR, int dR, 
                   int yOp, int mOp, int dOp, double pW, int pcsOp,  
                   int ySp, int mSp, int dSp, double MeatWithSeed, double MeatWithoutSeed ,String color){
        super(vrty, qlty, typ, frtW, pcs, yR, mR, dR, yOp, mOp, dOp, pW, pcsOp);
        this.dateSeparation = LocalDate.of(ySp, mSp, dSp);
        this.MeatWithSeed = MeatWithSeed;
        this.MeatWithoutSeed = MeatWithoutSeed;
        this.color = color;
    }
    
    DurianSeparation(DurianOpened batch, int ySp, int mSp, int dSp, double MeatWithSeed, double MeatWithoutSeed ,String color){
      super(batch);
      dateSeparation = LocalDate.of(ySp, mSp, dSp);
      this.MeatWithSeed = MeatWithSeed;
      this.MeatWithoutSeed = MeatWithoutSeed;
      this.color = color;
   }
   DurianSeparation(String vrty, String qlty, String typ, LocalDate dateRec, LocalDate dateOp, LocalDate dateSeparated, String clr){
      super(vrty, qlty, typ, dateRec, dateOp);
      dateSeparation = dateSeparated;
      color = clr;
   }
     DurianSeparation(DurianSeparation dSp){
      super(dSp);
      dateSeparation = dSp.dateSeparation;
      MeatWithSeed = dSp.MeatWithSeed;
      MeatWithoutSeed = dSp.MeatWithoutSeed;
     }  
    
    public void setDateSeparation(int y, int m, int d){
        this.dateSeparation = LocalDate.of(y,m,d);
    }
    public void setDateSeparation(LocalDate inputDate){
      dateSeparation = inputDate;
   }
    public LocalDate getDateSeparation(){
      return dateSeparation;
   }
        
    void setMeatWithSeed (double MeatWithSeed) {
        this.MeatWithSeed = MeatWithSeed;
    }
    
    void setMeatWithoutSeed (double MeatWithoutSeed){
        this.MeatWithoutSeed = MeatWithoutSeed;
    }
    
    void setcolor (String color){
        this.color = color;
    }
    
    public void setYearSeparation(int year){
      dateSeparation.withYear(year);
   }
   public int getYearSeparation(){
      return dateSeparation.getYear();
   }    
   public void setMonthSeparation(int month){
      dateSeparation.withMonth(month);
   }
   public int getMonthSeparation(){
      return dateSeparation.getMonthValue();
   }
   
   public void setDaySeparation(int day){
      dateSeparation.withDayOfMonth(day);
   }
   public int getDaySeparation(){
      return dateSeparation.getDayOfMonth();
   }
    
    public LocalDate getDurianSeparation(){
      return dateSeparation;
   }
        
    public double getMeatWithSeed(){
        return MeatWithSeed;
    }
    
    public double getMeatWithoutSeed(){
        return MeatWithoutSeed;
    }
    
    public String getcolor(){
        return color;
    }
    
    public String toString(){
        return super.toString() + " " + dateSeparation + " " + MeatWithSeed + " " + MeatWithoutSeed + " " + color ;
    }
    
    public String Identification(){
      return super.Identification() + " " + dateSeparation;
   }
    
    public String Status2(){
      return super.Identification();
   }
    
     public boolean equals(DurianSeparation dSp){
      return (this.Identification().compareTo(dSp.Identification()) == 0);
   }
     
     public boolean equalsDate(LocalDate dateCompare){
      return (this.dateSeparation.compareTo(dateCompare) == 0);
   }
   public boolean equalsDate(DurianSeparation DurianBatch){
      return (this.dateSeparation.compareTo(DurianBatch.getDateSeparation()) == 0);
   }
}
