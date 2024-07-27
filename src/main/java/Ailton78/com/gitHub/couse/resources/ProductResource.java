package Ailton78.com.gitHub.couse.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ailton78.com.gitHub.couse.entities.Product;
import Ailton78.com.gitHub.couse.services.ProductService;

@RestController
@RequestMapping(path = "/products")
public class ProductResource {

	@Autowired
	private ProductService productservice;

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = productservice.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable(value = "id") Long id) {
		Product obj = productservice.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
