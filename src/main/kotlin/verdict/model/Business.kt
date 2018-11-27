package verdict.model
import com.fasterxml.jackson.annotation.JsonIgnoreProperties


@JsonIgnoreProperties(ignoreUnknown = true)
data class BusinessList(
    val businesses: List<Business> = arrayListOf(),
    val region: Region? = null,
    val total: Int? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Business(
    val alias: String? = null,
    val categories: List<Category>? = null,
    val coordinates: Coordinates? = null,
    val display_phone: String? = null,
    val distance: Double? = null,
    val id: String? = null,
    val image_url: String? = null,
    val is_closed: Boolean? = null,
    val location: Location? = null,
    val name: String? = null,
    val phone: String? = null,
    val price: String? = null,
    val rating: Int? = null,
    val review_count: Int? = null,
    val transactions: List<String>? = null,
    val url: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Coordinates(
    val latitude: Double? = null,
    val longitude: Double? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Category(
    val alias: String? = null,
    val title: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Location(
    val address1: String? = null,
    val address2: String? = null,
    val address3: String? = null,
    val city: String? = null,
    val country: String? = null,
    val display_address: List<String>? = null,
    val state: String? = null,
    val zip_code: String? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Region(
    val center: Center? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Center(
    val latitude: Double? = null,
    val longitude: Double? = null
)