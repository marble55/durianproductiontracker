/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sss.durianproductiontracker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class openedController {
     public static OpenedCRUD OList = new OpenedCRUD();
    
    public static void WriteFile() throws FileNotFoundException{
        PrintWriter outfile = new PrintWriter("BATCH_OPENED.txt");
        outfile.print(OList);
        outfile.close();
    }
    
    public static void LoadFile() throws FileNotFoundException{
        
        File fReader = new File("BATCH_OPENED.txt");
        
        if (fReader.canRead()){
            Scanner fileScan = new Scanner(fReader);
                
                while(fileScan.hasNext()){
                    String vrty = fileScan.nextLine();
                    String qlty = fileScan.nextLine();
                    String typ = fileScan.nextLine();
                    double frtW = Double.parseDouble(fileScan.nextLine());
                    int pcs = Integer.parseInt(fileScan.nextLine());
                    int yR = Integer.parseInt(fileScan.nextLine());
                    int mR = Integer.parseInt(fileScan.nextLine());
                    int dR = Integer.parseInt(fileScan.nextLine());
                    int yO = Integer.parseInt(fileScan.nextLine());
                    int mO = Integer.parseInt(fileScan.nextLine());
                    int dO = Integer.parseInt(fileScan.nextLine());
                    double pulpW = Double.parseDouble(fileScan.nextLine());
                    int pcsOpened = Integer.parseInt(fileScan.nextLine());
                    DurianOpened batch = new DurianOpened(vrty, qlty, typ, frtW, pcs, yR, mR, dR, yO, mO, dO, pulpW, pcsOpened);
                    OList.createDurianOpened(batch);
                    
                }
        }
    }

}