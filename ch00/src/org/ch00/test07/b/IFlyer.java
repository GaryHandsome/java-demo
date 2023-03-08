package org.ch00.test07.b;

/**
 * 定义接口 - 用于描述“飞”的行为
 *
 * 在接口中，可以定义多个抽象方法，但一般不建议，否则很可能导致接口污染
 * 比如：定义一个接口，描述“飞“和”游泳“的行为
 *
 * 在接口中，可以只写常量，而不写抽象方法，这样的接口，我们称之为常量接口
 *
 * 在接口中，可以不写任意的常量和抽象方法，这样的接口，我们称之为标记接口
 *
 *
 * @Date 2023-03-08
 * @Author zqx
 */
public interface IFlyer {
    public abstract void fly() ;
}