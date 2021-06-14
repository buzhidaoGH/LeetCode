//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。 
//
// 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 121
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：x = -121
//输出：false
//解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3： 
//
// 
//输入：x = 10
//输出：false
//解释：从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 示例 4： 
//
// 
//输入：x = -101
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// -231 <= x <= 231 - 1 
// 
//
// 
//
// 进阶：你能不将整数转为字符串来解决这个问题吗？ 
// Related Topics 数学 
// 👍 1528 👎 0

package cn;

class PalindromeNumber {
	public static void main(String[] args) {
		Solution solution = new PalindromeNumber().new Solution();
		boolean palindrome = solution.isPalindrome(100);
		System.out.println(palindrome);
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public boolean isPalindrome(int x) {
			//判断是否大于0,大于0返回true继续判断
			//小于0必定不是回文数,直接返回false
			int ans = 0;
			int x1 = x;
			boolean flag = x >= 0;
			if (flag) {
				// 个人对回文数的定义为翻转过来,值依然相等
				while (x != 0) {
					if (ans != (ans * 10) / 10) {
						return false;
					}
					ans = ans * 10 + x % 10;
					x /= 10;
				}
				return ans == x1 ;
			}
			return flag;
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}