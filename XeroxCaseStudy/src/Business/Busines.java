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
public class Busines {
    private CustomerDir cd;
    private MarketList ml;
    private MarketOfferCatalog moc;
    private MasterOrderList mol;
    private PersonDir pd;
    private SupplierDir sd;
    private UserDir ud;
    

    public Busines() {
        cd = new CustomerDir();
        ml = new MarketList();
        moc = new MarketOfferCatalog();
        mol = new MasterOrderList();
        pd = new PersonDir();
        sd = new SupplierDir();
        ud = new UserDir();
    }

    public CustomerDir getCd() {
        return cd;
    }

    public void setCd(CustomerDir cd) {
        this.cd = cd;
    }

    public MarketList getMl() {
        return ml;
    }

    public void setMl(MarketList ml) {
        this.ml = ml;
    }

    public MarketOfferCatalog getMoc() {
        return moc;
    }

    public void setMoc(MarketOfferCatalog moc) {
        this.moc = moc;
    }

    public MasterOrderList getMol() {
        return mol;
    }

    public void setMol(MasterOrderList mol) {
        this.mol = mol;
    }

    public PersonDir getPd() {
        return pd;
    }

    public void setPd(PersonDir pd) {
        this.pd = pd;
    }

    public SupplierDir getSd() {
        return sd;
    }

    public void setSd(SupplierDir sd) {
        this.sd = sd;
    }

    public UserDir getUd() {
        return ud;
    }

    public void setUd(UserDir ud) {
        this.ud = ud;
    }
    
    
    
    
}
