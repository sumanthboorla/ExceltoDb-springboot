/**
 * Copyrights belongs to sumanth
 */
package com.sbTech.ExceltoDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sbTech.ExceltoDB.model.EtoDbEntity;
import com.sbTech.ExceltoDB.service.EtoDbserviceImpl;

/**
 * Developed suman on 10 Feb 2026 
 */
@RestController
@RequestMapping("/etodb")
public class EtoDBController {
	
	@Autowired
	private EtoDbserviceImpl etoDbserviceImpl;
	
	@PostMapping(value="/upload", consumes = "multipart/form-data")
	public ResponseEntity<String> saveFileData(@RequestParam("file") MultipartFile file) throws Exception 
	{
		etoDbserviceImpl.saveFileData(file.getInputStream());
		return ResponseEntity.ok("Excel file data saved");
		
	}
	
	@GetMapping("read-data")
	public ResponseEntity<List<EtoDbEntity>> findAll()
	{
		return ResponseEntity.ok(etoDbserviceImpl.findAll());
	}

}
