class Solution {
    public int solution(int[] common) {
        int answer = 0;
        if(common[1]-common[0] == common[2] - common[1]){
            int index = common.length -1;
            answer = common[index] + common[2] - common[1];
        }
        else{
            int a = common[1]/common[0]; //2

            answer = common[common.length -1] * a;
        }
        return answer;
    }
}