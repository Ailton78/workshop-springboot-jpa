package Ailton78.com.gitHub.couse.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ailton78.com.gitHub.couse.entities.Category;
import Ailton78.com.gitHub.couse.services.CategoryService;

@RestController
@RequestMapping(path = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = categoryService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Category> findById(@PathVariable(value = "id") Long id) {
		Category obj = categoryService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
