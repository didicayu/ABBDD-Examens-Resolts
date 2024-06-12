public class Main {
    public static void main(String[] args) {
        Machine m1 = new Machine();
        Machine m2 = new Machine();
        Machine m3 = new Machine();
        MachineComposite mc = new MachineComposite();

        m1.setBroken();
        mc.addComponent(m1);
        mc.addComponent(m2);
        mc.addComponent(m3);

        System.out.println("La machine 1 esta rota? ===>"+m1.isBroken());
        System.out.println("La machine 2 esta rota? ===>"+m2.isBroken());
        System.out.println("La machine 3 esta rota? ===>"+m3.isBroken());
        System.out.println("La machine composite esta rota? ===>"+mc.isBroken());

        m1.repair();
        System.out.println("La machine 1 esta rota? ===>"+m1.isBroken());
        System.out.println("La machine 2 esta rota? ===>"+m2.isBroken());
        System.out.println("La machine 3 esta rota? ===>"+m3.isBroken());
        System.out.println("La machine composite esta rota? ===>"+mc.isBroken());

        m2.setBroken();
        System.out.println("La machine 1 esta rota? ===>"+m1.isBroken());
        System.out.println("La machine 2 esta rota? ===>"+m2.isBroken());
        System.out.println("La machine 3 esta rota? ===>"+m3.isBroken());
        System.out.println("La machine composite esta rota? ===>"+mc.isBroken());
    }
}