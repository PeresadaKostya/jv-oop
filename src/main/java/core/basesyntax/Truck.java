package core.basesyntax;

class Truck extends Machine{
    @Override
    public void doWork() {
        System.out.println("Truck started work");
    }

    @Override
    public void stopwork() {
        System.out.println("Truck stopped work");
    }
}
