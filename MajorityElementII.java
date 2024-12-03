import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};

        // Create an instance of Solution
        Solution sol = new Solution();

        // Call the findMajority method
        List<Integer> res = sol.findMajority(arr);

        // Print the result
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }

    static class Solution {
        // Function to find the majority elements in the array
        public List<Integer> findMajority(int[] nums) {

            int n = nums.length;

            int cand1=-1, cand2=-1;
            int count1=0, count2=0;

            for(int cand : nums){

                if(cand1==cand){
                    count1++;
                }

                else if(cand2==cand){
                    count2++;
                }

                else if(count1==0){
                    cand1=cand;
                    count1++;
                }

                else if(count2==0){
                    cand2=cand;
                    count2++;
                }

                else{
                    count1--;
                    count2--;
                }

            }

            List<Integer> res = new ArrayList<>();
            count1=0;
            count2=0;

            for(int cand : nums){
                if(cand1 == cand) count1++;
                if(cand2 == cand) count2++;
            }

            if(count1 > n/3) {
                res.add(cand1);
            }
            if((count2 > n/3) && cand1 !=cand2) {
                res.add(cand2);
            }

            if(res.size() == 2 && res.get(0) >res.get(1)){
                int temp =res.get(0);
                res.set(0 , res.get(1));
                res.set(1 , temp);
            }
            return res;
        }
    }

}
