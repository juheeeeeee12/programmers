class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] result = new int[included.length];
        
        for(int i=0;i<included.length;i++){
            if(i == 0){
                result[i] = a;
            }else{
                result[i] = result[i-1] + d;
            }
        }
        
        for(int n=0;n<included.length;n++){
            if(included[n]){
                answer += result[n];
            }
        }
        
        
        return answer;
    }
}