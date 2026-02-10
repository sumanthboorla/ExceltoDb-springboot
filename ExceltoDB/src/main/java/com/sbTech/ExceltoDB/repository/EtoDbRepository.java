/**
 * Copyrights belongs to sumanth
 */
package com.sbTech.ExceltoDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbTech.ExceltoDB.model.EtoDbEntity;

/**
 * Developed suman on 10 Feb 2026 
 */
@Repository
public interface EtoDbRepository extends JpaRepository<EtoDbEntity, Integer> {

}
