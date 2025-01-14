package org.example.solutions.stack;

import java.util.Stack;

public class CarFleetII {
    public double[] getCollisionTimes(int[][] cars) {
        double[] result = new double[cars.length];
        var stack = new Stack<int[]>();
        for (int i = cars.length - 1; i >= 0; i--) {
            var position = cars[i][0];
            var speed = cars[i][1];

            if (stack.isEmpty()) {
                result[i] = -1;
                var newFleet = new int[]{position, speed};
                stack.push(newFleet);
                continue;
            }

            int[] peek = stack.peek();
            int lastFleetPosition = peek[0];
            int lastFleetSpeed = peek[1];

            int[] nextCar = cars[i + 1];
            var nextCarPosition = nextCar[0];
            var nextCarSpeed = nextCar[1];
            var nextCarTime = Double.MAX_VALUE;
            var nextFleetTime = Double.MAX_VALUE;
            if (speed > nextCarSpeed) {
                nextCarTime = (double) (nextCarPosition - position) / (speed - nextCarSpeed);
            }

            if (speed > lastFleetSpeed) {
                nextFleetTime = (double) (lastFleetPosition - position) / (speed - lastFleetSpeed);
                if (nextCarTime < nextFleetTime) {
                    var newFleet = new int[]{nextCarPosition, nextCarSpeed};
                    stack.push(newFleet);
                    result[i] = nextCarTime;
                } else {
                    result[i] = nextFleetTime;
                }
                continue;
            }

            if (speed <= lastFleetSpeed) {
                result[i] = -1;
                var newFleet = new int[]{position, speed};
                stack.push(newFleet);
                continue;
            }
        }

        return result;
    }
}
