// https://leetcode.com/problems/smallest-even-multiple/
// Роблю на сайті і перекидую сюди, але не розумію помилку, чого програма код не може перевірити. У скріншотах, у першій домашці я скрін закріпив

class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        }
        return n * 2;
    }
}
