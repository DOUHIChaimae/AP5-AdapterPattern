package ma.enset.adapters;


import ma.enset.computer.HDMI;
import ma.enset.computer.VGA;

public class HdmiVgaAdapterUsingComposition implements VGA {
    private HDMI hdmi;

    @Override
    public void print(String message) {
        System.out.println("~~~~~~~~~~~ Adapter ~~~~~~~~~~");
        byte[] data = message.getBytes();
        hdmi.view(data);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
