package ulllie.repository

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import ulllie.projection.FullCarInfoProjection
import ulllie.table.Car
import java.util.UUID

@Repository
interface CarRepository : CrudRepository<Car, UUID> {
    @Query(SELECT_FULL_CAR_INFO_BY_CAR_ID)
    fun getFullInfoById(@Param("carId") carId: UUID): FullCarInfoProjection?

    companion object {
        const val SELECT_FULL_CAR_INFO_BY_CAR_ID = """
            SELECT 
            c.model,
            c.year,
            m.name as "manufacturer_name", 
            co.name as "country_name", 
            cont.name as "continent_name"
            
            FROM car c
            LEFT JOIN manufacturer m ON c.manufacturer_id = m.manufacturer_id
            LEFT JOIN country co ON m.country_id = co.country_id
            LEFT JOIN continent cont ON co.continent_id = cont.continent_id
            WHERE c.car_id = :carId
        """
    }
}