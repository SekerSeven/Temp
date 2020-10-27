public class ConverterEx {
    public double weightKG;
    public int weightKGRound;
    public String output = "";

    // Converts the weight entered in stone, pounds and ounces into an integer
    // weight in kilograms unless the input is outside the acceptable range, in
    // which case it prints an error message. It also formats and outputs the
    // request back to the user accounting for the plurality of the inputs.
    public void convert(int weightSto, int weightPou, int weightOun) {
        if (weightSto < 0 || weightPou < 0 || weightOun < 0 || (weightSto == 0 && weightPou == 0 && weightOun == 0)) {
            System.out.println("Invalid input!");
        } else {
            if (weightSto == 0) {
            } else if (weightSto == 1) {
                output += (weightSto + " stone, ");
            } else {
                output += (weightSto + " stones, ");
            }
            if (weightPou == 0) {
            } else if (weightPou == 1) {
                output += (weightPou + " pound ");
            } else {
                output += (weightPou + " pounds ");
            }
            if (weightOun == 0) {
            } else if (weightOun == 1) {
                output += ("and " + weightOun + " ounce ");
            } else {
                output += ("and " + weightOun + " ounces ");
            }
            output += ("in kilograms is (roughly):");
            System.out.println(output);
            weightKG += weightOun / 35.274;
            weightKG += weightPou * 16 / 35.274;
            weightKG += weightSto * 16 * 14 / 35.274;
            weightKGRound = (int) Math.round(weightKG);
        }

    }

    // Outputs the calculated weight in kilograms with appropriate formatting
    // depending on the number of kilograms.
    public void print() {
        if (weightKGRound == 1) {
            System.out.println(weightKGRound + " kilogram");
        } else if (weightKGRound > 1) {
            System.out.println(weightKGRound + " kilograms");
        } else {
        }
    }
}