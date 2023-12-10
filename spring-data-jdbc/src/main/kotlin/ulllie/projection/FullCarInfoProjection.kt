package ulllie.projection

data class FullCarInfoProjection(
    val model: String,
    val year: Int,
    val manufacturerName: String,
    val countryName: String,
    val continentName: String
)