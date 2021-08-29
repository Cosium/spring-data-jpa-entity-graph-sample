package com.cosium.spring_data_jpa_entity_graph_sample;

import com.cosium.spring.data.jpa.entity.graph.repository.EntityGraphJpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Réda Housni Alaoui
 */
public interface ProductRepository extends EntityGraphJpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
}
