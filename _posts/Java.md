## java
### 数组
int[] ns=new int[5];
ns[0]=68;
ns[1]=90;
int[] ns=new int[]{68,79,90,};
int[] ns={78,90,};
String[] names={"sdfa","dfa","fadf"};
### 返回数组
```
public static int[] func(){

}
```
### List 使用；
```java
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
List<Integer> tmp=new ArrayList<>();
tmp.add(3);
for(Iterator<Integer>it=tmp.iterator();it.hasNext();)
print(it.next());
```
### 数组初始化
```java
int[] array=new int[100];
```
### maven 
- clean
- default or build
- site
- mvn clean package
- mvn clean 运行清理
- mvn clean compile 清理之后编译，将代码编译到target文件夹中
- mvn clean test 清理和测试
- mvn clean package 清理和打包
- mvn clean install 清理和安装
- mvn clean deploy  清理和发布

java -classpath classes com.test.controller.First 来运行class文件；

- mvn archetype:generate
- com.test.health groupID
- test3             artifactId
- version and package





