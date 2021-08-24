package mydemo.controllers

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import mydemo.entitys.DepartmentEntity
import mydemo.services.DepartmentService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/department")
@Api(description = "Подразделения")
class DepartmentController(val service: DepartmentService) {

    @PostMapping
    @ApiOperation("Добавить подразделение")
    fun saveDep(@RequestParam  dep: String): ResponseEntity<DepartmentEntity> {
        val department = service.insert(DepartmentEntity(name = dep))
        return ResponseEntity<DepartmentEntity>(department, HttpStatus.CREATED)
    }
}