import java.util.Arrays;

public class SentimentAnalyzer {
    // Tip: labeled continue can be used when iterating featureSet + convert review to lower-case
	public static int[] detectProsAndCons(String review, String[][] featureSet, String[] posOpinionWords,
			String[] negOpinionWords) {
		int[] featureOpinions = new int[featureSet.length]; // output
    review = review.toLowerCase();
    nextFeature: for(int i = 0; i <featureSet.length; i++){
        String[] features = featureSet[i];
        for(String feature : features){
            if(review.contains(feature)){
                int opinion = getOpinionOnFeature(review, feature, posOpinionWords, negOpinionWords);
                if(opinion != 0){
                    //opinion found. Record opinon and move on to next feature.
                    featureOpinions[i] = opinion;
                    continue nextFeature;
                }
            }
        }
    }
        // your code ~ you will be invoking getOpinionOnFeature		
		return featureOpinions;
	}

	// First invoke checkForWasPhrasePattern and 
	// if it cannot find an opinion only then invoke checkForOpinionFirstPattern
	private static int getOpinionOnFeature(String review, String feature, String[] posOpinionWords, String[] negOpinionWords) {
		
        int opinion = checkForWasPhrasePattern(review, feature, posOpinionWords, negOpinionWords);

        if(opinion == 0){
            opinion = checkForOpinionFirstPattern(review, feature, posOpinionWords, negOpinionWords);
        }
        return opinion;
		// your code
		
	}	

	// Tip: Look at String API doc. Methods like indexOf, length, substring(beginIndex), startsWith can come into play
	// Return 1 if positive opinion found, -1 for negative opinion, 0 for no opinion
	// You can first look for positive opinion. If not found, only then you can look for negative opinion
	private static int checkForWasPhrasePattern(String review, String feature, String[] posOpinionWords, String[] negOpinionWords) {
		int opinion = 0;
		String pattern = feature + " was ";
        int index = review.indexOf(pattern);
        //while loop is used instead of if-statement to account for appearance
        //of pattern in more than one location. See last statement of while loop
        while(index >= 0){
            String patternSuffix = review.substring(index + pattern.length());

            for(String opinionWord : posOpinionWords){
                if(patternSuffix.startsWith(opinionWord)){
                    return 1;
                }
            }
            for(String opinionWord : negOpinionWords) {
                if(patternSuffix.startsWith(opinionWord)){
                    return -1;
                }
            }
            index = patternSuffix.indexOf(pattern);
            review = patternSuffix;
        }
		// your code
		return opinion; 	
	}
	
	// You can first look for positive opinion. If not found, only then you can look for negative opinion
	private static int checkForOpinionFirstPattern(String review, String feature, String[] posOpinionWords,
			String[] negOpinionWords) {
		// Extract sentences as feature might appear multiple times. 
		// split() takes a regular expression and "." is a special character 
		// for regular expression. So, escape it to make it work!!
		String[] sentences = review.split("\\.");
		int opinion = 0;
		for(String sentence : sentences){
            int index = sentence.indexOf(feature);

            if(index > 0){
                String patternPrefix = sentence.substring(0, index).trim();

                for(String opinionWord : posOpinionWords){
                    if(patternPrefix.endsWith(opinionWord)){
                        return 1;
                    }
                }
                for(String opinionWord : negOpinionWords){
                    if(patternPrefix.endsWith(opinionWord)){
                        return -1;
                    }
                }
            }
        }
		// your code for processing each sentence. You can return if opinion is found in a sentence (no need to process subsequent ones)		

		return 0;
	}

	public static void main(String[] args) {
		String review = "Haven't been here in years! Fantastic service and the food was delicious! Definetly will be a frequent flyer! Francisco was very attentive";
		
		//String review = "Sorry OG, but you just lost some loyal customers. Horrible service, no smile or greeting just attitude. The breadsticks were stale and burnt, appetizer was cold and the food came out before the salad.";
		
		String[][] featureSet = { 
		        { "ambiance", "ambience", "atmosphere", "decor" },
				{ "dessert", "ice cream", "desert" }, 
				{ "food" }, 
				{ "soup" },
				{ "service", "management", "waiter", "waitress", "bartender", "staff", "server" } };
		String[] posOpinionWords = { "good", "fantastic", "friendly", "great", "excellent", "amazing", "awesome",
				"delicious" };
		String[] negOpinionWords = { "slow", "bad", "horrible", "awful", "unprofessional", "poor" };

		int[] featureOpinions = detectProsAndCons(review, featureSet, posOpinionWords, negOpinionWords);
		System.out.println("Opinions on Features: " + Arrays.toString(featureOpinions));
	}
}
