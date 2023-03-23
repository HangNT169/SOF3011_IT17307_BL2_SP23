package com.poly.hangnt169.B8_CRUDHibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hangnt169
 */
@Entity
@Table(name = "category")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Category {
// https://github.com/AnhDT0407/Course-JavaCore/blob/master/Java-Lesson/Java%207/try-with-resources.md
    // Java 3: JDBC thuan
    // Java 4: Hibernate
    // Java 5 > : JPA
    // CRUD <=> CREATE , READ, UPDATE , DELETE
    // GET ALL <=> SELECT
    // Hibernate Truy Van Tren Thuc The Entity (HQL)
    // Cot table
    // 3:
    // - Cot Column
    // - Khoa Chinh
    // - Khoa Ngoai
    //bigint <=> Long

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_code")
    private String categoryCode;

}
