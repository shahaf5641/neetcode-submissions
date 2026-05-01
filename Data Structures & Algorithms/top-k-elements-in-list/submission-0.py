import heapq
from collections import Counter

class Solution:
    def topKFrequent(self, nums, k):  # Add 'self' as the first parameter
        # Step 1: Count the frequency of each element
        frequency_map = Counter(nums)
        
        # Step 2: Create a min-heap and push elements with their frequency
        min_heap = []
        
        for num, freq in frequency_map.items():
            # Push frequency and element into the heap
            heapq.heappush(min_heap, (freq, num))
            
            # If the heap exceeds size k, pop the smallest frequency element
            if len(min_heap) > k:
                heapq.heappop(min_heap)
        
        # Step 3: Extract the top k frequent elements
        result = [num for _, num in min_heap]
        
        return result