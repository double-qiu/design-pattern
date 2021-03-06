/**
 * 观察者模式
 * 
 * 场景问题：订阅报纸的过程
 * 来考虑实际生活中订阅报纸的过程，这里简单总结了一下，订阅报纸的基本流程如下：
 * 首先按照自己的需要选择合适的报纸，具体的报刊杂志目录可以从邮局获取；
 * 选择好后，就到邮局去填写订阅单，同时交上所需的费用；
 * 至此，就完成了报纸的订阅过程，接下去的就是耐心等候，报社会按照出报时间推出报纸，然后报纸会被送到每个订阅人的手里。
 * 虽然看起来订阅者是直接跟邮局在打交道，但实际上，订阅者的订阅数据是会被邮局传递到报社的，当报社出版了报纸，
 * 报社会按照订阅信息把报纸交给邮局，然后由邮局来代为发送到订阅者的手中。所以在整个过程中，邮局只不过起到一个中转的作用，
 * 为了简单，我们去掉邮局，让订阅者直接和报社交互
 */
package com.aido.design.observer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
