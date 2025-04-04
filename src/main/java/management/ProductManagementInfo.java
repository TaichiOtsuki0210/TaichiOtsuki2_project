package management;

import java.util.ArrayList;
import java.util.List;

public class ProductManagementInfo implements SearchProduct {
	private final List<ProductManagement> productsList;

	public ProductManagementInfo() {
		this.productsList = new ArrayList<>();
	}

	// 商品追加
	public void addProduct(ProductManagement product) {
		productsList.add(product);
	}

	// 商品情報取得（商品名から）
	public ProductManagement getProductInfoByName(String name) {
		for (ProductManagement product : productsList) {
			if (product.getName().equals(name)) {
				return product;
			}
		}
		return null;
	}

	// 商品情報取得（IDから）
	public ProductManagement getProductInfoById(int id) {
		for (ProductManagement product : productsList) {
			if (product.getId() == id) {
				return product;
			}
		}
		return null;
	}

	// 商品検索
	public List<ProductManagement> search(String name) {
		List<ProductManagement> results = new ArrayList<>();
		for (ProductManagement product : productsList) {
			if (product.getName().contains(name)) {
				results.add(product);
			}
		}
		return results;
	}

	// 商品削除（ID指定）
	public boolean deleteProduct(int id) {
		return productsList.removeIf(product -> product.getId() == id);
	}

	// 全商品を表示
	public void displayAllProducts() {
		if (productsList.isEmpty()) {
			System.out.println("商品が登録されていません。");
		} else {
			System.out.println("--- 商品リスト ---");
			for (ProductManagement product : productsList) {
				System.out.println(product);
			}
		}
	}
}
