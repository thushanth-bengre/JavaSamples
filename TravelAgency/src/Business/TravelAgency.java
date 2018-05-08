/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bengre
 */
public class TravelAgency {
    private CustomerDir cd;
    private AirlineDirectory ad;
    
    public TravelAgency(){
        cd= new CustomerDir();
        ad = new AirlineDirectory();        
    }

    public CustomerDir getCd() {
        return cd;
    }

    public void setCd(CustomerDir cd) {
        this.cd = cd;
    }

    public AirlineDirectory getAd() {
        return ad;
    }

    public void setAd(AirlineDirectory ad) {
        this.ad = ad;
    }
    
}
