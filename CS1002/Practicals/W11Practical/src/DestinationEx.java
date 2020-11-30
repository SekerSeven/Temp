public class DestinationEx {
    private String name;
    private ActivityEx[] actList;

    public DestinationEx(String name, int num) {
        this.name = name;
        actList = new ActivityEx[num];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActivityEx[] getActList() {
        return actList;
    }

    public ActivityEx getActivity(int num) {
        return actList[num];
    }

    public void setActivity(int num, ActivityEx activity) {
        this.actList[num] = activity;
    }
}
