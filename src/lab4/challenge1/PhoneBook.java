package lab4.challenge1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneBook {
    Contact[] contacts= new Contact[100];

    public PhoneBook(String file){
     Scanner s = null;
     double sum= 0;
     String name;
     String number;
     int count=0;
     try{
         s= new Scanner(new BufferedReader(new FileReader(file)));
         while( s.hasNext()){
             name=s.next();
             number=s.next();
             contacts[count++]= new Contact(name,number);
         }
    } catch (FileNotFoundException e) {
         e.printStackTrace();
     } finally {
         if(s!=null) s.close();
     }
     }
     public Contact getContactByName(String name){
        for (int  i=0; i< count;i++){
            if(contacts[i].getName().equals(name))
                return contacts[i];
        }
        return null;
     }
    @Override
    public String toString() {
        return "PhoneBook{" +
                "contacts=" + Arrays.toString(contacts) +
                '}';
    }
}
