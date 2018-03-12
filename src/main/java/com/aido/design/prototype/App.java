/**
 * 原型模式
 * 
 * 场景问题：订单处理系统
 * 现在有一个订单处理的系统，里面有个保存订单的业务功能，在这个业务功能里面，客户有这么一个需求：
 * 每当订单的预定产品数量超过1000的时候，就需要把订单拆成两份订单来保存，如果拆成两份订单后，
 * 还是超过1000，那就继续拆分，直到每份订单的预定产品数量不超过1000。至于为什么要拆分，
 * 原因是好进行订单的后续处理，后续是由人工来处理，每个人工工作小组的处理能力上限是1000。
* 根据业务，目前的订单类型被分成两种：一种是个人订单，一种是公司订单。现在想要实现一个通用的订单处理系统，
* 也就是说，不管具体是什么类型的订单，都要能够正常的处理。
 */
package com.aido.design.prototype;

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
