/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author rajesh
 */
@Entity
@Table(name = "details", catalog = "exam", schema = "")
@NamedQueries({
    @NamedQuery(name = "Details.findAll", query = "SELECT d FROM Details d")
    , @NamedQuery(name = "Details.findByCname", query = "SELECT d FROM Details d WHERE d.cname = :cname")
    , @NamedQuery(name = "Details.findByProduct", query = "SELECT d FROM Details d WHERE d.product = :product")
    , @NamedQuery(name = "Details.findByQuantity", query = "SELECT d FROM Details d WHERE d.quantity = :quantity")
    , @NamedQuery(name = "Details.findByContact", query = "SELECT d FROM Details d WHERE d.contact = :contact")
    , @NamedQuery(name = "Details.findByEmail", query = "SELECT d FROM Details d WHERE d.email = :email")
    , @NamedQuery(name = "Details.findByA", query = "SELECT d FROM Details d WHERE d.a = :a")})
public class Details implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "cname")
    private String cname;
    @Basic(optional = false)
    @Column(name = "product")
    private String product;
    @Basic(optional = false)
    @Column(name = "quantity")
    private String quantity;
    @Basic(optional = false)
    @Column(name = "contact")
    private String contact;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "no")
    private String no;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "")
    private Integer a;

    public Details() {
    }

    public Details(Integer a) {
        this.a = a;
    }

    public Details(Integer a, String cname, String product, String quantity, String contact, String email) {
        this.a = a;
        this.cname = cname;
        this.product = product;
        this.quantity = quantity;
        this.contact = contact;
        this.email = email;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        String oldCname = this.cname;
        this.cname = cname;
        changeSupport.firePropertyChange("cname", oldCname, cname);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        String oldProduct = this.product;
        this.product = product;
        changeSupport.firePropertyChange("product", oldProduct, product);
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        String oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        String oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        Integer oldA = this.a;
        this.a = a;
        changeSupport.firePropertyChange("a", oldA, a);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (a != null ? a.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Details)) {
            return false;
        }
        Details other = (Details) object;
        if ((this.a == null && other.a != null) || (this.a != null && !this.a.equals(other.a))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "exam.Details[ a=" + a + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
