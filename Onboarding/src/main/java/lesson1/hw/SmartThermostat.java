package lesson1.hw;

public class SmartThermostat extends IoTDevice{

    private double  temperature;


    public SmartThermostat(String id, String name, double  temperature ) {
        super(id, name);
        this.temperature = 5.0;
    }

    @Override
    public void performAction() {
        System.out.println("Thermostat " + getName() + " is set to " + temperature + "°C");
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
