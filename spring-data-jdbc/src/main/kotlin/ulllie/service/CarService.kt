package ulllie.service

import org.springframework.stereotype.Service
import ulllie.projection.FullCarInfoProjection
import ulllie.repository.CarRepository
import java.util.*

@Service
class CarService(
    private val carRepository: CarRepository
) {
    fun getFullCarInfo(carId: UUID): FullCarInfoProjection? =
        carRepository.getFullInfoById(carId)
}
