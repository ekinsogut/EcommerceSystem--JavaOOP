
package Models;

public class Users {
    
    private String name;
    private String surname;
    private int passwordCus;
    private String passwordAd;
    private String gender;
    private int age;
    private String address;
    private String phone;
    private String tcno;
    private String mail;
    private int credit;
   
    
    //For customer register
    public Users(String name, String surname, int passwordCus, String gender, int age, String address, String phone, String tcno, String mail, int credit) {
        this.name = name;
        this.surname = surname;
        this.passwordCus = passwordCus;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.tcno = tcno;
        this.mail = mail;
        this.credit = credit;
    }
    
    
    //For admin login
    public Users(String mail , String passwordAd) {
        this.mail = mail;
        this.passwordAd = passwordAd;
 
    }
    
    //For customer login
    public Users(String mail , int passwordCus) {
        this.mail = mail;
        this.passwordCus = passwordCus;

    }
    
    public Users() {
    
        
    }
    


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the password
     */
    public int getPasswordCus() {
        return passwordCus;
    }

    /**
     * @param password the password to set
     */
    public void setPasswordCus(int passwordCus) {
        this.passwordCus = passwordCus;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the tcno
     */
    public String getTcno() {
        return tcno;
    }

    /**
     * @param tcno the tcno to set
     */
    public void setTcno(String tcno) {
        this.tcno = tcno;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the credit
     */
    public int getCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(int credit) {
        this.credit = credit;
    }

    /**
     * @return the passwordAd
     */
    public String getPasswordAd() {
        return passwordAd;
    }

    /**
     * @param passwordAd the passwordAd to set
     */
    public void setPasswordAd(String passwordAd) {
        this.passwordAd = passwordAd;
    }
    
    
    
}
