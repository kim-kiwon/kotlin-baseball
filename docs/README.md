## Kotlin-Baseball
### Todo
- [x] Create answer by random number
- [x] Create game function that receive user input and compare with answer until exception is occurred or end
- [x] Create enum class that express strike, ball and nothing
- [x] Create function that compare with answer and user input. Then give result to user.
- [x] Throw IllegalArgumentException when user input is not valid

### 책임 분배
- BaseballGame
  - 생성자
    - answer 을 입력받는다
  - play 함수
    - while 문으로 게임을 수행한다.
  - receiveUserInput
    - 사용자의 입력값을 받는다
  - compareWithAnswer
    - 사용자의 입력값과 정답을 비교한다.
    - 정답 입력시
      - 게임이 종료된다
    - 정답 아닐시
      - 비교 결과를 출력한다
- AnswerGenerator
  - generate 라는 static 함수를 가진다.
  - 중복되지 않는 랜덤 숫자 3개로 정답을 생성한다.
- Ball
  - Ball, Strike 여부를 저장하는 enum이다
- Balls
  - List<Ball> 을 저장하는 일급 컬렉션이다.
  - 게임 결과로 문자열을 생성한다