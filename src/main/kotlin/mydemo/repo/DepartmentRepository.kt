package mydemo.repo

import mydemo.entitys.DepartmentEntity
import org.springframework.data.jpa.repository.JpaRepository

interface DepartmentRepository : JpaRepository<DepartmentEntity, Long> {
    fun findOneByName(name: String) : DepartmentEntity

}