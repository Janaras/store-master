package repository;

import model.Product;

public interface ProductRepository {

      void findByCategoryOrderByPriceDesc(Double price);
      void countDistinctByCategory(int id);

}
