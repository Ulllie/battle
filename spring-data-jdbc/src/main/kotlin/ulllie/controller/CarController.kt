package ulllie.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ulllie.projection.FullCarInfoProjection
import ulllie.service.CarService
import java.util.UUID

@RestController
@RequestMapping("/car")
class CarController(
    private val carService: CarService
) {

    @GetMapping("/{carId}/info")
    fun getFullCarInfo(@PathVariable carId: UUID): FullCarInfoProjection? =
        carService.getFullCarInfo(carId = carId)
}