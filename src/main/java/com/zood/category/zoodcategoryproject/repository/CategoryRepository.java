package com.zood.category.zoodcategoryproject.repository;

import com.zood.category.zoodcategoryproject.model.ItemCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<ItemCategory, String> {
}
