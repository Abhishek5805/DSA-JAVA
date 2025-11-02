package heap;

import java.util.ArrayList;

public class inert {
    static class heap{
        ArrayList<Integer> arr=new ArrayList<>();   
        public void insert(int data)
        {
            arr.add(data);
            int x=arr.size()-1;
            int par=(x-1)/2;

            while(x>0 && arr.get(x)<arr.get(par))
            {
                int temp=arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x=par;
                par=(x-1)/2;
            }
        }
    }
    public static void main(String[] args) {
        heap h=new heap();
        h.insert(5);
        h.insert(3);
        h.insert(2);
        h.insert(8);
        System.out.println(h.arr);
    }
    
}
