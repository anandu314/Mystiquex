package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static ArrayList<String> favoriteBooks = new ArrayList<String>();

    public static void addFavoriteBook(String bookName)
        {

            favoriteBooks.add(bookName);
            return ;
        }

    public static void printfavbooks(){
        int size = favoriteBooks.size();
        System.out.println("Favorite Books: " + size);
        for(int i=0;i<size; i++){
            System.out.println(favoriteBooks.get(i));
        }

    }
    public static void main(String[] args) {
	// write your code here
        int no, flag=0;
        String bookname;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of books:");
        no= sc.nextInt();
//        sc.skip(System.lineSeparator());
        String[] names = new String[no];
//        System.out.println(no);
        System.out.println("enter the name of books :" );
        if(sc.hasNext())
        {
            sc.nextLine();
        }
        for (int i=0;i<no;i++)
        {
            flag = 0;
            bookname=sc.nextLine();
//            System.out.println(bookname);
            String delims = "[ ]";
            String[] tokens = bookname.split(delims);
            // iterate over `char[]` array using enhanced for-loop
            int size1 = tokens.length;
            for (int j=0; j<size1; j++) {

                if (tokens[j].equals("great")){
                    flag = 1;
                    break;
                }

            }
            if (flag ==1){
                continue;}
            addFavoriteBook(bookname);


        }
        sc.close();

        printfavbooks();


    }


}

