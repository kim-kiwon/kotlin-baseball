package baseball.game

import baseball.ball.Ball
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RefereeTest {
    private lateinit var referee: Referee

    @Test
    fun `Referee compareWithAnswer test for no answer`() {
        referee = Referee(listOf(1, 2, 3), listOf(4, 5, 6))
        assertThat(referee.compareWithAnswer().balls).isEmpty()
    }

    @Test
    fun `Referee compareWithAnswer test for 1ball 1strike`() {
        referee = Referee(listOf(1, 2, 3), listOf(1, 3, 4))
        assertThat(referee.compareWithAnswer().balls.count { it == Ball.BALL}).isEqualTo(1)
        assertThat(referee.compareWithAnswer().balls.count { it == Ball.STRIKE}).isEqualTo(1)
    }
}