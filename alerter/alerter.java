public class alerter {
    static int alertFailureCount = 0;
    static void alertInCelcius(float farenheit ) {
        float celcius = (farenheit - 32) * 5 / 9;
        int returnCode = alertStub.sendRequset(celcius);
        if (returnCode != 200) {
            // non-ok response is not an error! Issues happen in life!
            // let us keep a count of failures to report
            // However, this code doesn't count failures!
            // Add a test below to catch this bug. Alter the stub above, if needed.
            alertFailureCount += 1;
        }
    }
    public static void main(String[] args) {
        IAlerter alertStub = new NetworkAlertStub();
    	alertInCelcius(400.5f);
        assert(alertFailureCount ==1);
        alertInCelcius(303.6f);
        assert(alertFailureCount == 1);
        alertInCelcius(30.5f);
        assert(alertFailureCount ==1);
        alertInCelcius(1000.5f);
        assert(alertFailureCount == 2);
        alertInCelcius(-100.5f);
        assert(alertFailureCount ==2);
        alertInCelcius(105f);
        assert(alertFailureCount ==2);
        System.out.printf("%d alerts failed.\n", alertFailureCount);
        System.out.println("All is well (maybe!)\n");
    }
}
