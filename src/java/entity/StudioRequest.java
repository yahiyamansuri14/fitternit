/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author yahiya_mansuri
 */
public class StudioRequest {
    private String request_id;
    private String o_name;
    private String o_contact;
    private String email;
    private String s_name;
    private String address;
    private byte[] image;

    public String getRequest_id() {
        return request_id;
    }

    public String getO_name() {
        return o_name;
    }

    public String getO_contact() {
        return o_contact;
    }

    public String getEmail() {
        return email;
    }

    public String getS_name() {
        return s_name;
    }

    public String getAddress() {
        return address;
    }

    public byte[] getImage() {
        return image;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public void setO_name(String o_name) {
        this.o_name = o_name;
    }

    public void setO_contact(String o_contact) {
        this.o_contact = o_contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "StudioRequest{" + "request_id=" + request_id + ", o_name=" + o_name + ", o_contact=" + o_contact + ", email=" + email + ", s_name=" + s_name + ", address=" + address + ", image=" + image + '}';
    }
    
}
