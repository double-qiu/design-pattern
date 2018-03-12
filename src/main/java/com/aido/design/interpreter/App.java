/**
 * 解释器模式
 * 
 * 场景问题：读取配置文件
 * 考虑这样一个实际的应用，维护系统自定义的配置文件。
 * 几乎每个实际的应用系统都有与应用自身相关的配置文件，这个配置文件是由开发人员根据需要自定义的，系统运行时会根据配置的数据进行相应的功能处理。
 * 系统现有的配置数据很简单，主要是JDBC所需要的数据，还有默认读取Spring的配置文件，目前系统只需要一个Spring的配置文件。示例如下：
 * <?xml version="1.0" encoding="UTF-8"?>
 * <root>
 *     <jdbc>
 *         <driver-class>驱动类名</driver-class>
 *         <url>连接数据库的URL</url>
 *         <user>连接数据库的用户名</user>
 *         <password>连接数据库的密码</password>
 *     </jdbc>
 *     <application-xml>缺省读取的Spring配置的文件名称</application-xml>
 * </root>
 * 现在的功能需求是：如何能够灵活的读取配置文件的内容？
 */
package com.aido.design.interpreter;

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
