package product;

public class Main {
	public static void main(String[] args) {
		ProductManager manager = new ProductManager();

		// 商品を追加
		manager.addProduct(new Product(1, "冷蔵庫", 50000, 10));
		manager.addProduct(new Product(2, "ソファ", 30000, 5));
		manager.addProduct(new Product(3, "米", 2000, 3));
		manager.addProduct(new Product(4, "小説", 1500, 4));
		manager.addProduct(new Product(5, "Tシャツ", 1500, 5));

		// 商品一覧を表示
		System.out.println("\n---商品を追加して全てを表示する---");
		for (Product product : manager.getProductList()) {
			System.out.println(product);
		}

		// 商品の削除
		manager.removeProduct(1);

		System.out.println("\n---商品を1つ削除して全てを表示する---");
		for (Product product : manager.getProductList()) {
			System.out.println(product);
		}

		// 商品の検索
		System.out.println("\n---商品名「米」の情報を表示する---");
		Product foundProduct = manager.getProductByName("米");
		if (foundProduct != null) {
			//foundProductがnullではない
			System.out.println(foundProduct);
		} else {
			System.out.println("商品が見つかりませんでした。");
		}
	}
}
