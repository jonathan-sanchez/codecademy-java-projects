public class Mayan extends Language {
	
	Mayan (String languageName, int speakers) {

		super(languageName, speakers, "Central America", "verb-object-subject");

	}

	@Override
	public void getInfo(){

		System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + " people mainly in " + this.regionsSpoken + ".");

		System.out.println("The language follows the word order: " + this.wordOrder);
		
		System.out.println("Fun facts: " + this.name + " is an ergative language.");
	}
	
}
