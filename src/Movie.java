public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating="PG";
    }

//    @Override
//    public String toString() {
//        return "Movie{" +
//                "title='" + title + '\'' +
//                ", studio='" + studio + '\'' +
//                ", rating='" + rating + '\'' +
//                '}';
//    }

    public Movie[] getPG(Movie [] movies){
        int maxValue=movies.length;
        Movie[] resultMovie= new Movie[maxValue];
        int j=0;
        for(int i=0;i<movies.length;i++){
            if(movies[i].rating.equals("PG")) {
                resultMovie[j] = movies[i];
                j++;
            }
        }
        return resultMovie;
    }
    public static void main(String[] args) {
        Movie movie=new Movie("Casino Royale","Eon Productions","PG-13");



//        Movie movie2=new Movie("Casino Royale1","Eon Productions","PG");
//        Movie movie3=new Movie("Casino Royale2","Eon Productions","R");
//        Movie[] movies={movie,movie3,movie2};
//        Movie[] result=movie.getPG(movies);
//        System.out.println(result[0]);

    }
}
