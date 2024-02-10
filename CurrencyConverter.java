public class CurrencyConverter{
	int rupee = 63;
	int dirham = 3;
	int real = 3;
	int chilean_peso = 595;
	int mexican_peso = 18;
	int _yen = 107;
	int $australian = 2;
	int dollar;
	int Rupee = 63;

	double[] exchangeRate = new double[]{63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0};
	
	void setExchangeRate(double[] rates) {
	exchangeRate = rates;
	}
	
	//updating array value
	void updateExchangeRate(int countryIndex, double newVal) {
	exchangeRate[countryIndex] = newVal;
	}

	//get array value
	double getExchangeRate(int countryIndex) {
		return exchangeRate[countryIndex];
	}
	
	public double computeTransferAmount(int countryIndex, double amount){
	return amount * getExchangeRate(countryIndex);
	}
	// primitive type values
	//int minValue = Integer.MIN_VALUE;
	//int maxValue = Integer.MAX_VALUE;

	void printCurrencies(){
	
	System.out.println("\nrupee " + exchangeRate[0]);
	System.out.println("dirham " + exchangeRate[1]);
	System.out.println("real " + exchangeRate[2]);
	System.out.println("chilean peso " + exchangeRate[3]);
	System.out.println("mexican peso " + exchangeRate[4]);
	System.out.println("yen " + exchangeRate[5]);
	System.out.println("australian " + exchangeRate[exchangeRate.length-1]);
	
    }

	public static void main(String[] args){
	CurrencyConverter cc = new CurrencyConverter();
		
	double[] rates = {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0};

	cc.setExchangeRate(rates);
	
	cc.printCurrencies();

	rates = new double[]{66.0, 8.0, 3.0, 601.0, 18.0, 107.0, 2.0};

	cc.setExchangeRate(rates);

	cc.printCurrencies();

	cc.updateExchangeRate(0, 69.0);
	
	cc.printCurrencies();
	
    }
}