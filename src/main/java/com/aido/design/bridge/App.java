/**
 * 桥接模式
 * 
 * 场景问题：发送提示消息
 * 基本上所有带业务流程处理的系统都会有这样的功能，比如某人有新的工作了，需要发送一条消息提示他。
 * 从业务上看，消息又分成普通消息、加急消息和特急消息多种，不同的消息类型，业务功能处理是不一样的，
 * 比如加急消息是在消息上添加加急，而特急消息除了添加特急外，还会做一条催促的记录，多久不完成会继续催促。
 * 从发送消息的手段上看，又有系统内短消息、手机短消息、邮件等等
 */
package com.aido.design.bridge;

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
