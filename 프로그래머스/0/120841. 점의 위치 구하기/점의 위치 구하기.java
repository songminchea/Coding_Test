class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        
        if(dot[0]>0&&dot[1]>0){
            answer = 1;
        }
        else if(dot[0]<0&&dot[1]>0){
            answer = 2;
        }
        else if(dot[0]<0&&dot[1]<0){
            answer = 3;
        }
        else if(dot[0]>0&&dot[1]<0){
            answer = 4;
        }
        return answer;
    }
}