class Solution {
    public String[] solution(String[] quiz) {
        int size = quiz.length;
        String[] answer = new String[size];
        for(int i=0;i < quiz.length; i++){
            String[] text = quiz[i].split(" ");
            int a = Integer.parseInt(text[0]);
            int b = Integer.parseInt(text[2]);
            int c = Integer.parseInt(text[4]);
            int result = 0;
            if(text[1].equals("+")){
                result = a + b; 
            } else{
                result = a - b;
            }
            if(result == c){
                answer[i] = "O";
            } else{
                answer[i] = "X";
            }
        }
        return answer;
    }
}