public class PythogoreanTest {
    public static void main(String[] args) {
        Pythagorean hypo = new Pythagorean();
        Double hypotenuse = hypo.calculateHypotenuse(3,4);
        System.out.println("The hypotenuse is " + hypotenuse);
    }
}