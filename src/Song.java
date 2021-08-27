public class Song {
    public static void main(String[] args) {

        String openingLyrics = "Hey Jude, dont make it bad";

        System.out.println(openingLyrics);

        String line1 = "Nah nah nah nah nah nah nah nah yeah";
        String line2 = "Nah nah nah nah nah, nah nah nah, hey Jude";
        String line3 = "Nah nah nah nah nah, nah nah nah, hey Jude";

        System.out.println(line1.equals(line2));
        System.out.println(line2.equals(line3));
    }
}
