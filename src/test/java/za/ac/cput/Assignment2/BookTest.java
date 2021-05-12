package za.ac.cput.Assignment2;

import org.junit.jupiter.api.Test;

import java.util.*;

class BookTest {
  @Test
  void addCollection(){
    //creating collection
    Set<String> collectionSet = new HashSet<>();
    //add Books in this collection
    collectionSet.add("Information System");
    collectionSet.add("Data Science");
    collectionSet.add("R Programming");
    //Print added books
    System.out.println(collectionSet);
  }
  @Test
  void removeCollection(){
    //creating collection
    Set<String> collectionSet = new HashSet<>();
    //add Books in this collection
    collectionSet.add("Information System");
    collectionSet.add("Data Science");
    collectionSet.add("R Programming");
    //remove one book
    collectionSet.remove("Data Science");
    //Print added books
    System.out.println(collectionSet);
  }
  @Test
  void findCollection(){
    //creating collection
    Set<String> collectionSet = new HashSet<>();
    //add Books in this collection
    collectionSet.add("Information System");
    collectionSet.add("Data Science");
    collectionSet.add("R Programming");
    //Find "R Programing" in the set
    System.out.println(collectionSet.contains("R Programming"));

  }
  @Test
  void addMap(){
    //creating map
    Map<Integer, String> bookMap=new HashMap<>();
    //add map
    bookMap.put(1,"Lord of flies");
    System.out.println(bookMap);

  }
  @Test
  void removeMap(){
    //creating book map
    Map<Integer, String> bookMap=new HashMap<>();
    bookMap.put(1,"Lord of flies");
    bookMap.put(2,"Smart code");
    // Removing the existing key mapping
    bookMap.remove(2);
    System.out.println(bookMap);

  }
  @Test
  void findMap(){
    //creating map
    Map<Integer, String> bookMap=new HashMap<>();
    //add map
    bookMap.put(1,"Lord of flies");
    bookMap.put(2,"Smart code");
    // find key 2
    String key = (String)bookMap.get(2);
    //displaying the book at key2
    System.out.println("key 2 is " + key);

  }
  @Test
  void addSet(){
    //Creating HashSet a
    HashSet<String> bookSet=new HashSet();
    //adding elements
    bookSet.add("Book 1");
    bookSet.add("Book 2");
    bookSet.add("Book 3");

    //printing set of books
    System.out.println(bookSet);

  }
  @Test
  void removeSet() {
    //Creating HashSet a
    HashSet<String> bookSet = new HashSet();
    //adding elements
    bookSet.add("Book 1");
    bookSet.add("Book 2");
    bookSet.add("Book 3");
    //removing set using remove() method
    bookSet.remove("Book 2");
    //printing set of books
    System.out.println(bookSet);
  }
  @Test
  void findSet(){

    //Creating HashSet a
    HashSet<String> bookSet = new HashSet();
    //adding elements
    bookSet.add("Book 1");
    bookSet.add("Book 2");
    bookSet.add("Book 3");
    // Find "Book 1" in the set
    System.out.println(bookSet.contains("Book 1"));

  }
  @Test
  void addList() {
    //Creating list
    List<Book> bookList = new ArrayList<>();
    //Creating Books
    Book b1 = new Book(1, "Nothing But The Truth", "John Kani");
    Book b2 = new Book(2, "Pro Git", "Ben Straub");
    Book b3 = new Book(3, "Cloud Computing", "Ray Rafaels");

    //Adding Books to list
    bookList.add(b1);
    bookList.add(b2);
    bookList.add(b3);
    //Printing added books
    System.out.println(bookList);
  }
    @Test
    void removeList () {
      //Creating list
      List<Book> bookList = new ArrayList<>();
      //Creating Books
      Book b1 = new Book(1, "Nothing But The Truth", "John Kani");
      Book b2 = new Book(2, "Pro Git", "Ben Straub");
      Book b3 = new Book(3, "Cloud Computing", "Ray Rafaels");
     //Adding Books to list
      bookList.add(b1);
      bookList.add(b2);
      bookList.add(b3);
      //Removing Book from list
      bookList.remove(b1);
      //Printing out books to see b1 is removed
      System.out.println(bookList);
    }
    @Test
  void findList(){
      //Creating list
      List<Book> bookList = new ArrayList<>();
      //Creating Books
      Book b1 = new Book(1, "Nothing But The Truth", "John Kani");
      Book b2 = new Book(2, "Pro Git", "Ben Straub");
      Book b3 = new Book(3, "Cloud Computing", "Ray Rafaels");
      //adding book that i want to find
      bookList.add(b1);
      //find book b1
      System.out.println(bookList.contains(b1));
      
    }

  }
