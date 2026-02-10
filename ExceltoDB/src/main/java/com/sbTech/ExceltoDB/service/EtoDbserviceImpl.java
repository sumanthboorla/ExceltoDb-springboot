/**
 * Copyrights belongs to sumanth
 */
package com.sbTech.ExceltoDB.service;

import java.io.IOException;
import java.io.InputStream;
import java.sql.RowId;
import java.util.LinkedList;
import java.util.List;

import javax.print.attribute.standard.SheetCollate;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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
			sheet.forEach( row -> {
				EtoDbEntity etoDbEntity = new EtoDbEntity();
				if(row.getRowNum()!=0)
				{
					etoDbEntity.setEmployeeName(row.getCell(0).getStringCellValue());
					etoDbEntity.setEmployeeSalary(row.getCell(1).getNumericCellValue());
					etodblist.add(etoDbEntity);
				}
			});	
			etoDbRepository.saveAll(etodblist);
			
		}
		catch(EncryptedDocumentException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public List<EtoDbEntity> findAll(){
		return etoDbRepository.findAll();
	}
