class Language {

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
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". The Language follows the word order: " + wordOrder);
    }
    
    public static void main(String[] args) {
        Language spanish = new Language("spanish", 1000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");

        spanish.getInfo();

        Mayan chuj = new Mayan("chuj", 61630);

        chuj.getInfo();

        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        mandarin.getInfo();

        SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
        burmese.getInfo();

    }
}
