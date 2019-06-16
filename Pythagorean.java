public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {

        legA = 4;
        legB = 5;

        double legATotal = Math.pow(legA, 2);
        double legBTotal = Math.pow(legB, 2);

        double calculateHypotenuse = Math.sqrt(legATotal + legBTotal);

        return calculateHypotenuse;

        /*
         * something to establish value for legA and legB something to square the values
         * of legA and legB something to add up the squared sides of legA and legB
         * something to square root that sum to equal c
         * 
         * the hypotenuse is the side across the right angle. calculate the value of c
         * given legA and legB
         */

    }
}
