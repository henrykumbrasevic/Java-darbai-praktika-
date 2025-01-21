public class MainProgram {

    public static void main(String[] args) {
       Employees t = new Employees();
       Person h1 = new Person("Arto", Education.PHD);
       t.add(h1);
       Person h2 = new Person("Pekka", Education.BA);
       t.add(h2);
       Person h3 = new Person("Matti", Education.PHD);
       t.add(h3);
        t.fire(Education.PHD);
        t.print();
    }
}
