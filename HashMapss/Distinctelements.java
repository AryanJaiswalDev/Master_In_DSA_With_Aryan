package HashMapss;

import java.util.HashSet;

public class Distinctelements {
    public static void main(String[] args) {

    
    int arr[]={1,2,2,2,1,3,4};
    HashSet<Integer> ans=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            ans.add(arr[i]);
        }
        System.out.println(ans.size());
    }
    
}
