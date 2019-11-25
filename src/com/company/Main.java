package com.company;

class Food {
    public String name;

    public Food() {
        System.out.println("Default constructor");
    }

public Food (String n){
    name=n ;
        }

}

public class Main {

    public static void main(String[] args) {
	Food pie=new Food();
	pie.name="teramisu";
	Food swean =new Food();
              swean.name="kugu";
        System.out.println(swean.name);

        Food tadlu =new Food();
        tadlu.name="kemal";
        System.out.println(tadlu.name);

        Food cake=new Food("cake");
        System.out.println(cake.name);

    }


}
