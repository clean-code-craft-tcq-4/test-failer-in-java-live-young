public class AlertFailureTest {
		public static void testAlertFailure(NetworkAlertStub networkStub) {
			alerter.alertInCelcius(500.0f, networkStub);
			assert (alerter.alertFailureCount == 1);
			alerter.alertInCelcius(350.0f, networkStub);
			assert (alerter.alertFailureCount == 2);
		}
	}
