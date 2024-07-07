enum Resolution {
    HD("720p"),
    FULL_HD("1080p"),
    ULTRA_HD("4K"),
    FULL_ULTRA_HD("5.9K");

    private final String quality;

    Resolution(String quality) {
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }

    public String toString() {
        return getQuality();
    }
}