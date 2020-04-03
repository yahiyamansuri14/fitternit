/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author hp
 */
public class Owner {
    private String owner_id;
    private String o_name;
    private String o_email;
    private String o_address;
    private String o_contact;
    private byte[] image;

    public void setImage(byte[] image) {
        this.image = image;
    }

    public byte[] getImage() {
        return image;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public String getO_name() {
        return o_name;
    }

    public String getO_email() {
        return o_email;
    }

    public String getO_address() {
        return o_address;
    }

    public String getO_contact() {
        return o_contact;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public void setO_name(String o_name) {
        this.o_name = o_name;
    }

    public void setO_email(String o_email) {
        this.o_email = o_email;
    }

    public void setO_address(String o_address) {
        this.o_address = o_address;
    }

    public void setO_contact(String o_contact) {
        this.o_contact = o_contact;
    }

    @Override
    public String toString() {
        return "Owner{" + "owner_id=" + owner_id + ", o_name=" + o_name + ", o_email=" + o_email + ", o_address=" + o_address + ", o_contact=" + o_contact + ", image=" + image + '}';
    }

    
    
}
