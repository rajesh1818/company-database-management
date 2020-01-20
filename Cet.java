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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "details", catalog = "exam", schema = "")
@NamedQueries({
    @NamedQuery(name = "details.findAll", query = "SELECT c FROM details c")
    , @NamedQuery(name = "details.findBycname", query = "SELECT c FROM details c WHERE c.cname = :cname")
    , @NamedQuery(name = "details.findBycontact", query = "SELECT c FROM Cet c WHERE c.contact = :contact")})
public class Cet implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cname")
    private String cname;
    @Column(name = "contact")
    private String contact;

    public Cet() {
    }

    public Cet(String cname) {
        this.cname = cname;
    }

    public String getcname() {
        return cname;
    }

    public void setcname(String cname) {
        String oldcname = this.cname;
        this.cname =cname;
        changeSupport.firePropertyChange("cname", oldcname, cname);
    }

    public String getcontact() {
        return contact;
    }

    public void setcontact(String contact) {
        String oldcontact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldcontact, contact);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contact != null ? contact.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cet)) {
            return false;
        }
        Cet other = (Cet) object;
        if ((this.contact == null && other.contact != null) || (this.contact != null && !this.contact.equals(other.contact))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "exam.Cet[ contact=" + contact + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
