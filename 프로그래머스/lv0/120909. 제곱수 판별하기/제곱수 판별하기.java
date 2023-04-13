class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= 1000000; i++){
            int result = i * i;
            if(result == n){
                answer = 1;
                break;
            } else if(i == 1000000 && result !=n){
                answer = 2;
            }
        }
        return answer;
    }
}