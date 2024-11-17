public class GasStation {

    public static void main(String[] args) {
        int[] gas = { 1, 2, 3, 4, 5 };
        int[] cost = { 3, 4, 5, 1, 2 };
        System.out.println(canCompleteCircuit(gas, cost));
    }

    static public int canCompleteCircuit(int[] gas, int[] cost) {

        int sum = 0;
        int n = gas.length;
        for (int i = 0; i < n; i++)
            sum += gas[i] - cost[i];
        if (sum < 0)
            return -1;

        int diff = 0;
        int ret = 0;
        for (int i = 0; i < n; i++) {
            if (diff < 0) {
                diff = 0;
                ret = i;
            }
            diff += gas[i] - cost[i];
        }

        return ret;
    }

}
