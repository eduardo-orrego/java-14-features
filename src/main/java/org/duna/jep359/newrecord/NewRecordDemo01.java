package org.duna.jep359.newrecord;

public class NewRecordDemo01 {
  public static void main(String[] args) {
    // Using a register
    PersonRecord personRecord1 = new PersonRecord("Edward", 38,null);
    System.out.println(personRecord1.name());
    System.out.println(personRecord1.year());
    System.out.println(personRecord1.greeting());

    // Immutable by default
    // personRecord1.name = "Peter"; // Causes a compilation error

    // Destructuring records
    PersonRecord personRecord2 = new PersonRecord("Mary", 25,null);
    String name = personRecord2.name();
    int age = personRecord2.year();

    // Can be used as constructor arguments
    PersonRecord fatherRecord = new PersonRecord("Carlos", 50,null);
    PersonRecord childRecord = new PersonRecord("Ana", 15, fatherRecord);
    System.out.println(childRecord.fatherRecord().name()); // Prints "Carlos"
  }
}


