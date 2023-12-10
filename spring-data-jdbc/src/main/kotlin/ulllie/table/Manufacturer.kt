package ulllie.table

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table
data class Manufacturer(
    @Id
    val manufacturerId: UUID,
    val name: String,
    val countryId: UUID
)