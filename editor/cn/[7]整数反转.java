//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
// 示例 1：
//输入：x = 123
//输出：321
// 示例 2：
//输入：x = -123
//输出：-321
// 示例 3：
//输入：x = 120
//输出：21
// 示例 4：
//输入：x = 0
//输出：0
// 提示：
// -231 <= x <= 231 - 1 
// 
// Related Topics 数学 
// 👍 2863 👎 0

package cn;

class ReverseInteger {
	public static void main(String[] args) {
		Solution solution = new ReverseInteger().new Solution();
		int reverse = solution.reverse(1201);
		System.out.println(reverse);
	}

	// class Solution {
	// 	public int reverse(int x) {
	// 		int res = 0;
	// 		while(x!=0) {
	// 			//每次取末尾数字
	// 			int tmp = x%10;
	// 			//判断是否 大于 最大32位整数
	// 			if (res>214748364 || (res==214748364 && tmp>7)) {
	// 				return 0;
	// 			}
	// 			//判断是否 小于 最小32位整数
	// 			if (res<-214748364 || (res==-214748364 && tmp<-8)) {
	// 				return 0;
	// 			}
	// 			res = res*10 + tmp;
	// 			x /= 10;
	// 		}
	// 		return res;
	// 	}
	// }
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		//TODO
		public int reverse(int x) {
			int flag = x > 0 ? 1 : -1;
			int ans = 0;
			while (x != 0) {
				if (ans != (ans * 10) / 10) {
					return 0;
				}
				ans = ans * 10 + x % 10;
				x /= 10;
			}
			return ans;
		}
	}

//leetcode submit region end(Prohibit modification and deletion)

}
/**
 * 个人思路:先把x拆分存入数组(或者ArrayList中),==>遇到问题,不能直接拆分,准备转换成字符串然后拆字符串
 * 然后反转,再转换为整型,
 * 判断是否在-2^31<=x<=2^31-1之间,如果不在就返回0
 *
 * 理论上可以,实际操作起来比较麻烦(经过查阅资料)
 * 数字的翻转可以通过余数和*10来实现
 * ans != (ans * 10) / 10来判断是否出界
 */