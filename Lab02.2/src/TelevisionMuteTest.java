class TelevisionMuteTest {
    public static void main(String[] args) {
        Television tv = new Television("Samsung", 32);
        System.out.println(tv);

        tv.mute();
        System.out.println(tv);
        System.out.println()
        ;
        tv.mute();
        System.out.println(tv);

        tv.mute();
        System.out.println(tv);

        tv.setVolume(50);
        System.out.println(tv);
    }

}