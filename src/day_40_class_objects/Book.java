package day_40_class_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
	String title;
	String author;
	int pages;

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		book1.title = "Harry Potter";
		book1.author = "J.K.Rolling";
		book1.pages = 500;
		book2.title = "Eat Pray Love";
		book2.author = "Elizabeth Gilbert";
		book2.pages = 300;
		book3.title = "Shantaram";
		book3.author = "Gregory Robins";
		book3.pages = 378;
		List<Book> myBooks = new ArrayList<>();
		myBooks.add(book1);
		myBooks.add(book2);
		myBooks.add(book3);
        for(Book each: myBooks) {
        	System.out.println(each.author);
        }
        
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.nextLine(); 
		List<Book> newBooks = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			Book newBook = new Book();
			System.out.println("Please enter book title " + (i + 1) + ": ");
			newBook.title = scan.next();
			System.out.println("Please enter book author " + (i + 1));
			newBook.author = scan.next();
			System.out.println("Please enter book pages " + (i + 1));
			newBook.pages = scan.nextInt();
			newBooks.add(newBook);
		}
		System.out.println(size);
		//to print in [] format
		System.out.println(newBooks);
		
		for(Book b : newBooks) {
			System.out.printf("%s, %s, %d\n", b.title, b.author, b.pages);
		}

	}
	//overriding method t print out 
	public String toString () {
		
		return String.format("%s, %s, %d", title, author, pages);
	}
	

}
