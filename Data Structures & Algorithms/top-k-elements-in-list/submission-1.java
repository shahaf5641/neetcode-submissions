class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> numFreq = new HashMap<>();
        //Create HashMap - Key: number, value: freq
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
        (a , b) -> numFreq.get(b) - numFreq.get(a)
        );

        //Create the max heap with freq
        numFreq.forEach((num, freq) -> {
            maxHeap.add(num);
        });

        //Extracting k vals from the top (most frequents)
        for (int i = 0; i<k; i++) {
            res[i] = maxHeap.poll();
        }
        return res;
    }
}
