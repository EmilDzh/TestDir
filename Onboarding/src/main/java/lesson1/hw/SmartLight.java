package lesson1.hw;

public class SmartLight extends IoTDevice{

    private boolean isOn;


    public SmartLight(String id, String name, boolean isOn) {
        super(id, name);
        this.isOn = isOn;
    }

    @Override
    public void performAction() {
        if (isOn)
            System.out.println("Light " + getName() + " is ON");
        else
            System.out.println("Light " + getName() + " is OFF");
    }
}
