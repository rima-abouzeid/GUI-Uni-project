/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petstoredataproject;

/**
 *
 * @author Rima Az
 */
public class petStore1 {
    private String address;
    private String storeName;
    private int phoneNumber;
    private String petSupplies;

    public petStore1(String address, String storeName, int phoneNumber, String petSupplies) {
        this.address = address;
        this.storeName = storeName;
        this.phoneNumber = phoneNumber;
        this.petSupplies = petSupplies;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPetSupplies() {
        return petSupplies;
    }

    public void setPetSupplies(String petSupplies) {
        this.petSupplies = petSupplies;
    }


}
