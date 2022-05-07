public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String langName, int speakers, String regions, String wrdOrder) {
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wrdOrder;
    }

    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " regionsSpoken + ". The Language follows the word order: " + wordOrder);
    }
    
    public static void main(String[] args) {
        Language spanish = new Language();

    }
}
