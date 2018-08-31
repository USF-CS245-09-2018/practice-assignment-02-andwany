
public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "binary recursive";
	}
	
	@Override
	public int search(int[] arr, int target) {
		return search(arr, target, 0, arr.length - 1);
	}

	public int search(int[] arr, int target, int start, int end) {
		if (start > end) {
			return -1;
		}
		int mid = (start + end) / 2;
		if (arr[mid] == target) {
			return mid;
		} else if (arr[mid] > target) {
			return search(arr, target, start, mid - 1);
		}
		return search(arr, target, mid + 1, end);
	}

}
