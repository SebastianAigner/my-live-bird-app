import kotlinx.serialization.Serializable

@Serializable
data class BirdImage(
    val category: String,
    val path: String,
    val author: String
)