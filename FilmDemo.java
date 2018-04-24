import java.util.Arrays;
import java.util.Scanner;

public class FilmDemo {
    public static Film[] filmArray = new Film[10];

    public static void addToList(Film newFilm){
        boolean inArray = false;
        for(int i = 0; i < filmArray.length; i++){
            if(filmArray[i] == null){

            }
            else if(newFilm.equals(filmArray[i])){
                inArray = true;
            }
        }
        if(!inArray){
            for(int i = 0; i < filmArray.length; i++) {
                if(filmArray[i] == null) {
                    filmArray[i] = newFilm;
                    i = filmArray.length;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int tempYear;
        String tempDirector;
        String tempName;

        int Option;

        do {

            System.out.println("Pick an option. " +
                    "\nPress 1 to add a movie." +
                    "\nPress 2 to view all movies." +
                    "\nPress 3 to leave program.");

            Option = keyboard.nextInt();
            keyboard.nextLine();

            if (Option == 1) {
                System.out.println("What year is the release of the movie?");
                tempYear = keyboard.nextInt();
                System.out.println("What is the name of the director?");
                tempDirector = keyboard.next();
                System.out.println("What is the name of the movie?");
                tempName = keyboard.next();
                addToList(new Film(tempName,tempDirector,tempYear));

            }if (Option == 2) {
                System.out.println("Here are the contents of the array:");
                displayFilms(filmArray);

            }if (Option == 3) {

            }

        } while (Option !=3);


    }
    public static void displayFilms(Film[] list){
        for(int i = 0; i < list.length;i++){
            if(filmArray[i] == null){

            }
            else{
                System.out.print("Name: " + list[i].getFilmName());
                System.out.print(" Director: " + list[i].getDirectorName());
                System.out.println(" Year Produced: " + list[i].getFilmYear());
            }
        }
    }
}
