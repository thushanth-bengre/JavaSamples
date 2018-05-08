/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Bengre
 */
public class MarketOfferCatalog {
    private ArrayList<MarketOffer> listOfMarketOffer;
    
    //constructor
    public MarketOfferCatalog(){
        listOfMarketOffer = new ArrayList();
    }

    public ArrayList<MarketOffer> getListOfMarketOffer() {
        return listOfMarketOffer;
    }

    //Add Market Offer
    public MarketOffer addMarketOffer(){
        MarketOffer mo = new MarketOffer();
        listOfMarketOffer.add(mo);
        return mo;
    }
    
    public void removeMarketOffer(MarketOffer mo){
        listOfMarketOffer.remove(mo);
    }
    
    
}
