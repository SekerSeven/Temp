public class Destination {
    private String name;
    private Activity[] actList;

    public Destination(String name, int num) {
        this.name = name;
        actList = new Activity[num];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Activity[] getActList() {
        return actList;
    }

    public Activity getActivity(int num) {
        return actList[num];
    }

    public void setActivity(int num, Activity activity) {
        this.actList[num] = activity;
    }
}
