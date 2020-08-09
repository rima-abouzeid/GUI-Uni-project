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
public class pet {
     private int id;
    private int age;
    private String furColor;
    private String type;
    private int owner_id;
 

    public pet() {
    }

    public pet(int id, int age, String furColor, String type, int owner_id) {
        this.id = id;
        this.age = age;
        this.furColor = furColor;
        this.type = type;
        this.owner_id = owner_id;
  
    }



    public int getId() {
        return id;
    }


    public int getAge() {
        return age;
    }

    public String getFurColor() {
        return furColor;
    }

    public String getType() {
        return type;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }
    

    public void setAge(int age) {
        this.age = age;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
