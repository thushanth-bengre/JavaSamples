/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bengre
 */
public class CSVReader {
    private Busines b;
    private CustomerDir cd;
    private MarketList ml;
    private MarketOfferCatalog moc;
    private MasterOrderList mol;
    private PersonDir pd;
    private SupplierDir sd;
    private UserDir ud;
    private ProductCatalog pc;    
    Scanner scanner;
    
    //constructor
    public CSVReader(Busines b){
        this.b = b;
        sd = b.getSd();
        ud= b.getUd();
        cd = b.getCd();
        ml = b.getMl();
        moc = b.getMoc();
        pd= b.getPd();
        mol= b.getMol();        
    }
    
    public void readSupplier(){
        try {
            scanner = new Scanner(new FileReader("Supplier.csv"));        
            scanner.nextLine();
            while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] splits = line.split(",");
            Supplier s = sd.addSupplier();
            s.setName(splits[0]);
            }
            scanner.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("IO ERROR received: "+ ex.getMessage());
        }       
    }
    
    public void readProducts(){
        try {
            scanner = new Scanner(new FileReader("Products.csv"));        
            scanner.nextLine();
            while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] splits = line.split(",");
            String supplierName = splits[0];
            Supplier s = null;
            for(Supplier sup:sd.getListOfSuppliers()){
                if(supplierName.equals(sup.getName()))
                    s = sup;
            }
            ProductCatalog prodCat = s.getPc();            
            Product p = prodCat.addProduct();
            p.setName(splits[1]);
            p.setAvailability(Integer.parseInt(splits[2]));
            p.setSupplierPrice(Integer.parseInt(splits[3]));
            p.setDescription(splits[4]);
            }
            scanner.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("IO ERROR received: "+ ex.getMessage());
        }       
    }
    
    public void readSalesPerson(){
        try {
            scanner = new Scanner(new FileReader("SalesPerson.csv"));        
            scanner.nextLine();
            while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] splits = line.split(",");
            Person p = pd.addPerson();
            p.setFirstName(splits[0]);
            p.setLastName(splits[1]);
            p.setAge(Integer.parseInt(splits[2]));
            }
            scanner.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("IO ERROR received: "+ ex.getMessage());
        }       
    }
    
    public void readUser(){
        try {
            scanner = new Scanner(new FileReader("User.csv"));        
            scanner.nextLine();
            while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] splits = line.split(",");
            int id = Integer.parseInt(splits[0]);
            Person p = null;
            for(Person per:pd.getListOfPerson()){
                if(per.getSalesPersonId() == id)
                    p = per;
            }
            User u = ud.addUser(splits[1]);
            u.setP(p);
            u.setUserName(splits[1]);
            u.setPassword(splits[2]);
            }
            scanner.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("IO ERROR received: "+ ex.getMessage());
        }       
    }
    
    public void readMarket(){
        try {
            scanner = new Scanner(new FileReader("Market.csv"));        
            scanner.nextLine();
            while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] splits = line.split(",");
            Market m = ml.addMarket();
            m.setName(splits[0]);
            }
            scanner.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("IO ERROR received: "+ ex.getMessage());
        }       
    }
    
    public void readMarketOffer(){
        try {
            scanner = new Scanner(new FileReader("MarketOffer.csv"));        
            scanner.nextLine();
            while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] splits = line.split(",");
            Market m = null;
            Product p = null;
            String prodName = splits[0];
            String marketName = splits[1];
            for(Supplier s:sd.getListOfSuppliers()){
                ProductCatalog prodCat = s.getPc();
                for(Product prod: prodCat.getListofProducts()){
                    if(prod.getName().equals(prodName))
                        p = prod;
                }
            }
            for(Market mar:ml.getListOfMarket()){
                if(mar.getName().equals(marketName))
                    m=mar;
            }
            MarketOffer mo = moc.addMarketOffer();
            mo.setP(p);
            mo.setM(m);
            mo.setName(splits[2]);
            mo.setFloor(Integer.parseInt(splits[3]));
            mo.setTarget(Integer.parseInt(splits[4]));
            mo.setCeiling(Integer.parseInt(splits[5]));
            }
            scanner.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("IO ERROR received: "+ ex.getMessage());
        }     
    }
    
    public void readCustomers(){
        try {
            scanner = new Scanner(new FileReader("Customer.csv"));        
            scanner.nextLine();
            while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] splits = line.split(",");
            Market m = null;
            String marketName = splits[0];
            for(Market mar:ml.getListOfMarket()){
                if(mar.getName().equals(marketName))
                    m=mar;
            }
            Customer c = cd.addCustomer();
            c.setM(m);
            c.setName(splits[1]);
            c.setContactNum(splits[2]);
            c.setEmail(splits[3]);
            c.setAddress(splits[4]);
            }
            scanner.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("IO ERROR received: "+ ex.getMessage());
        }      
    }
    
    public void readOrders(){
        try {
            scanner = new Scanner(new FileReader("Orders.csv"));        
            scanner.nextLine();
            while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] splits = line.split(",");
            Market m = null;
            Person p = null;
            Customer c = null;
            int personId = Integer.parseInt(splits[0]);
            String marketName = splits[1];
            int custId = Integer.parseInt(splits[2]);
            for(Market mar:ml.getListOfMarket()){
                if(mar.getName().equals(marketName))
                    m=mar;
            }
            for(Person per:pd.getListOfPerson()){
                if(per.getSalesPersonId() == personId)
                    p = per;
            }
            for(Customer cust:cd.getListOfCustomers()){
                if(cust.getCustId() == custId)
                    c = cust;
            }
            Order o = mol.addOrder();
            o.setC(c);
            o.setM(m);
            o.setP(p);
            }
            scanner.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("IO ERROR received: "+ ex.getMessage());
        }   
    }
    
    public void readOrderItems(){
        try {
            scanner = new Scanner(new FileReader("OrderItems.csv"));        
            scanner.nextLine();
            while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] splits = line.split(",");
            String name = splits[0];
            int targetPrice = Integer.parseInt(splits[2]);
            int salesPrice = Integer.parseInt(splits[3]);
            int orderId = Integer.parseInt(splits[1]);
            Product p = null;
            Order o = null;
            for(Supplier s:sd.getListOfSuppliers()){
                ProductCatalog prodCat = s.getPc();
                for(Product prod: prodCat.getListofProducts()){
                    if(prod.getName().equals(name))
                        p = prod;
                }
            }
            for(Order ord:mol.getListOfOrders()){
                if(ord.getOrderId() == orderId)
                    o = ord;
            }
            OrderItem oi = o.addOderItem();
            oi.setP(p);
            oi.setTargetPrice(targetPrice);
            oi.setSalesPrice(salesPrice);        
            Person per = o.getP();
            Market m = o.getM();
            int diff = Helper.giveDifference(salesPrice, targetPrice);            
            if(diff > 0){
                oi.setAboveTarget(true);
                p.aboveSalesCount();
                m.aboveSalesCount();
                per.aboveSalesCount();
            }
            if(diff == 0){
                oi.setOnTarget(true);
                p.onTargetCount();
                m.onTargetCount();
                per.onTargetCount();
            }
            if(diff < 0){
                oi.setBelowTarget(true);
                p.belowSalesCount();
                m.belowSalesCount();
                per.belowSalesCount();
            }
            p.addTargetPrice(targetPrice);
            p.addRevenue(salesPrice);
            m.addRevenue(salesPrice);
            m.addTargetPrice(targetPrice);
            per.addRevenue(salesPrice);
            per.addTargetPrice(targetPrice);
            double comission = Helper.calculateComission(salesPrice, targetPrice);
            per.addCommission(comission);
            oi.setCommission(comission);           
            }
            scanner.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("IO ERROR received: "+ ex.getMessage());
        } 
    }   
    
}
