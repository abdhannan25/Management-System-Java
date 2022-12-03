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

public class TrackerTest {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        Scanner sc1 =  new Scanner(System.in);
        AddStock add = new AddStock();
        CheckStock read = new CheckStock();
        int choice, i=1,j=1;
        System.out.println("*************** WELCOME TO HANNAN TRACKERS ***************\n");
        System.out.println("Enter 1 to add Stock\nEnter 2 to check Stock\nEnter 3 to Close\n");
        choice = sc.nextInt();
       
        while(choice==1 || choice==2){
            if(choice ==1){
                while(i==1){
                    do{
                        System.out.println("Enter a 3 digit invoice number:");
                        add.setInvoiceNo(sc1.nextLine());
                        if(add.getInvoiceNo().matches("\\d{3}")){}
                        else{
                            System.out.println("Invoice Number entered in wrong Format\nEnter Again!!\n\n");
                        }
                    }
                    while(!add.getInvoiceNo().matches("\\d{3}"));
                    do{
                        System.out.println("Enter Date of purchase in this format DD-MM-YYYY");
                        add.setDate(sc1.nextLine());
                        if(add.getDate().matches("^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4}$")){}
                        else{
                            System.out.println("Date is Wrong\nInput Again!!\n\n");
                        }
                    }
                    while(!add.getDate().matches("^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4}$"));
                    System.out.print("Enter the name of Tracker company you want to add Stock of:  ");
                    add.setCompany(sc1.nextLine());
                    System.out.print("Enter Tracker No.:");
                    add.setTrackerNo(sc.nextInt());
                    System.out.print("Enter Cost Price:");
                    add.setCostPrice(sc.nextDouble());
                    System.out.print("Enter Selling price:");
                    add.setSellingPrice(sc.nextDouble());
                    System.out.print("Enter Activity Status 'A' for active and 'N' for non active:");
                    add.setActiveStatus(sc1.nextLine());
                    add.saveToFile();
                    System.out.println("\n***************************************************");
                    System.out.print("\nIf you want to add more data Press 1 otherwise press any number:");
                    i = sc.nextInt();
                    if(i==1){}
                    else if(i!=1){
                        break;
                    }
                }
            }
            else if(choice==2){
                while(j==1){
                
                System.out.println("Enter Company name to see its trackers:\nNote:WE Have only company A's, B's and C's trackers. Enter Acordingly!!   ");
                read.setCompany(sc1.nextLine());
                System.out.printf("%-10s%-12s%-15s%-15s%-15s%-15s\n","InvoiceNo","Date","Tracker NO","Cost Price","Selling Price","Activity Status");
                read.readFromFile();
                System.out.println("\n***************************************************");
                System.out.print("\nIf you want to Continue Reading Data Press '1' otherwise Press any number");
                i = sc.nextInt();
                if(i==1){}
                else if(i!=1){
                    break;
                }
                
                }
            }
//            
            System.out.println("\n***************************************************");
            System.out.println("\nEnter 1 to add Stock\nEnter 2 to check Stock\nEnter 3 to Close\n");
            choice = sc.nextInt();
            
        }
                
        System.out.println("\n**********EXITING**********");
    }
}
