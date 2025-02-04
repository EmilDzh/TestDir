package lesson1.hw;

public class Main {
    public static void main(String[] args) {
        SmartLight smartLight = new SmartLight("1", "smartLight", true);
        SmartThermostat smartThermostat = new SmartThermostat("2", "smartThermostat", -1.0);

        smartLight.performAction();
        smartThermostat.performAction();

        smartThermostat.setTemperature(20.0);

        smartThermostat.performAction();

    }
}
