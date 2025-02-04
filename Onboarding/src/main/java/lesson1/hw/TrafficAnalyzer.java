package lesson1.hw;

public class TrafficAnalyzer {
    public static void main(String[] args) {

        int[] traffic = new int[]{100, 200, 300, 400, 500, 600};

        System.out.println(getMaxTraffic(traffic));

    }

    public static int getMaxTraffic(int[] traffics) {

        int maxTraffic = 0;

        for (int i = 0; i < traffics.length; i++) {

            if (maxTraffic < traffics[i]) {

                maxTraffic = traffics[i];
            }
        }
        return maxTraffic;
    }
}
