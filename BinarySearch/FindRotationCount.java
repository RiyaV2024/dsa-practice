
class Solution {
public int findKRotation(int arr[]) {
int left = 0;
int right = arr.length - 1;
int ans = Integer.MAX_VALUE;
int index = 0;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[left] <= arr[mid]) {
            if (arr[left] < ans) {
                ans = arr[left];
                index = left;
            }
            left = mid + 1;
        } else {
            if (arr[mid] < ans) {
                ans = arr[mid];
                index = mid;
            }
            right = mid - 1;
        }
    }
    return index;
}

}
