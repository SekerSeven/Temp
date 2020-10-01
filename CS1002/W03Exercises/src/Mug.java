public class Mug {
    // Calculates the area in centimetres squared of a circle of given integer
    // radius in centimetres.
    public double calcSA(int mugRadius) {
        return 3.14 * mugRadius * mugRadius;
    }

    // Calculates the volume in litres of a cylinder of given integers height and
    // radius both in centimetres.
    public double calcVol(int mugHeight, int mugRadius) {
        return calcSA(mugRadius) * mugHeight / 1000;
    }

    public boolean putMarshmallows(int noOfMarshmallows, double marshmallowLimit) {
        return noOfMarshmallows < marshmallowLimit;
    }
}
