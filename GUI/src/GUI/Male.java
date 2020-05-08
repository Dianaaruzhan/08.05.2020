package GUI;

import java.io.Serializable;
import java.util.ArrayList;

public class Male implements Serializable {
    private Integer id;
    private String name;
    private String surname;
    private String age;
    private String region;
    private ArrayList <Male> males;

    public Male(Object o, String name, String surname, String age, String region) {}

    public Male() {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.region = region;
        this.males = males;
    }

    public Male(ArrayList<Male> males) {
        this.males = males;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public ArrayList<Male> getMales() {
        return males;
    }

    public void setMales(ArrayList<Male> males) {
        this.males = males;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String toString(){
        return id + " " + "Name:" + name + "  " + "Surname:" + surname + "  " + "Age:" + age + "  " + "Region:" + region;
    }
}