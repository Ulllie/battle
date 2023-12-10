package ulllie.table

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table
data class Car(
    @Id
    val carId: UUID,
    val model: String,
    val year: Int,
    val manufacturerId: UUID
)