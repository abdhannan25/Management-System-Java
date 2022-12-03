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

public class AddStock {
    private static Formatter output;
    private String invoiceNo;
    private String date;
    private String company;
    private int trackerNo;
    private double costPrice;
    private double sellingPrice;
    private String activeStatus;
    
    //Constructors

    public AddStock() {
        System.out.println("\n");
    }

    public AddStock(String invoiceNo, String date, String company, int trackerNo, double costPrice, double sellingPrice, String activeStatus) {
        this.invoiceNo = invoiceNo;
        this.date = date;
        this.company = company;
        this.trackerNo = trackerNo;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.activeStatus = activeStatus;
    }
    

    
    
    public String getInvoiceNo() {    
        return invoiceNo;
    }

    //Getter and Setter Methods
    
    public void setInvoiceNo(String invoiceNo) {    
        this.invoiceNo = invoiceNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String Date) {
        this.date = Date;
    }
    

    public String getCompany() {
        return company;
    }
    

    public void setCompany(String company) {
        this.company = company;
    }

    public int getTrackerNo() {
        return trackerNo;
    }

    public void setTrackerNo(int trackerNo) {
        this.trackerNo = trackerNo;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }
    
    //Methods
    public void saveToFile(){
        if(company.equalsIgnoreCase("Company A")){
            try{
                FileWriter f1 = new FileWriter("Company A.txt",true);
                output = new Formatter(f1);
                output.format("%s %s %d %.2f %.2f %s%n",invoiceNo, date, trackerNo, costPrice, sellingPrice, activeStatus);
                output.close();
            }
            catch(Exception e1){
                e1.printStackTrace();
            }
        }
        else if(company.equalsIgnoreCase("Company B")){
            try{
                FileWriter f2 = new FileWriter("Company B.txt",true);
                output = new Formatter(f2);
                output.format("%s %s %d %.2f %.2f %s%n",invoiceNo, date, trackerNo, costPrice, sellingPrice, activeStatus);
                output.close();
            }
            catch(Exception e2){
                e2.printStackTrace();
            }
        }
        else if(company.equalsIgnoreCase("Company C")){
            try{
                FileWriter f3 = new FileWriter("Company C.txt",true);
                output = new Formatter(f3);
                output.format("%s %s %d %.2f %.2f %s%n",invoiceNo, date, trackerNo, costPrice, sellingPrice, activeStatus);
                output.close();
            }
            catch(Exception e3){
                e3.printStackTrace();
            }
        }
        
    }
    
}
