public class DestinationEx {
    private String name;
    private ActivityEx[] actList;

    public DestinationEx(String name, ActivityEx[] actList) {
        this.name = name;
        this.actList = actList;
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

    public void setActList(int num, ActivityEx activity) {
        this.actList[num] = activity;
    }
}
