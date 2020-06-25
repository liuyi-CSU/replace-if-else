# replace-if-else
## 三种实现思路
1.把接口分为外部和内部接口，所有空值判断放在外部接口完成；而内部接口传入的变量由外部接口保证不为空，从而减少空值判断；

2.利用多态，把业务判断消除，各子类分别关注自己的实现，并实现子类的创建方法，避免用户了解过多的类；

3.把分支状态信息预先缓存在Map里，直接get获取具体值，消除分支。

## 查看动态代理生成类
为了追踪JVM在运行过程中生成的JDK动态代理类。我们可以设置VM启动参数如下：

-Dsun.misc.ProxyGenerator.saveGeneratedFiles=true

该参数可以保存所生成的JDK动态代理类到本地。额外说一句，若我们想追踪cglib所生成的代理类，即对应的字节码文件，可以设置参数：

System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "保存的路径");
