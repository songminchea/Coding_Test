class Solution {
    public int[] solution(int[] numbers) {
         int[] answer = new int[numbers.length];  // 결과를 저장할 배열을 입력 배열과 동일한 크기로 생성

        // for문을 사용하여 numbers 배열의 모든 요소를 순회
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;  // 각 요소를 두 배로 만들어 answer 배열에 저장
        }
        return answer;
    }
}