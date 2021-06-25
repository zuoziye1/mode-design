package com.design.common.回调函数;

/**
 * @Author: 姚飞虎
 * @Date: 2021/6/25 3:32 下午
 * @Description:
 */
public class 普通说明示例 {

    private interface 回调接口{

        /**
         * 回调响应接口
         */
        void solve();
    }

    /**
     * A
     */
    private static class 调用方 implements 回调接口{
        private 被调用方 b ;

        /**
         *  * 本质，你触发一个请求，而这个请求需要服务端的相应处理，它响应处理完了，
         *  * 告诉你（通过调用你的方法，例如你有一个拨打电话给你的方法。），这就是回调，
         *  * 然后你就可以基于回调回来的信息，继续处理一些事情
         */
        public void request(){
            调用方 a = new 调用方();
            b.b(a);

        }

        @Override
        public void solve() {
            // 回调调用方，让调用方做一些业务处理
        }
    }

    /**
     * B
     */
    private static class 被调用方{

        /**
         * 业务处理完，回调
         */
        public void b(调用方 a){
            // 业务处理
            // ...
            a.solve();
        }
    }


}
