package efood.com.mvp.Model;

/**
 * Created by loc on 14/04/2016.
 */
public class Counter {
    private int num;

    public Counter(int num) {
        this.num = num;
    }

    public Counter() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int Sumcouter() {
        return ++num;
    }
}
