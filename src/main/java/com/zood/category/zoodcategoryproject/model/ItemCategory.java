package com.zood.category.zoodcategoryproject.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;


@Document(collection = "item_categories")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ItemCategory {

    @Id
    public String item_category_id;
    public String restaurant_id;
    public int sort_id;
    public Object title;
    public Object description;
    public LocalDateTime created_at;
    public LocalDateTime updated_at;
    public String status;

}
