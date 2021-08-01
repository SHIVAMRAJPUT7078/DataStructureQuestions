package BusyPerson;

import java.util.*;

public class Main {
    static class Pair {
        int startTime;
        int endTime;

        Pair(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        @Override
        public String toString() {
            return startTime + " : " + endTime;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Pair> activities = new ArrayList<>();
        while (n-- > 0) {
            int startT = sc.nextInt();
            int endT = sc.nextInt();
            Pair pair = new Pair(startT, endT);
            activities.add(pair);
        }
        System.out.println(activities);

        Collections.sort(activities, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.endTime - o2.endTime;

            }
        });
        System.out.println(activities);


    }
}
