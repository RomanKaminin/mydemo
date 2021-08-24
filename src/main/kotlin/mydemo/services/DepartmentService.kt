package mydemo.services

import mydemo.entitys.DepartmentEntity
import mydemo.repo.DepartmentRepository
import org.springframework.stereotype.Service

@Service
class DepartmentService(val repo: DepartmentRepository) {
    fun insert(dep: DepartmentEntity): DepartmentEntity {
        return repo.save(dep)
    }
}