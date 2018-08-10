package LeetCode;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int min = cost[0], index= 0;

        for(int i=0;i<cost.length;i++) {
            if(cost[i]<min) {
                min = cost[i];
                index = i;
            }
        }

        int tank = gas[index];

        for(int i=index+1;i<gas.length;i++) {
            if(i == index) {
                tank = tank - cost[i] + gas[i];
                break;
            }
            tank = tank - cost[i] + gas[i];

        }
        if(tank > 0)
            return index;

        return -1;
    }

    public static void main(String args[]) {
    int gas[] = {3,3,4};
    int cost[] = {3,4,4};

        System.out.println(canCompleteCircuit(gas,cost));
    }
}
