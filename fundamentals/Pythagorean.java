public class Pythagorean{
    public double calculateHypotenuse(int legA, int legB) {
        Double hypotenuse = Math.sqrt(Math.pow(legA,2) + Math.pow(legB,2));
        return hypotenuse;
    }
}