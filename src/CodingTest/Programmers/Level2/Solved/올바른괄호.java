package CodingTest.Programmers.Level2.Solved;

public class 올바른괄호 {

    boolean solution(String s) {
      boolean answer = true;
      // 1. 열린 괄호 개수를 저장하는 변수.
      int open = 0;

      // 2. 첫 문자가 닫힌 괄호인 경우는 바로 false.
      if(s.charAt(0) == ')') return false;

      // 3. 문자열 탐색.
      for(int i = 0;i<s.length();i++){
        // 4. 열린 괄호를 만나면 open은 증가.
        if(s.charAt(i)=='(') {
          open++;
        }
        // 5. 닫힌 괄호를 만난 경우는
        else {
          // 6. open값을 우선 탐색, 열린 괄호의 수 < 닫힌 괄호의 수 인 경우는 false.
          if(open <= 0 ) return false;
          // 7. 위의 조건에 걸리지 않으면 open은 감소.
          open--;
        }
      }

      // 8. 모든 과정이 끝났을 때 open이 0이 아니라면 짝이 맞지 않으므로 false.
      if(open != 0) return false;

      // 9. 위의 모든 조건에서 걸리지 않는다면 그대로 true 반환.
      return answer;
    }
  }

