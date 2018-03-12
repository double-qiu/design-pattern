/**
 * 访问者模式
 * 
 * 场景问题：扩展客户管理的功能
 * 既然是扩展功能，那么肯定是已经存在一定的功能了，先看看已有的功能：公司的客户分成两大类，
 * 一类是企业客户，一类是个人客户，现有的功能非常简单，就是能让客户提出服务申请。
 * 以前对客户的管理功能是很少的，现在随着业务的发展，需要加强对客户管理的功能，假设现在需要增加如下的功能：
 * 客户对公司产品的偏好分析，针对企业客户和个人客户有不同的分析策略，主要是根据以往购买的历史、
 * 潜在购买意向等进行分析，对于企业客户还要添加上客户所在行业的发展趋势、客户的发展预期等的分析。

 * 客户价值分析，针对企业客户和个人客户，有不同的分析方式和策略。
 * 主要是根据购买的金额大小、购买的产品和服务的多少、购买的频率等进行分析。

 * 其实除了这些功能，还有很多潜在的功能，只是现在还没有要求实现，比如：针对不同的客户进行需求调查；
 * 针对不同的客户进行满意度分析；客户消费预期分析等等。虽然现在没有要求实现，但不排除今后有可能会要求实现。
 */
package com.aido.design.visitor;

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
