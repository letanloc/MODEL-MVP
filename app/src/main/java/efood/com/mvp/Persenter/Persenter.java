package efood.com.mvp.Persenter;

/**
 * Created by loc on 14/04/2016.
 */
// nhan gia tri view vao
public interface Persenter<T> {
    // thuc hien  goi view
    void setView(T v);
}
