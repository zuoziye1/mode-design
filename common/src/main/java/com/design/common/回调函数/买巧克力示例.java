package com.design.common.回调函数;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @Author: 姚飞虎
 * @Date: 2021/6/25 3:46 下午
 * @Description:
 */
public class 买巧克力示例 {

    public static void main(String[] args) {
        new 买方(new 卖方()).request();
    }

    private interface 回调接口{
        /**
         * 回调响应
         */
        void solve() ;
    }

    /**
     * A
     */
    @AllArgsConstructor
    @NoArgsConstructor
    private static class 买方 implements 回调接口{

        private 卖方 b ;

        public void request(){
            买方 a = new 买方();
            System.out.println("老板，有费罗列巧克力吗？");
            // 老板发现没有了，去进货
            b.进货(a);
        }

        @Override
        public void solve() {
            // 回调响应
            System.out.println("回调响应");
        }
    }

    /**
     * B
     */
    private static class 卖方{

        public void 进货(买方 a){
            // 进货回来了
            System.out.println("进货回来了");
            a.solve();
        }
    }
}
