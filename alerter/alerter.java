public class alerter {
    static int alertFailureCount = 0;
    static void alertInCelcius(float farenheit, NetworkAlertStub networkStub ) {
        float celcius = (farenheit - 32) * 5 / 9;
        int returnCode = networkStub.networkAlertStub(celcius);
        if (returnCode != 200) {
            // non-ok response is not an error! Issues happen in life!
            // let us keep a count of failures to report
            // However, this code doesn't count failures!
            // Add a test below to catch this bug. Alter the stub above, if needed.
            alertFailureCount += 0;
        }
    }
    public static void main(String[] args) {
    	NetworkAlertStub networkStub = new NetworkAlertStub();
        alertInCelcius(500.5f, networkStub );
        alertInCelcius(203.6f, networkStub);
        AlertFailureTest.testAlertFailure(networkStub);
        System.out.printf("%d alerts failed.\n", alertFailureCount);
        System.out.println("All is well (maybe!)\n");
    }
}
