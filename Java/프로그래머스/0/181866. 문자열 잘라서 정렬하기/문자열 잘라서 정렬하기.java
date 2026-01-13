import java.util.Arrays;

class Solution {
                public String[] solution(String myString) {
            String[] answer = Arrays.stream(myString.split("x"))
                    .filter(s -> !s.isBlank())
                    .toArray(String[]::new);

            quickSort(answer, 0, answer.length - 1);

            return answer;
        }

        private static void quickSort(String[] arr, int start, int end) {
            if (start >= end) {
                return;
            }

            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }

        private static int partition(String[] arr, int start, int end) {
            String pivot = arr[end];
            int i = start;

            for (int j = start; j < end; j++) {
                if (arr[j].compareTo(pivot) < 0) {
                    swap(arr, i, j);
                    i++;
                }
            }
            swap(arr, i, end);

            return i;
        }

        private static void swap(String[] arr, int i, int j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

}