/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_system;

/**
 *
 * @author raney
 */
public class Details {
    
    private String id;
    private String prodname;
    private int price;
    
     public Details(String Id,String Prodname,int Price)
    {
        this.id = Id;
        this.prodname = Prodname;
        this.price = Price;
    }
     
     public String getId()
    {
        return id;
    }
    
    public String getProdname()
    {
        return prodname;
    }
    
    public int getPrice()
    {
        return price;
    }    
}
