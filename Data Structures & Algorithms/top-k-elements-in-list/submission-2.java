class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Initialize HashMap and MinHeap
        HashMap<Integer, Integer> numFreq = new HashMap<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        //Create the hashmap
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }


        //Create the Minheap
        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
            minHeap.offer(new int[] {entry.getKey(), entry.getValue()});
            if (minHeap.size() > k) minHeap.poll();
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = minHeap.poll()[0];
        }
        return res;
    }
}   