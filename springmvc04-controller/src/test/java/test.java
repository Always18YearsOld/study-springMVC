import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ：ltb
 * @date ：2020/7/19
 */
public class test {


    public static void main(String[] args) {
        circleCount(7);
    }

    public static void circleCount(int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        int cnt = 1;
        while (list.size() >= num) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int t = it.next();
                if (cnt == num) {
                    it.remove();
                    cnt = 0;
                }
                cnt++;
            }
        }
        StringBuilder res = new StringBuilder();
        for (Integer n : list) {
            res.append(n).append(" ");
        }
        System.out.println(res.toString());
    }
}
