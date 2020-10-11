public class ConverterEx {
    public double weightKG;
    public int weightKGRound;
    public String output = "";

    public void convert(int weightSto, int weightPou, int weightOun) {
        if (weightSto < 0 || weightPou < 0 || weightOun < 0 || (weightSto == 0 && weightPou == 0 && weightOun == 0)) {
            System.out.println("Invalid input!");
        } else {
            if (weightSto == 1) {
                output += (weightSto + " stone,");
            } else {
                output += (weightSto + " stones,");
            }
            if (weightPou == 1) {
                output += (weightPou + " pound");
            } else {
                output += (weightPou + " pounds");
            }
            if (weightOun == 1) {
                output += (" and " + weightOun + " ounce");
            } else {
                output += (" and " + weightOun + " ounces");
            }
            output += (" in kilograms is (roughly):");
            System.out.println(output);
            weightKG += weightOun / 35.274;
            weightKG += weightPou * 16 / 35.274;
            weightKG += weightSto * 16 * 14 / 35.274;
            weightKGRound = (int) Math.round(weightKG);
        }

    }

    public void print() {
        if (weightKGRound == 1) {
            System.out.println(weightKGRound + " kilogram");
        } else {
            System.out.println(weightKGRound + " kilograms");
        }
    }
}