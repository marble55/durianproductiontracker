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
public class recievedController {
     public static RecievedCRUD RList = new RecievedCRUD();
    
    public static void WriteFile() throws FileNotFoundException{
        PrintWriter outfile = new PrintWriter("BATCH_RECIEVED.txt");
        outfile.print(RList);
        outfile.close();
    }
    
    public static void LoadFile() throws FileNotFoundException{
        
        File fReader = new File("BATCH_RECIEVED.txt");
        
        if (fReader.canRead()){
            Scanner fileScan = new Scanner(fReader);
                
                while(fileScan.hasNext()){
                    String vrty = fileScan.nextLine();
                    String qlty = fileScan.nextLine();
                    String typ = fileScan.nextLine();
                    double frtW = Double.parseDouble(fileScan.nextLine());
                    int pcs = Integer.parseInt(fileScan.nextLine());
                    int y = Integer.parseInt(fileScan.nextLine());
                    int m = Integer.parseInt(fileScan.nextLine());
                    int d = Integer.parseInt(fileScan.nextLine());
                    DurianRecieved batch = new DurianRecieved(vrty, qlty, typ, frtW, pcs, y, m, d);
                    RList.createRecieveBatch(batch);
                }
        }
    }
    

}
