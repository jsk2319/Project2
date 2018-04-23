public class Film {
    String filmName;
    int filmYear;
    String directorName;

    public Film() {
        filmName = "";
        filmYear = 0;
        directorName = "";
    }
    public void setFilmName(String newFilmName) {
        filmName = newFilmName;

    }
    public String getFilmName() {
        return filmName;
    }
    public void setDirectorName(String newDirectorName) {
        directorName = newDirectorName;

    }
    public String getDirectorName() {
        return directorName;
    }
    public void setFilmYear(int newFilmYear) {
        if ((newFilmYear >= 1890) && (newFilmYear <= 2019)) {
            filmYear = newFilmYear;
        } else {
            System.out.println("Year isn't possible.");
        }
    }
    public int getFilmYear(Film f) {
        return filmYear;
    }

    public boolean equalsMethod(Object Film) {
        boolean equalsMethod = false;
        if(f.filmName){

        }
    }

}
