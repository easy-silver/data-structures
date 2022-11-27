package study.dinosaur.datastructures.w6_hashtable

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HashtableTest {

    @Test
    internal fun `해시 테이블에 요소를 삽입한다`() {
        //given
        val hashtable = Hashtable()
        val item = "해시"
        val fakeItem = "테이블"

        //when
        hashtable.add(item)

        //then
        assertThat(hashtable.contains(item)).isTrue
        assertThat(hashtable.contains(fakeItem)).isFalse
    }
}