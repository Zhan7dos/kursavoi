package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);// Жана ақпаратты еңгізу
        List<Woman> woman= new ArrayList<>();// Жана тізімді жариялаймыз
        woman.add(new Woman("Azhar","Sabitova","green","Taraz","dulat",21,158));//Кандидат туралы ақпарат еңгізу
        woman.add(new Woman("Dinara","Omarova","black","Kokshetau","Argin",20,167));//Кандидат туралы ақпарат еңгізу
        woman.add(new Woman("Zhanara","Seitova","Brown","Aktau","Adai",28,170));//Кандидат туралы ақпарат еңгізу
        woman.add(new Woman("Akmaral","Otegenova","blue","Almaty","Naiman",25,168));//Кандидат туралы ақпарат еңгізу
        woman.add(new Woman("Arujan","Zharkyn","black","Almaty","Tore",27,171));//Кандидат туралы ақпарат еңгізу
        woman.add(new Woman("Altynai","Sarsenkulova","black","Taraz","konurat",21,163));//Кандидат туралы ақпарат еңгізу
        woman.add(new Woman("Aigerim","Tlebaldy","brown","Pavlodar","naiman",29,175) );//Кандидат туралы ақпарат еңгізу
        woman.add(new Woman("Alina","Dulatova","black","Oskemen","shapyrasty",22,165));//Кандидат туралы ақпарат еңгізу
        woman.add(new Woman("Zhania","Aubakir","brown","Turkistan","taraqty",22,156));//Кандидат туралы ақпарат еңгізу
        woman.add(new Woman("Mariam","Tasbolatova","brown","Petropavl","naiman",22,169));//Кандидат туралы ақпарат еңгізу

        List<Man> man= new ArrayList<>();//Жаңа тізімді еңгізу
        man.add(new Man("Alisher","Azizov","black","Semei","oshaqty","Audi","bar",30,400000,178));//Кандидат туралы ақпарат еңгізу
        man.add(new Man("Dulat","Kuzenbai","brown","Taldyqorgan","konyrat","Hyundai","bar",28,280000,175));//Кандидат туралы ақпарат еңгізу
        man.add(new Man("Beishembekov","Merzhan","green","Aqtobe","alim","BMW","bar",29,550000,181));//Кандидат туралы ақпарат еңгізу
        man.add(new Man("Begen","Raimbek","brown","Pavlodar","kerei","Lexus","bar",26,250000,182));//Кандидат туралы ақпарат еңгізу
        man.add(new Man("Batyrzhan","Dosmuhambetov","black","Almaty","isty","Skoda","bar",28,280000,190));//Кандидат туралы ақпарат еңгізу
        man.add(new Man("Muhamedali","Nurtasov","black","Kentau","konurat","Audi","zhoq",25,200000,185) );//Кандидат туралы ақпарат еңгізу
        man.add(new Man ("Baqdaulet","Zhambai","brown","Oral","argyn","Hyundai","zhoq",31,300000,186));//Кандидат туралы ақпарат еңгізу
        man.add(new Man("Asimkul","Zhalgasov","brown","Karagandy","argyn","Lexus","bar",32,350000,188));//Кандидат туралы ақпарат еңгізу
        man.add(new Man("Izbasar","Batyrhan","brown","Kyzylorda","naiman","Hyundai","bar",30,450000,183));//Кандидат туралы ақпарат еңгізу
        man.add(new Man("Niyaz","Ramazanov","black","Kostanai","kerei","Audi","bar",34,380000,179));//Кандидат туралы ақпарат еңгізу
        System.out.println("Екінші жартыңызды табатын жобаға қощ келдіңіз");
        System.out.println("Who you are? \n1 - man\n2 - woman");//Консольға шығару
        String name, familya, svetglaz, ruy, tuganjery;// Айнылмалар
        int g = sc.nextInt();// Таңдау айнылмасы
        boolean joq = false;
        if(g == 1) {// шарт

            int year, rost;//айнылмалы
            String ilkgjydfh = sc.nextLine();
            System.out.println("Коз тусы кандай болсын");
            svetglaz = sc.nextLine();// Таңдау айнылмасы
            System.out.println("Жасы нешеде болсын");
            year = sc.nextInt();// Таңдау айнылмасы
            System.out.println("Бойы канша болсын");
            rost = sc.nextInt();// Таңдау айнылмасы
            for (int i = 0; i < woman.size(); i++) {// For циклі
                if ( woman.get(i).getYear() >= year && woman.get(i).getRost() >= rost &&// шарт
                        woman.get(i).getSvetglaz().equals(svetglaz)) {
                    System.out.println(woman.get(i).toString());// Консольға табылған кандидатты шығару
                }
                else
                    joq = true;
            }

        }
        else if (g == 2){// шарт
            //String name, familya, svetglaz, tuganjery, ruy, car,home;
            String ddddd = sc.nextLine();
            String car, home;// айнылмалы
            int year, rost, ailyq; // айнылмалы
            System.out.println("Коз тосын танда ");
            svetglaz = sc.nextLine();// Таңдау айнылмасы
            System.out.println("Жасын танда");
            year = sc.nextInt();// Таңдау айнылмасы
            System.out.println("Бойын танда");
            rost = sc.nextInt();// Таңдау айнылмасы
            System.out.println("Машинасын танда");
            car = sc.nextLine();// Таңдау айнылмасы
            car = sc.nextLine();// Таңдау айнылмасы
            System.out.println("Уйы болсын ба?");
            home = sc.nextLine();// Таңдау айнылмасы
            System.out.println("Айлыгы неше болсын?");
            ailyq =sc.nextInt();// Таңдау айнылмасы
            for (int i=0;i<man.size();i++){// For циклі
                if ( man.get(i).getYear() >= year && man.get(i).getRost()>=rost &&
                        man.get(i).getSvetglaz().equals(svetglaz)&& man.get(i).getAilyq()>=ailyq && man.get(i).getCar().equalsIgnoreCase(car)){// шарт
                    System.out.println(man.get(i).toString());// Консольға табылған кандидатты шығару
                }
                else// шарт
                    joq = true;
            }
        }if(joq == true){//шарт
            System.out.println("Ondai kandidat tizimde joq");// консольға шығару
        }

    }
}


