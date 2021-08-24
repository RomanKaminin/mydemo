package mydemo.repo

import mydemo.entitys.EmployeeEntity
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository : JpaRepository<EmployeeEntity, Long>