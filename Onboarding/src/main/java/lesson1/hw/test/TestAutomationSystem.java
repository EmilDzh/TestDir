package lesson1.hw.test;

public class TestAutomationSystem {
    public static void main(String[] args) {

        TestScenario [] testScenarios = new TestScenario[3];

        testScenarios[0] = new LoginTest();
        testScenarios[1] = new PaymentTest();
        testScenarios[2] = new ProductSearchTest();

        for (TestScenario t : testScenarios){
            t.runTest();
        }
    }
}
