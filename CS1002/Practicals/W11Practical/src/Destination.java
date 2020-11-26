public class Destination {
    private String name;
    private Activity[] actList;

    public Destination(String name, Activity[] actList) {
        this.name = name;
        this.actList = actList;
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

    public void setActList(int num, Activity activity) {
        this.actList[num] = activity;
    }
}
