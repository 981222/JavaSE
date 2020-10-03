public class User {
    int num;
    String huang;
    double jing;
    long song;

    public User() {
    }

    public User(int num, String huang, double jing, long song) {
        this.num = num;
        this.huang = huang;
        this.jing = jing;
        this.song = song;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getHuang() {
        return huang;
    }

    public void setHuang(String huang) {
        this.huang = huang;
    }

    public double getJing() {
        return jing;
    }

    public void setJing(double jing) {
        this.jing = jing;
    }

    public long getSong() {
        return song;
    }

    public void setSong(long song) {
        this.song = song;
    }
}
