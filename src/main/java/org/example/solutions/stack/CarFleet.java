package org.example.solutions.stack;

import java.util.Comparator;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());

        for (int i = 0; i < position.length; i++) {
            map.put(position[i], speed[i]);
        }

        Stack<Double> stack = new Stack<>();
        for (Map.Entry<Integer, Integer> car : map.entrySet()) {
            Integer positionCar = car.getKey();
            Integer speedCar = car.getValue();
            double time = (double) (target - positionCar) / speedCar;

            if (stack.isEmpty()) {
                stack.push(time);
                continue;
            }
            if (time > stack.peek()) {
                stack.push(time);
            }

        }
        return stack.size();
    }

}
