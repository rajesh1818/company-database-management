/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author rajesh
 */
class detail {
    private int no;
    private String cname,product,quantity,contact,email;
    
    public detail(String cname,String product,String quantity,String contact,String email,int no)
    {
        this.cname = cname;
        this.product = product;
        this.quantity = quantity;
        this.contact = contact;
        this.email = email;
        this.no = no;
        
    }
    public String getcname(){
        return cname;
    }
    public String getproduct(){
        return product;
    }
    public String getquantity(){
        return quantity;
    }
    public String getcontact(){
        return contact;
    }
    public String getemail(){
        return email;
    }
    public int getno(){
        return no;
    }
    
    
    
    
    
            
    
    


}
    

