package baseball.util

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class UserInputHandlerTest {
    @Test
    fun `handleAppFinishInput finish test`() {
        assertThat(UserInputHandler.handleAppFinishInput("2")).isTrue
    }

    @ParameterizedTest
    @ValueSource(strings = ["1234", "12c", "120", "113"])
    fun `handleGameInput throw error when non valid userInput is received`(userInput: String) {
        assertThrows<IllegalArgumentException> {
            UserInputHandler.handleGameInput(userInput)
        }
    }

    @Test
    fun `handleGameInput when userInput has right num then return list`() {
        val userNums = UserInputHandler.handleGameInput("123")

        assertThat(userNums.size).isEqualTo(3)
        assertThat(userNums[0]).isEqualTo(1)
        assertThat(userNums[1]).isEqualTo(2)
        assertThat(userNums[2]).isEqualTo(3)
    }
}