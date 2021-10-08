/*
Name   : Anupoma Angasree Toma
ID     : 2012020060
Section: B
Email  : cse_2012020060@lus.ac.bd
Date   : 11-09-2021
*/
package toma;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Shakib",75);
        Cricket cricket = new Cricket("International match",20,player);
        cricket.display();

        Football football =new Football();
    }
}
