package org.zerock.j2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.j2.entity.FileBoard;
import org.zerock.j2.entity.Product;
import org.zerock.j2.repository.search.FileBoardSearch;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}