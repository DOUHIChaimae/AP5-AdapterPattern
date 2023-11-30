package ma.enset.adapters;


import ma.enset.computer.TV;
import ma.enset.computer.VGA;

public class HdmiVgaAdapterUsingInheritance extends TV implements VGA {
    @Override
    public void print(String message) {
        System.out.println("~~~~~~~~~~~ Adapter ~~~~~~~~~~");
        byte[] data = message.getBytes();
        super.view(data);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
