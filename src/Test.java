import LeetCode.SumOfUnique;
import Sorting.DirectInsertSort;
import Sorting.QuickSort;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lichen
 * @date    2022-01-29
 * @description     这是用来测试所写类的功能的测试入口
 * */
public class Test {

    // test
    public static void main(String[] args) {
        int [] origin = {1, 1, 1, 1};
        System.out.println(new SumOfUnique().sumOfUnique(origin));
    }
}