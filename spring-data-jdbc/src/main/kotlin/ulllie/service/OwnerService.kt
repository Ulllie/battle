package ulllie.service

import org.springframework.stereotype.Service
import ulllie.repository.OwnerRepository
import ulllie.table.Owner
import java.util.UUID

@Service
class OwnerService(
   private val ownerRepository: OwnerRepository
) {

}