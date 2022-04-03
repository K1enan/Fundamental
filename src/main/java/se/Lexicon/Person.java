package se.Lexicon;

public class Person {public static void main(String[]args)

{
    String Myname = "Kenan";
    Myname = Myname +"Almousa ";
    {System.out.println(Myname);}

    String firstName ="Erik ";
    String lastName = "Svensson ";
    int age = 42;
    String hobby = "Programming ";
    String sentece = firstName + lastName + "is "+ age + " years old likes "+ hobby;
    {System.out.println(sentece);}

//?

    Person erik = new Person();
    String FirstName;
    String LastName;
    int age;
    String hobby;

    erik.FirstName = "Erik";
    erik.LastName = "Svensson";
    erik.age = "42";
    erik.hobby = "programmig";
    public String getInformation();
    {return FirstName + " " + LastName + " is " + age +" years old and likes " + hobby;}

}



}


    
