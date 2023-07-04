// https://leetcode.com/problems/greatest-common-divisor-of-strings/

function gcdOfStrings(str1: string, str2: string): string {
  let divisior = str1.length >= str2.length ? str2 : str1;
  let len = divisior.length;
}

console.log(gcdOfStrings("ABCABC", "ABC"));
