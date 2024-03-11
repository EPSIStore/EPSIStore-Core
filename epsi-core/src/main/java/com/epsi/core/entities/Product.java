package com.epsi.core.entities;

import java.util.Map;

import org.hibernate.annotations.Type;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_product")
    private int idProduct;

    @Column(name = "name_product", length = 50)
    private String name;

    @Column(name = "description", length = 50)
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "deleted")
    private boolean deleted = false;

    @Type(JsonType.class)
    @Column(name = "detail", columnDefinition = "jsonb")
    private Map<String, Object> detail;

    public Object getDetail(String name) {
        return this.detail.get(name);
    }

    public void setDetail(String name, Object value) {
        this.detail.put(name, value);
    }

    public void removeDetail(String name) {
        this.detail.remove(name);
    }
}

