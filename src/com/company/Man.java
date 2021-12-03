package com.company;
public class Man {//класс
    private  String name,//  Кандидаттың есімі
            familya,// Фамилиясы
            svetglaz,// Көзтүсі
            tuganjeri,// Туған жері
            ruy,// Руы
            car,// Машинасы
            home;// Үйі
    private int year,// Жасы
            ailyq,//Айлығы
            rost;// Бойы

    public Man(String name, String familya, String svetglaz, String tuganjeri, String ruy, String car, String home, int year, int ailyq, int rost) {// Конструктор
        this.name = name;
        this.familya = familya;
        this.svetglaz = svetglaz;
        this.tuganjeri = tuganjeri;
        this.ruy = ruy;
        this.car = car;
        this.home = home;
        this.year = year;
        this.ailyq = ailyq;
        this.rost = rost;
    }

    @Override
    public String toString() {// To String
        return "Man{" +
                "name='" + name + '\'' +
                ", familya='" + familya + '\'' +
                ", svetglaz='" + svetglaz + '\'' +
                ", tuganjeri='" + tuganjeri + '\'' +
                ", ruy='" + ruy + '\'' +
                ", car='" + car + '\'' +
                ", home='" + home + '\'' +
                ", year=" + year +
                ", ailyq=" + ailyq +
                ", rost=" + rost +
                '}';
    }


    // Setter
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

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAilyq() {
        return ailyq;
    }

    public void setAilyq(int ailyq) {
        this.ailyq = ailyq;
    }

    public int getRost() {
        return rost;
    }

    public void setRost(int rost) {
        this.rost = rost;
    }
}