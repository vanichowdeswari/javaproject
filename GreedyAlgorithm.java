package chowdeswari.com;

class Transport {
    String mode;
    int time;
    int cost;

    public Transport(String mode, int time, int cost) {
        this.mode = mode;
        this.time = time;
        this.cost = cost;
    }
}

public class GreedyAlgorithm {

    public static void main(String[] args) {
        Transport[] options = {
            new Transport("Flight", 1, 5000),
            new Transport("Train", 15, 1000),
            new Transport("Bus", 30, 500)
        };

        Transport best = options[0];

        // Greedy algorithm: select the transport with the minimum time
        for (int i = 1; i < options.length; i++) {
            if (options[i].time < best.time) {
                best = options[i];
            }
        }

        // Print the best option
        System.out.println("Best option to reach fast to GOA:");
        System.out.println("Mode: " + best.mode + ", Time: " + best.time + " Hours, Cost: ₹" + best.cost);
    }
}
