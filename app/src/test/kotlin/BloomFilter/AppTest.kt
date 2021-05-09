/*
 * BloomFilter
 * 
 * Space: O(m)
 * Time: O(n)
 * 
 * @author  BingLi224 <bingli224@gmail.com>
 * @since   2021-05-09
 */
package BloomFilter

import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {
    @Test fun givenStringWithOneExtra_whenCallsFilter_thenReturnsOneExtraChar ( ) {
        val s = "abcd"
        val t = "abcde"
        val expect = "e"
        
        assertEquals ( expect, filter ( s, t ) )
    }

    @Test fun givenEmptyStringWithOneExtra_whenCallsFilter_thenReturnsExtraNewChar ( ) {
        val s = ""
        val t = "y"
        val expect = "y"
        
        assertEquals ( expect, filter ( s, t ) )
    }

    @Test fun givenOneCharWithOneExtra_whenCallsFilter_thenReturnsExtraDuplicatedChar ( ) {
        val s = "a"
        val t = "aa"
        val expect = "a"
        
        assertEquals ( expect, filter ( s, t ) )
    }

    @Test fun givenStringWithOneExtra_whenCallsFilter_thenReturnsExtraDuplicatedChars ( ) {
        val s = "zxcvbasdfgqwert"
        val t = "bgtvftrbcdexsewzaqr"
        val expect = "tber"
        
        assertEquals ( expect, filter ( s, t ) )
    }
}
