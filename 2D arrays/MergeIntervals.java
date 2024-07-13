import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {

    public static int[][] mergeBruteForce(int[][] intervals) {

        // Sort the given intervals
        //The Arrays.sort method uses a custom comparator
        //to sort the intervals based on the starting time (a[0] and b[0]).

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        ArrayList<int[]> ans = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            // Skip all the merged intervals
            // here we are checking the start interval with previous end interval
            // present in ans list
            if (!ans.isEmpty() && start <= ans.get(ans.size() - 1)[1]) {
                continue;
            }

            // Check the rest of the intervals
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                } else {
                    break;
                }
            }

            ans.add(new int[]{start, end});
        }

        int[][] res = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }

    public static int[][] mergeOptimal(int[][] intervals) {
        
        //sort the given intervals:
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        ArrayList<int[]> ans = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            // if the current interval does not
            // lie in the last interval:
            if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1)[1]) {
                ans.add(new int[]{intervals[i][0], intervals[i][1]});
            }

            // if the current interval
            // lies in the last interval:
            else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], intervals[i][1]);
            }
        }

        int[][] res = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }

    public static void printMat(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("{");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (i < matrix.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {0, 4}};

        System.out.print("Original intervals: ");
        printMat(intervals);
        System.out.println();

        int[][] merged = mergeBruteForce(intervals);

        System.out.print("Merged intervals: ");
        printMat(merged);
    }
}
