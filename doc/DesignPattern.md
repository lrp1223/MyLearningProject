# Design Pattern

## Chapter2 Simple Factory(简单工厂模式)
Simple factory: create interface or abstract class, even class;   
Static factory: Simple factory + static method;   
万能工厂：
#### 优点：帮助封装；解耦；
#### 缺点：增加客户端复杂度；不方便扩展子工厂；
#### 本质：选择实现；

## Chapter3 Facade(外观模式)
目的：让外部减少与子系统的内部多个模块的交互，松散耦合；
### 优点： 松散耦合，简单易用。。。
### 缺点：不合理的Facade容易让人迷惑；
### 本质：封装交互，简化调用；
相关模式：**中介者模式；**

## Chapter4 Adapter(适配器模式)
将一个类的接口转换成客户希望的另外一个接口；
适配器通常是一个类，一般让适配器类去实现Target接口，然后在适配器具体实现里面调用Adaptee；
### 优点：更好的复用，更好的可扩展性；
### 缺点：过多的使用，会让系统非常凌乱，不容易整体进行把握；
### 本质：转换匹配，复用功能；

## Singleton(单例模式)
保证一个类仅有一个实例，并提供一个它的全局的访问点；
懒汉模式：
饿汉模式：
### 本质：控制实例数目；

