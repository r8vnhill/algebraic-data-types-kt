package cl.ravenhill.music

/**
 * Represents a musical track with basic metadata.
 *
 * This data class is an example of a product type that groups related fields together using Kotlin's `data` keyword.
 * It automatically provides structural equality, a readable `toString()`, and `componentN` functions for destructuring.
 *
 * ## Usage:
 * Use this class to model songs in playlists, albums, or music libraries.
 *
 * ### Example 1: Basic initialization
 * ```kotlin
 * val song = Song("Walk on the Wild Side", 1972)
 * println(song) // Output: Song(title=Walk on the Wild Side, year=1972)
 * ```
 *
 * ### Example 2: Destructuring
 * ```kotlin
 * val (title, year) = Song("Pathetic", 2006)
 * println("'$title' was released in $year")
 * // Output: 'Pathetic' was released in 2006
 * ```
 *
 * @property title The title of the song.
 * @property year The year the song was released.
 */
data class Song(val title: String, val year: Int)

fun main() {
    // Destructure a Song into individual variables
    val (title, year) = Song("Dream On", 1973)
    println("'$title' was released on $year")

    // Create a playlist of songs
    val playlist = listOf(
        Song("Dream On", 1973),
        Song("I Don't Want to Miss a Thing", 1998)
    )

    // Iterate over the playlist, destructuring each Song
    for ((title, year) in playlist) {
        println("$title ($year)")
    }

    // Filter songs released before 1980 and convert their titles to uppercase
    val classics = playlist
        .filter { (_, year) -> year < 1980 }         // Ignore the title
        .map { (title, _) -> title.uppercase() }     // Ignore the year

    println(classics)
}
