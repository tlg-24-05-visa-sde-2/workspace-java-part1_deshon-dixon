class Movie {
    // fields or instance variables
    private String title;
    private int releaseYear;
    private double revenue;

    // accessor methods - provide "controlled" access to the object's (private) fields
    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public String toString() {
        return "Movie: " +
                "title= " + getTitle() +
                ", releaseYear= " + getReleaseYear() +
                ", revenue= $" + getRevenue();
    }

    public Movie(String title, int releaseYear, double revenue) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.revenue = revenue;
    }

    public Movie() {
    }
}