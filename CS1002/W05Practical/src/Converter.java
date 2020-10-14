public class Converter {
    public int weightSto;
    public int weightPou;
    public double weightOun;
    public int weightOunRound;

    // Prints an error message if an integer less than 1 is inputted. Otherwise it
    // calculates the weight in stone, pounds and ounces of the integer number of
    // kilograms entered.
    public void convert(int weightKG) {
        if (weightKG < 1) {
            System.out.println("Invalid input!");
        } else if (weightKG == 1) {
            System.out.println(weightKG + " kilogram in stones, pounds and ounces is:\n2 pounds and 3 ounces");
        } else {
            weightOun = weightKG * 35.274;
            weightSto = (int) Math.floor(weightOun / 14 / 16);
            weightOun -= weightSto * 14 * 16;
            weightPou = (int) Math.floor(weightOun / 16);
            weightOun -= weightPou * 16;
            weightOunRound = (int) Math.round(weightOun);
            System.out.println(weightKG + " kilograms in stones, pounds and ounces is:");
        }
    }

    // This string is used to create a nicely formatted output for the weight in
    // stone, pounds and ounces by having specific strings concatenated with this
    // one depending on the quantities of stone, pounds and ounces returned.
    public String output = "";

    // Concatenates certain strings with the output string to create and print an
    // output containing the weight in stone, pounds and ounces of the weight in kg
    // that was inputted.
    public void print() {
        if (weightSto == 0) {
        } else if (weightSto == 1) {
            output += (weightSto + " stone, ");
        } else {
            output += (weightSto + " stones, ");
        }
        if (weightPou == 0) {
        } else if (weightPou == 1) {
            output += (weightPou + " pound");
        } else {
            output += (weightPou + " pounds");
        }
        if (weightOunRound == 0) {
        } else if (weightOunRound == 1) {
            output += (" and " + weightOunRound + " ounce");
        } else {
            output += (" and " + weightOunRound + " ounces");
        }
        System.out.println(output);
    }
}