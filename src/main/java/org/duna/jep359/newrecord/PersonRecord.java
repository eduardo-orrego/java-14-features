package org.duna.jep359.newrecord;

public record PersonRecord(String name, int year, PersonRecord fatherRecord) {
  public String greeting() {
    return "Hello, my name is "+name+" and I am "+year+" years old.";
  }
}
