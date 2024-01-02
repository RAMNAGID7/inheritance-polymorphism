// Assignment: 2
// Author: Ram Nagid, ID: 318692779
package ex2bank;
public class Personld {
    public long id;
    public String firstname;
    public String lastname;
    public String address;

    public long getid() {
        return id;
    }

    public String getfirstname() {
        return firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }
    public void setid(int firstid) {
        if (id > 0) {
            id = firstid;
        } else {
            id = -1*firstid;
        }
    }
    public Personld (long idf, String namef, String namel, String add ) {
        this.id=idf;
        this.firstname=namef;
        this.lastname=namel;
        this.address=add;
    }
    public Personld (Personld p1) {
        this.id= p1.getid();
        this.firstname=p1.getfirstname();
        this.lastname=p1.getlastname();
        this.address=p1.getAddress();
    }
    public String toString ()
    {
        return ("Person id: "+getid()+", name: "+getfirstname()+" "+getlastname()+", address: "+getAddress());
    }
    public String equals ()
    {
        if (this.id==getid())
        {
            return ("This is the same client.");
        }
        return "";
    }

}

