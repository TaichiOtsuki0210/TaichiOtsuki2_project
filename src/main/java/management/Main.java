package management;

import java.util.Scanner;

public class Main {
	private static final Scanner scanner = new Scanner(System.in);
	private static final ProductManagementInfo productManager = new ProductManagementInfo();

	public static void main(String[] args) {
		while (true) {
			System.out.println("\n---メニュー---");
			System.out.println("1: 商品追加");
			System.out.println("2: 商品情報取得");
			System.out.println("3: 商品検索");
			System.out.println("4: 商品全て表示");
			System.out.println("5: 商品削除");
			System.out.println("0: 終了");

			System.out.println("\nメニューから操作を選択してください");
			String choice = scanner.nextLine();

			switch (choice) {
			case "1":
				addProduct();
				break;
			case "2":
				getProductInfo();
				break;
			case "3":
				searchProduct();
				break;
			case "4":
				productManager.displayAllProducts();
				break;
			case "5":
				deleteProduct();
				break;
			case "0":
				System.out.println("終了します");
				
			default:
				System.out.println("無効な選択肢です。もう一度入力してください。");
			}
		}
	}

	// 商品追加
	private static void addProduct() {
		System.out.println("商品IDを入力してください: ");
		int id = scanner.nextInt();
		System.out.println("入力されたID:"+id);

		System.out.println("商品名を入力してください: ");
		String name = scanner.nextLine();
		System.out.println("入力された商品名:"+name);


		System.out.println("価格を入力してください: ");
		int price = scanner.nextInt();
		System.out.println("入力された商品名:"+price);


		System.out.println("在庫数を入力してください:");
		int stock = scanner.nextInt();
		System.out.println("入力された在庫"+stock);


		ProductManagement product = new ProductManagement();
		productManager.addProduct(product);
		System.out.println(product+"商品が追加されました。");
	}

	// 商品情報取得（商品名から検索）
	private static void getProductInfo() {
		System.out.print("商品情報を取得する商品名を入力してください:");
		String name = scanner.nextLine();
		ProductManagement product = productManager.getProductInfoByName(name);

		if (product != null) {
			System.out.println("取得した商品は、" + product);
		} else {
			System.out.println("商品が見つかりませんでした。");
		}
	}

	// 商品検索
	private static void searchProduct() {
		System.out.print("検索する商品名を入力してください: ");
		String name = scanner.nextLine();
		var results = productManager.search(name);
		if (results.isEmpty()) {
			System.out.println("該当する商品は見つかりませんでした。");
		} else {
			System.out.println("検索結果:");
			for (ProductManagement product : results) {
				System.out.println(product);
			}
		}
	}

	// 商品削除（ID指定）
	private static void deleteProduct() {
		System.out.print("削除する商品IDを入力してください: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // 改行消費

		boolean deleted = productManager.deleteProduct(id);
		if (deleted) {
			System.out.println("商品IDが"+id+"を削除しました。");
		} else {
			System.out.println("該当する商品は見つかりませんでした。");
		}
	}
}
