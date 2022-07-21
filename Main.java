public class Main {
    public static void main(String[] args) {

        Emplyee e1 = new Emplyee("elad","Gueta",15000,50,208200444);
        Emplyee e2 = new Emplyee("daniel","galipapa", 1200,600,31856987);
        Emplyee e3 = new Emplyee("hodi","hoodifa",52000,140,659745821);


        e1.riseUpSalary();
        e2.changeFloor(150);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

    }

}
