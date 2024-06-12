
public class Main {
    public static void main(String[] args) {
        // Create individual machine components
        Machine machine1 = new Machine();
        Machine machine2 = new Machine();

        // Create a machine composite
        MachineComposite composite = new MachineComposite();

        // Add machine components to the composite
        composite.addComponent(machine1);
        composite.addComponent(machine2);

        // Print initial states
        System.out.println("Initial state of machine1: " + (machine1.isBroken() ? "Broken" : "Working"));
        System.out.println("Initial state of machine2: " + (machine2.isBroken() ? "Broken" : "Working"));
        System.out.println("Initial state of composite: " + (composite.isBroken() ? "Broken" : "Working"));

        // Break machine1 and see the composite state change
        machine1.setBroken();
        System.out.println("After breaking machine1:");
        System.out.println("State of machine1: " + (machine1.isBroken() ? "Broken" : "Working"));
        System.out.println("State of composite: " + (composite.isBroken() ? "Broken" : "Working"));

        // Repair machine1 and break machine2 to see the composite state change
        machine1.repair();
        machine2.setBroken();
        System.out.println("After repairing machine1 and breaking machine2:");
        System.out.println("State of machine1: " + (machine1.isBroken() ? "Broken" : "Working"));
        System.out.println("State of machine2: " + (machine2.isBroken() ? "Broken" : "Working"));
        System.out.println("State of composite: " + (composite.isBroken() ? "Broken" : "Working"));

        // Repair machine2 to see the composite state change
        machine2.repair();
        System.out.println("After repairing machine2:");
        System.out.println("State of machine2: " + (machine2.isBroken() ? "Broken" : "Working"));
        System.out.println("State of composite: " + (composite.isBroken() ? "Broken" : "Working"));
    }
}
