class TelevisonValidationTest {

    public static void main(String[] args) {

        // Constructor validation
        System.out.println();
        System.out.println("CONSTRUCTOR TEST");
        System.out.println("----------------");
        System.out.println();
        Television tv = new Television("Samsung", -1, DisplayType.PLASMA);
        System.out.println();
        tv.setVolume(3);
        System.out.println("[" + "Brand set to: " + tv.getBrand() + "]");
        System.out.println("[" + "Volume set to: " + tv.getVolume() + "]");
        System.out.println();
        System.out.println(tv);
        System.out.println();

        // Volume validation: 1
        System.out.println();
        System.out.println("VOLUME TEST: 1");
        System.out.println("--------------");
        System.out.println();
        tv.setVolume(1);
        System.out.println("[" + "Volume set to: " + tv.getVolume() + "]");
        System.out.println();
        tv.setDisplay(DisplayType.OLED);
        System.out.println(tv);
        System.out.println();


        // Volume validation: 2
        System.out.println();
        System.out.println("VOLUME TEST: 2");
        System.out.println("--------------");
        System.out.println();
        tv.setVolume(-1);
        System.out.println();
        System.out.println("[" + "Volume set to: " + tv.getVolume() + "]");
        System.out.println();
        tv.setDisplay(DisplayType.CRT);
        System.out.println(tv);
        System.out.println();

        // Volume validation: 3
        System.out.println();
        System.out.println("VOLUME TEST: 3");
        System.out.println("--------------");
        System.out.println();
        tv.setVolume(-1);
        tv.setVolume(101);
        System.out.println();
        System.out.println("[" + "Volume set to: " + tv.getVolume() + "]");
        System.out.println();
        System.out.println(tv);
        System.out.println();

        // Volume validation: 4
        System.out.println();
        System.out.println("VOLUME TEST: 4");
        System.out.println("--------------");
        System.out.println();
        tv.setVolume(3);
        System.out.println("[" + "Volume set to: " + tv.getVolume() + "]");
        System.out.println();
        tv.setVolume(100);
        System.out.println("[" + "Volume set to: " + tv.getVolume() + "]");
        System.out.println();
        tv.setDisplay(DisplayType.CRT);
        System.out.println(tv);
        System.out.println();

        // Brand validation: 1
        System.out.println();
        System.out.println("BRAND TEST: 1");
        System.out.println("-------------");
        System.out.println();
        tv.setBrand("Samsung");
        System.out.println("[" + "Brand set to: " + tv.getBrand() + "]");
        System.out.println();
        System.out.println(tv);
        System.out.println();

        // Brand validation: 2
        System.out.println();
        System.out.println("BRAND TEST: 2");
        System.out.println("-------------");
        System.out.println();
        tv.setBrand("LG");
        System.out.println("[" + "Brand set to: " + tv.getBrand() + "]");
        System.out.println();
        tv.setDisplay(DisplayType.OLED);
        System.out.println(tv);
        System.out.println();

        // Brand validation: 3
        System.out.println();
        System.out.println("BRAND TEST: 3");
        System.out.println("-------------");
        System.out.println();
        tv.setBrand("Sony");
        System.out.println("[" + "Brand set to: " + tv.getBrand() + "]");
        System.out.println();
        System.out.println(tv);
        System.out.println();

        // Brand validation: 4
        System.out.println();
        System.out.println("BRAND TEST: 4");
        System.out.println("-------------");
        System.out.println();
        tv.setBrand("Panasonic");
        System.out.println();
        System.out.println("[" + "Brand set to: " + tv.getBrand() + "]");
        System.out.println();
        tv.setDisplay(DisplayType.LED);
        System.out.println(tv);
        System.out.println();

        // Brand validation: 5
        System.out.println();
        System.out.println("BRAND TEST: 5");
        System.out.println("-------------");
        System.out.println();
        tv.setBrand("INVALID");
        System.out.println();
        System.out.println("[" + "Brand set to: " + tv.getBrand() + "]");
        System.out.println();
        tv.setDisplay(DisplayType.LED);
        System.out.println(tv);
        System.out.println();
    }
}