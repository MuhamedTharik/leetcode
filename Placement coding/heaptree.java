import java.util.PriorityQueue;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        
        int[] nums ={10,8,52,14,75,3,2};
        for(int t:nums){
            minHeap.add(t);
        }
        for(int t:nums){
            maxheap.add(t);
        }
        System.out.println(minHeap);
        System.out.println("Ordered minimum  heap tree");
        while(!minHeap.isEmpty()){
            System.out.print(minHeap.poll()+" ");
        }
        System.out.println();
        System.out.println(maxheap);
        System.out.println("Ordered maximum  heap tree");
        while(!maxheap.isEmpty()){
            System.out.print(maxheap.poll()+" ");
        }
    }
}
