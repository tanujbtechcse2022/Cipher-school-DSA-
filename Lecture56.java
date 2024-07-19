class Myheap{
    final int capacity = 10;//size of the array
    int arr[] = new int[capacity];
    int size=0;//number of elements at any particular time
    //function to get indexs
    int getParentIndex(int i)
    {
        return (i-1)/2;
    }
    int getLeftChildIndex(int i)
    {
        return 2*i+1;
    }
    int getRightChildIndex(int i){
        return 2*i+2;
    }
    boolean hasParent(int i){
        return getLeftChildIndex(i)>=0;
    }
    boolean hasLeftChild(int i){
        return getLeftChildIndex(i)<size;
    }
    boolean hasRightChild(int i){
        return getRightChildIndex(i)<size;
    }
    //function to get the value of parent /children
    int  parent(int i){
       return arr[ getParentIndex(i)];
    }
    int  leftChild(int i){
        return arr[ getLeftChildIndex(i)];
    }
    int  rightChild(int i){
        return arr[ getRightChildIndex(i)];
    }
    boolean isEmpty()
    {
        return size == 0;
    }
    int peek()
    {
        if (isEmpty())
        {
            System.out.println("the heap is empty.nothing to peek");
            return -1;

        }
        return arr[0];
    }
    void add(int data)
    {
        arr[size++]= data;//place the element at index size and increase the size by one;
        heapifyUp();//create the heap from the array in a bottom ,up manner
    }

    private void heapifyUp() {
        int currIndex = size -1;
        while (parent(currIndex) && parent(currIndex) < arr[currIndex]){
            swap(getParentIndex(currIndex)),currIndex;
            currIndex = getParentIndex(currIndex);
        }

    }
    void  swap (int index1,index 2)//using indexes swap the values in the array
    {
        int temp= arr[index1];
        int index2;
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    void swap (int index1,int index2)//using indexes swap the values in the array
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
    int poll(){
        int elementToReturn = arr[0];
        arr[0] = arr[size-1];//pick the last element and keekp in front
        size--;
        heapifyDown();
        return elementToReturn;
    }
    void heapifyDown(){
        int currIndex =0;
        while(hasLeftChild(currIndex));//till any of the child exits
        {
            //left child will be there - for sure
            //so lets consider left one to be the large
            int largerChildIndex = getLeftChildIndex(currIndex);
            if(hasRightChild(currIndex)&&leftChild((currIndex)>leftChild(currIndex));
            {
                largerChildIndex = getRightChildIndex(currIndex);
            }



                 //at this point largerchildindex contains the index of child bigger amoung the left and right one
            if(arr[currIndex]>arr[largerChildIndex])
            {
                break;

            }
            else{
                swap(currIndex,largerChildIndex);
                currIndex = largerChildIndex;
            }
        }

    }
}
public class cipherschools {
    public static void main(String args[]){
   Myheap heap = new Myheap();
        System.out.println(heap.isEmpty());
        System.out.println(heap.peek());
        heap.add(7);
        System.out.println(heap.isEmpty());
        System.out.println(heap.peek());
        heap.add(8);
        System.out.println(heap.peek());
        heap.add(5);
        System.out.println(heap.peek());
        System.out.println(heap.poll());
        System.out.println(heap.peek());
        System.out.println(heap.poll());
    }
}
