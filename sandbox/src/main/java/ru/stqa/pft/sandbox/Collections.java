package ru.stqa.pft.sandbox;

import java.util.Arrays;
import java.util.List;

/**
 * Created by azatz on 11/12/2016.
 */
public class Collections {

  public static void main(String[] args) {
    String[] langs = {"Java", "C#", "Python", "PHP"}; // massive, cannot add more arguments

    for(int i = 0; i < langs.length; i++ ) {
      System.out.println("I want to learn " + langs[i]);
    }

    System.out.println("-------------------LOL---------------");

    for ( String l : langs){
      System.out.println("I want to learn " + l);
    }

    System.out.println("-------------------LOLOLOLOL---------------");

    List<String> languages = Arrays.asList("Java", "C#", "Python");

    for ( String l: languages ){
      System.out.println("Я не знаю " + l);
    }

  }
}
