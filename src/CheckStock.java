/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Hannan
 */
import java.util.*;
import java.io.*;
import java.nio.file.Paths;

public class CheckStock {
    private static Scanner input;
    private String invoice;
    private String company;

    public CheckStock() {
        System.out.println("\n");
    }

    
    public CheckStock(String invoice, String company) {
        this.invoice = invoice;
        this.company = company;
    }
    
    
//Getter and Setter

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

   

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    
    

//Methods
    public void readFromFile(){
        if(company.equalsIgnoreCase("Company A")){
        try{
            //if(input.next())
            //File f1 = new File("Company A.txt");
            input = new Scanner(Paths.get("Company A.txt"));
            
            while(input.hasNext()){
                System.out.printf("%-10s%-12s%-15d%-20.2f%-20.2f%s\n",input.next(),input.next(),input.nextInt(),input.nextFloat(),input.nextFloat(),input.next());
            }
            
        }
        catch(Exception e1){
            e1.printStackTrace();
        }
        }
        else if(company.equalsIgnoreCase("Company B")){
            try{
                input = new Scanner(Paths.get("Company B.txt"));
                while(input.hasNext()){
                    System.out.printf("%-10s%-12s%-15d%-20.2f%-20.2f%s\n",input.next(),input.next(),input.nextInt(),input.nextFloat(),input.nextFloat(),input.next());
                }
            }
            catch(Exception e2){
                e2.printStackTrace();
            }
        }
         else if(company.equalsIgnoreCase("Company C")){
            try{
                input = new Scanner(Paths.get("Company C.txt"));
                while(input.hasNext()){
                    System.out.printf("%-10s%-12s%-10d%-10.2f%-10.2f%-10s\n",input.next(),input.next(),input.nextInt(),input.nextFloat(),input.nextFloat(),input.next());
                }
            }
            catch(Exception e3){
                e3.printStackTrace();
            }
        }
         else if(company!="Company A" || company!="Company B" || company!="Company c"){
             System.out.println("\nSorry we don't have trackers of this company\n");
         }
    }
}
