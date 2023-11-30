package ma.enset.computer;


import ma.enset.adapters.HdmiVgaAdapterUsingComposition;
import ma.enset.adapters.HdmiVgaAdapterUsingInheritance;

public class Test {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale = new UniteCentrale();
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("Bonjour");
        uniteCentrale.setVga(new VideoProjector());
        uniteCentrale.print("Hello");

        //Using composition
        HdmiVgaAdapterUsingComposition hdmiVgaAdapterUsingComposition = new HdmiVgaAdapterUsingComposition();
        hdmiVgaAdapterUsingComposition.setHdmi(new TV());
        uniteCentrale.setVga(new HdmiVgaAdapterUsingComposition());
        hdmiVgaAdapterUsingComposition.print("HI");

        //Using Inheritance
        HdmiVgaAdapterUsingInheritance hdmiVgaAdapterUsingInheritance = new HdmiVgaAdapterUsingInheritance();
        uniteCentrale.setVga(hdmiVgaAdapterUsingInheritance);
        hdmiVgaAdapterUsingInheritance.print("HI");

        uniteCentrale.setVga(new SuperVP());
        uniteCentrale.print("DP");

        HdmiVgaAdapterUsingComposition hdmiVgaAdapterUsingComposition1 = new HdmiVgaAdapterUsingComposition();
        hdmiVgaAdapterUsingComposition1.setHdmi(new SuperVP());
        uniteCentrale.setVga(hdmiVgaAdapterUsingComposition1);
        uniteCentrale.print("Bonsoir");
    }

}
