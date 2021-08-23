public class MadLibs {
    /*
    This program generates a mad libbed story.
        Author: Jonathan
        Date: 5/11/2021
    */
    public static void main(String[] args) {
        //Main Character
        String name1 = "Jonathan";
        //Second Character
        String name2 = "Hannah";
        //Three Adjectives
        String adjective1 = "grumpy";
        String adjective2 = "swampy";
        String adjective3 = "scary";
        //One Verb
        String verb1 = "create";
        //Six Nouns
        String noun1 = "art";
        String noun2 = "information";
        String noun3 = "computer";
        String noun4 = "method";
        String noun5 = "data";
        String noun6 = "software";
        //One Number
        int number = 7;
        //Add a Place
        String place1 = "Colorado";

        //This template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
        System.out.println(story);
    }
}
