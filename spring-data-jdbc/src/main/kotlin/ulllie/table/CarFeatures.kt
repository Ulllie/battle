package ulllie.table

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table
class CarFeatures(
    @Id
    val featureId: UUID,
    val featureName: String,
    val carId: UUID
)