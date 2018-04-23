import java.util.Arrays;
import java.util.Scanner;

public class FilmDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Film[] filmArray = new Film[10];

        int Option;

        do {

            System.out.println("Pick an option. " +
                    "\nPress 1 to add a movie." +
                    "\nPress 2 to view all movies." +
                    "\nPress 3 to leave program.");

            Option = keyboard.nextInt();
            keyboard.nextLine();

             if (Option == 1) {
                System.out.println("Please type the name and the director of the movie you want to add.");

            }if (Option == 2) {
                System.out.println("Here are the contents of the array:");
                System.out.println(Arrays.toString(filmArray));
            }if (Option == 3) {

            }

        } while (Option !=3);


    }
}
