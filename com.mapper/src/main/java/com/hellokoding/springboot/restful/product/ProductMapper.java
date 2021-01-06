package com.hellokoding.springboot.restful.product;
import java.util.List;
public interface ProductMapper {
	 ProductDTO toProductDTO(Product product);

	    List<ProductDTO> toProductDTOs(List<Product> products);

	    Product toProduct(ProductDTO productDTO);
}
