package ulllie.table

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table
data class Country(
    @Id
    val countryId: UUID,
    val name: String,
    val continentId: UUID
)