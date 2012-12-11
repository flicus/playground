/**
 * Created with IntelliJ IDEA.
 * User: flicus
 * Date: 11.12.12
 * Time: 23:51
 * To change this template use File | Settings | File Templates.
 */
public class MainEntry {
    private static final int magic = 0x22;

    private int val;

    public MainEntry() {
        val = 0;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
