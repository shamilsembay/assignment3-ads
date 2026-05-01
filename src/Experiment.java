public class Experiment {
    private Sorter sorter;
    private Searcher searcher;

    public Experiment(Sorter sorter, Searcher searcher) {
        this.sorter = sorter;
        this.searcher = searcher;
    }

    public long measureSortTime(int[] arr, String type) {
        long startTime = System.nanoTime();

        if (type.equalsIgnoreCase("basic")) {
            sorter.basicSort(arr);
        } else if (type.equalsIgnoreCase("advanced")) {
            sorter.advancedSort(arr);
        }

        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public long measureSearchTime(int[] arr, int target) {
        long startTime = System.nanoTime();

        int result = searcher.search(arr, target);

        long endTime = System.nanoTime();

        if (result == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index: " + result);
        }

        return endTime - startTime;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            System.out.println("=================================");
            System.out.println("Array size: " + size);

            int[] randomArray1 = sorter.generateRandomArray(size);
            int[] randomArray2 = randomArray1.clone();

            int[] sortedArray1 = sorter.generateSortedArray(size);
            int[] sortedArray2 = sortedArray1.clone();

            long basicRandomTime = measureSortTime(randomArray1, "basic");
            long advancedRandomTime = measureSortTime(randomArray2, "advanced");

            long basicSortedTime = measureSortTime(sortedArray1, "basic");
            long advancedSortedTime = measureSortTime(sortedArray2, "advanced");

            int target = size / 2;

            int[] searchArray = sorter.generateSortedArray(size);
            long searchTime = measureSearchTime(searchArray, target);

            System.out.println("Bubble Sort random array time: " + basicRandomTime + " ns");
            System.out.println("Merge Sort random array time: " + advancedRandomTime + " ns");

            System.out.println("Bubble Sort sorted array time: " + basicSortedTime + " ns");
            System.out.println("Merge Sort sorted array time: " + advancedSortedTime + " ns");

            System.out.println("Binary Search time: " + searchTime + " ns");
        }
    }
}