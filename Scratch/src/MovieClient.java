class MovieClient {

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        System.out.println(movie1);
        System.out.println();

        Movie movie2 = new Movie("Dune", 2021, 407_000_000.0);
        System.out.println(movie2);  // toString() automatically called
        System.out.println();

        Movie movie3 = new Movie("Finding Nemo", 2003, 940_000_000.0);
        System.out.println(movie3);  // toString() automatically called
        System.out.println();
    }
}