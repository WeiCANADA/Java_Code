package redListPractice1;

import java.util.ArrayList;

public class NormalOperMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> r = new ArrayList<>();
        for (int i = 0; i < totalCount - 1; i++) {
            r.add(totalMoney/totalCount);
        }
        int avg = totalMoney/totalCount;
        int mod = totalMoney%totalCount;
        r.add(avg + mod);
        return r;
    }
}
