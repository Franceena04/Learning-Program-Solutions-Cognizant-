package ECommerce_platform;

class Product {
	int productId;
	String productName;
	String category;

	public Product(int id, String name, String c) {
		this.productId = id;
		this.productName = name;
		this.category = c;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}

class Search {
	public void LinearSearch(Product[] list, int target_id) {
		boolean flag = false;
		for (Product p : list) {
			if (p.getProductId() == target_id) {
				System.out.println("Product found");
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("Product not found");
	}

	public void BinarySearch(Product[] list, int target_id) {
		boolean flag = false;
		int left = 0;
		int right = list.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			int mid_id = list[mid].getProductId();
			if (mid_id == target_id) {
				System.out.println("Product found");
				flag = true;
				break;
			} else if (target_id < mid_id)
				right = mid - 1;
			else
				left = mid + 1;
		}
		if (!flag)
			System.out.println("Product not found");
	}
}

public class ECommerce_platform_search_function {
	public static void main(String[] args) {
		Product[] products = {
				new Product(1, "p1", "A"),
				new Product(2, "p2", "B"),
				new Product(3, "p3", "A"),
				new Product(4, "p4", "B"),
				new Product(5, "p5", "A")
		};

		Search search = new Search();

		System.out.println("Linear Search for ID 3:");
		search.LinearSearch(products, 3);

		System.out.println("\nBinary Search for ID 3:");
		search.BinarySearch(products, 3);
	}
}
