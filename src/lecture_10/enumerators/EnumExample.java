package lecture_10.enumerators;

public class EnumExample {
    public static void main(String[] args) {
        Season currentSeason = Season.WINTER;
        System.out.println("Current season: " + currentSeason);
        System.out.println("Ordinal value: " + currentSeason.ordinal());


        printSession(null);
        printSession(Season.WINTER);
        printSession(Season.SPRING);
        printSession(Season.SUMMER);
        printSession(Season.AUTUMN);
    }

    public static void printSession(Season season) {
        System.out.println("Current season: " + season);

        if (season == Season.SPRING) {
            System.out.println("Spring is a beautiful season with blooming flowers.");
        } else if (season == Season.SUMMER) {
            System.out.println("Summer is hot and perfect for beach vacations.");
        } else if (season == Season.AUTUMN) {
            System.out.println("Autumn is known for its colorful leaves.");
        } else if (season == Season.WINTER) {
            System.out.println("Winter is cold and often associated with snow.");
        }
    }
}
