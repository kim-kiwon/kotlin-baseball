package baseball.util

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class AnswerGeneratorTest {
    private var answer: List<Int> = listOf()

    @BeforeEach
    fun beforeEach() {
        answer = AnswerGenerator.generate()
    }

    @Test
    fun `answer don't have duplicate element`() {
        assertThat(answer.toSet().size).isEqualTo(answer.size)
    }

    @Test
    fun `answer's all element is between 1 ~ 9`() {
        assertThat(answer.all { it in 1..9 }).isTrue
    }

    @Test
    fun `answer's size is 3`() {
        assertThat(answer.size).isEqualTo(3)
    }
}