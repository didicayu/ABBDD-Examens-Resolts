//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MachineComposite mc = new MachineComposite();
        Machine m = new Machine();
        Machine m2 = new Machine();
        Machine m3 = new Machine();

        m2.setBroken();

        mc.addComponent(m);
        mc.addComponent(m2);
        mc.addComponent(m3);

        m2.repair();

        System.out.println(mc.isBroken());
    }
}