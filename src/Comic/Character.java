package Comic;

public class Character {
    int age;
    String firtsname, lastname, gender, description;


    public Character(int age, String firtsname, String lastname,String gender, String description){

        this.age = age;
        this.firtsname = firtsname;
        this.lastname = lastname;
        this.gender = gender;
        this.description = description;

    }

    public int getAge(){return age;}
    public String getFirstName(){ return  firtsname;}
    public String getLastname(){ return  lastname; }
    public String getGender(){return gender;}
    public String getDescription(){return description;}




}
