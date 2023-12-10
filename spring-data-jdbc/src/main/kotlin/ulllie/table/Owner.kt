package ulllie.table

import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table
data class Owner(
    val ownerId: UUID = UUID.randomUUID(),
    val name: String,
    val carId: UUID
)