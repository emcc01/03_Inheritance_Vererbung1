package com.cc.java;


// Klasse angeben von wo geerbt wird:
public class Cat extends SuperCat{


  private int counter;

  public Cat(String name, String furColor, int age) {
    super(name, furColor, age); //Daten nach oben geben
  }

  public String getAge() {
    return checkEscalationLevel();
  }

  private String checkEscalationLevel() {

   counter++;

    switch (counter) {
      case 1:
        return "This is an inappropriate question!";   
      case 2:
        return "I've told you once!";
      case 3:
        return "Talk to the hand!";
      default:
        return "1#!?&&%";
    }
    
  }



}
  
