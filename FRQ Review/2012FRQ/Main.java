public class Main {
    public static void main(String[] args) {
        Horse johnHorse = new Horse("john", 360);
        Horse bonHorse = new Horse("bon", 9);
        Horse gonHorse = new Horse("gon", 3231);
        Horse bronHorse = new Horse("leProperJames", 31244);
        HorseBarn dahome = new HorseBarn(7);
        dahome.setSpace(0, gonHorse);
        dahome.setSpace(2, johnHorse);
        dahome.setSpace(3, bronHorse);
        dahome.setSpace(6, bonHorse);
        // Proof Of Concept
        System.out.println(dahome.findHorseSpace("gon"));
        System.out.println(dahome.findHorseSpace("john"));
        System.out.println(dahome.findHorseSpace("leProperJames"));
        System.out.println(dahome.findHorseSpace("bon"));
        dahome.consolidate();
        System.out.println(dahome.findHorseSpace("gon"));
        System.out.println(dahome.findHorseSpace("john"));
        System.out.println(dahome.findHorseSpace("leProperJames"));
        System.out.println(dahome.findHorseSpace("bon"));
    }
}
