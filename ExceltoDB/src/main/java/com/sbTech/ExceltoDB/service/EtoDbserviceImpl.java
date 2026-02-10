/**
 * Copyrights belongs to sumanth
 */
package com.sbTech.ExceltoDB.service;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import javax.print.attribute.standard.SheetCollate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbTech.ExceltoDB.model.EtoDbEntity;
import com.sbTech.ExceltoDB.repository.EtoDbRepository;

/**
 * Developed suman on 10 Feb 2026 
 */

@Service
public class EtoDbserviceImpl {
	
	@Autowired
	private EtoDbRepository etoDbRepository;
	
	public void saveFileData(InputStream file)
	{
		List<EtoDbEntity> etodblist= new LinkedList<>();
		try
		{
			Workbook workbook = WorkbookFactory.create(file);
			Sheet sheet = workbook.getSheetAt(0);
			
		}
		
	}
	public List<EtoDbEntity> findAll(){
		return etoDbRepository.findAll();
	}
