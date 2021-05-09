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

fun filter ( s: String, t: String ): String {
    var output = StringBuilder ( )
    var chars = IntArray ( 256 )
    
    for (c in s) {
        chars [ c.toInt ( ) ] ++
    }
    
    for (c in t) {
        val idx = c.toInt ( )
        chars [ idx ] --
        
        if (chars [ idx ] < 0) {
            output.append ( c )
        }
    }
    
    println ( " == ${output.toString()}" )
    
    return output.toString ( )
}