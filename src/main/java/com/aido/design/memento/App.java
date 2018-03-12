/**
 * 备忘录模式
 * 
 * 场景问题：开发仿真系统
 * 考虑这样一个仿真应用，功能是：模拟运行针对某个具体问题的多个解决方案，记录运行过程的各种数据，在模拟运行完成过后，
 * 好对这多个解决方案进行比较和评价，从而选定最优的解决方案。

 * 这种仿真系统，在很多领域都有应用，比如：工作流系统，对同一问题制定多个流程，然后通过仿真运行，最后来确定最优的流程做为解决方案；
 * 在工业设计和制造领域，仿真系统的应用就更广泛了。

 * 由于都是解决同一个具体的问题，这多个解决方案并不是完全不一样的，假定它们的前半部分运行是完全一样的，只是在后半部分采用了不同的解决方案，
 * 后半部分需要使用前半部分运行所产生的数据。

 * 由于要模拟运行多个解决方案，而且最后要根据运行结果来进行评价，这就意味着每个方案的后半部分的初始数据应该是一样，
 * 也就是说在运行每个方案后半部分之前，要保证数据都是由前半部分运行所产生的数据，当然，咱们这里并不具体的去深入到底有哪些解决方案，
 * 也不去深入到底有哪些状态数据，这里只是示意一下。
 */
package com.aido.design.memento;

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
