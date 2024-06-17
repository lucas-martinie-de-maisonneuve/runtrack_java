package jour04.job08;

import java.util.concurrent.*;

public class SumCalculation {
    private static final int MAX_THREADS = 10;

    public static void main(String[] args) {
        long start = 1;
        long end = 10000000;
        long sum = calculateSum(start, end);
        System.out.println("La somme des nombres de 1 à 10 millions est : " + sum);
    }

    private static long calculateSum(long start, long end) {
        ExecutorService executor = Executors.newFixedThreadPool(MAX_THREADS);
        long sum = 0;
        long numPerThread = (end - start + 1) / MAX_THREADS;
        
        try {
            for (int i = 0; i < MAX_THREADS; i++) {
                long threadStart = start + i * numPerThread;
                long threadEnd = (i == MAX_THREADS - 1) ? end : threadStart + numPerThread - 1;
                SumTask task = new SumTask(threadStart, threadEnd);
                Future<Long> future = executor.submit(task);
                sum += future.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
        
        return sum;
    }

    private static class SumTask implements Callable<Long> {
        private final long start;
        private final long end;

        public SumTask(long start, long end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Long call() {
            long sum = 0;
            for (long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
