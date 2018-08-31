
public class BinaryIterativeSearch implements Practice2Search{

	@Override
	public String searchName() {
		return "binary iterative";
	}

	@Override
	public int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return -1;
	}

}
