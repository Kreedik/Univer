
package com.mycompany.univer;


public class University {
    private int id;
    private String title;
    private String address;

    public University(int id, String title, String address) {
        this.id = id;
        this.title = title;
        this.address = address;
    }
    public String toString()
        {
            return this.id+" "+this.title+" "+this.address;
        }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
