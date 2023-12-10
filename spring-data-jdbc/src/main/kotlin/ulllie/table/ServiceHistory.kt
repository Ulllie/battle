package ulllie.table

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime
import java.util.UUID

@Table
data class ServiceHistory(
    @Id
    val historyId: UUID,
    val details: LocalDateTime,
    val carId: UUID
)