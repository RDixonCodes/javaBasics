public class IRUtil {
    
    public static int getFrequencyCount(String term, String doc){
        term = term.toLowerCase();
        doc = doc.toLowerCase();
        int frequencyCount = 0;
        int index = doc.indexOf(term);
        
        if(index >= 0){
            frequencyCount++;
            doc = doc.substring(index + term.length());
            index = doc.indexOf(term);
        } 
        // System.out.println(doc.substring(index, doc.length()));
        // System.out.println("t: " + term + "\ndoc: " + doc);
        // System.out.println("\nfrequency count: " + frequencyCount);
        return frequencyCount;
    }

    //second version

    // public static int getFrequencyCountV2(String term, String doc){
    //     term = term.toLowerCase();
    //     doc = doc.toLowerCase();

    //     int frequencyCount = 0;
    //     int termLength = term.length();

    //     int index = doc.indexOf(term);

    //     while(index >= 0){
    //         ++frequencyCount;
    //         index = doc.indexOf(term, index + termLength);
    //     }
    //     return frequencyCount;
    // }

    public static double termFrequency(String term, String doc){
        int frequencyCount = getFrequencyCount(term, doc);
        int totalTermCount = doc.split(" ").length;

        System.out.println("\nFinding term frequency for " + term);
        System.out.println(frequencyCount);
        System.out.println(totalTermCount);
        return (double) frequencyCount/totalTermCount;
    }

    public static void main(String[] args){

		String doc = "Every time there is a new COVID wave, a few medicines become popular. The desperation to save family members or avoid severe forms of the infection makes hapless people opt for the ‘promising’ drugs. Currently, people are made aware of one such drug called ‘Monoclonal Antibodies Cocktail’, which costs around ₹60,000. However, several doctors from Telangana have underscored that the antibodies cocktail, available in India, are not effective against the Omicron variant. They have also stressed that 93% to 95% of the current COVID cases are of Omicron variant. Even if it is Delta variant, the drug cocktail has to be given within seven days of onset of the infection, and it is ineffective if the patient is in a severe stage of infection. Doctors said Remdesivir is suggested for patients with Omicron, after examining infection severity, presence of co-morbidities, immunity levels, and other factors.";

        System.out.println(termFrequency("infection", doc));
		System.out.println(termFrequency("covid", doc));
    
    }
}
