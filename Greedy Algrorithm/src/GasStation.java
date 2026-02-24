public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int tank = 0;
        int start = 0;
        for(int i=0; i<gas.length; i++){
            int diff = gas[i] - cost[i];
            total += diff;
            tank += diff;
            if(tank < 0){
                start = i + 1;
                tank = 0;
            }
        }
        if(total < 0) {
            return -1;
        }
        return start;
    }
    public static void main(String[] args) {
        GasStation solution = new GasStation();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int result = solution.canCompleteCircuit(gas, cost);
        System.out.println(result); // Output: 3
    }
}
