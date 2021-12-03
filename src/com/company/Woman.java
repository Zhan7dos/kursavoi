package com.company;
public class Woman {// класс
    private  String name,// есімі
            familya,//фамилия
            svetglaz,// көзтүсі
            tuganjeri,//туған жері
            ruy;// руы
    private int year,//жасы
            rost;// бойы

    public Woman(String name, String familya, String svetglaz, String tuganjeri, String ruy, int year, int rost) {//Конструктор
        this.name = name;
        this.familya = familya;
        this.svetglaz = svetglaz;
        this.tuganjeri = tuganjeri;
        this.ruy = ruy;
        this.year = year;
        this.rost = rost;
    }
//Getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilya() {
        return familya;
    }

    public void setFamilya(String familya) {
        this.familya = familya;
    }

    public String getSvetglaz() {
        return svetglaz;
    }

    public void setSvetglaz(String svetglaz) {
        this.svetglaz = svetglaz;
    }

    public String getTuganjeri() {
        return tuganjeri;
    }

    public void setTuganjeri(String tuganjeri) {
        this.tuganjeri = tuganjeri;
    }

    public String getRuy() {
        return ruy;
    }

    public void setRuy(String ruy) {
        this.ruy = ruy;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRost() {
        return rost;
    }

    public void setRost(int rost) {
        this.rost = rost;
    }

    @Override
    public String toString() { // toString
        return "Woman{" +
                "name='" + name + '\'' +
                ", familya='" + familya + '\'' +
                ", svetglaz='" + svetglaz + '\'' +
                ", tuganjeri='" + tuganjeri + '\'' +
                ", ruy='" + ruy + '\'' +
                ", year=" + year +
                ", rost=" + rost +
                '}';
    }
}