package cl.ravenhill.library

/**
 * Represents a book published during the 20th century.
 *
 * This data class enforces that the publication year must be between 1900 and 1999.
 * If no author is provided, it defaults to `"Unknown"` and prints a message.
 *
 * ## Usage:
 *
 * ### Example 1: Creating a book with all fields specified
 *
 * ```kotlin
 * val book = TwentiethCenturyBook("The Hobbit", "J. R. R. Tolkien", 1937)
 * println(book) // Output: TwentiethCenturyBook(title=The Hobbit, author=J. R. R. Tolkien, year=1937)
 * ```
 *
 * ### Example 2: Creating a book with a default author
 *
 * ```kotlin
 * val anonymous = TwentiethCenturyBook("Untitled", 1950) // Author defaults to "Unknown"
 * println(anonymous) // Output: TwentiethCenturyBook(title=Untitled, author=Unknown, year=1950)
 * ```
 *
 * ### Example 3: Attempting to create a book with an invalid year
 *
 * ```kotlin
 * val invalidBook = TwentiethCenturyBook("Les Misérables", "Victor Hugo", 1862) // Throws IllegalArgumentException
 * ```
 *
 * @property title The title of the book.
 * @property author The author of the book.
 *   Defaults to `"Unknown"` if not specified.
 * @property year The publication year, which must be in the range 1900 to 1999 (inclusive).
 * @throws IllegalArgumentException if the year is outside the allowed range.
 */
data class TwentiethCenturyBook(val title: String, val author: String, val year: Int) {
    init {
        require(year in 1900..1999) {
            "Only books published between 1900 and 1999 are allowed. Received: $year"
        }
    }

    /**
     * Secondary constructor that allows omitting the author.
     * Sets the author to `"Unknown"` and prints a notice.
     */
    constructor(title: String, year: Int) : this(title, "Unknown", year) {
        println("No author provided — using 'Unknown'.")
    }
}

fun main() {
    // Create a TwentiethCenturyBook with full details
    val book1 = TwentiethCenturyBook("The Hobbit", "J. R. R. Tolkien", 1937)
    println("Book 1: $book1")

    // Another valid 20th-century book
    val book2 = TwentiethCenturyBook("The Shadow Over Innsmouth", "H. P. Lovecraft", 1936)
    println("Book 2: $book2")

    // Use the secondary constructor: author will default to "Unknown"
    val book3 = TwentiethCenturyBook("Primary Colors", 1996)
    println("Book 3: $book3")

    // Invalid year: outside 1900–1999, this will throw an exception
    val book4 = TwentiethCenturyBook("Fire & Blood", "George R. R. Martin", 2018)
    println("Book 4: $book4")  // ⚠️ This line won't execute due to the exception above
}
