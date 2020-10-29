package Phonebook;

public class Main {

    public static void main(String[] args){

        Phonebook phonebook = new Phonebook();

        phonebook.add("Лисичкина", "89161111111");
        phonebook.add("Лисичкина", "89161111112");
        phonebook.add("Лисичкина", "89161111113");
        phonebook.add("Воробьев", "89161111114");
        phonebook.add("Волков", "89161111115");


        System.out.println("Лисичкина");
        System.out.println(phonebook.get("Лисичкина"));
        System.out.println("Воробьев");
        System.out.println(phonebook.get("Воробьев"));

    }
}
