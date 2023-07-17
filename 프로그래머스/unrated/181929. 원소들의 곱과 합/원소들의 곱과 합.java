class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 1;
        int b = 0;
        
        for(int i=0;i<num_list.length;i++){
            a *= num_list[i];
        }
        
        for(int n=0;n<num_list.length;n++){
            b += num_list[n];
        }
        int c = b * b;
        
       answer = (a < c)?1:0;
        return answer;
    }
}