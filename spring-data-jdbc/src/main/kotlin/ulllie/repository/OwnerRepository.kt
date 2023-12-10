package ulllie.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ulllie.table.Owner
import java.util.UUID

@Repository
interface OwnerRepository : CrudRepository<Owner, UUID> {

}