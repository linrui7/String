1.String类现在提供有两种对象实例化的模式。 
直接赋值
String str = "Hello Bit" ; // str是一个对象，那么"Hello Bit" 就应该保存在堆内存中 
System.out.println(str) ;

传统方法构造
String str = new String("Hello Bit") ;
System.out.println(str) ;


释String类 == 与 equals 的区别
1. ”==”：进行的数值比较，比较的是两个字符串对象的内存地址数值。 
2. “equals（）”：可以进行字符串内容的比较
eg：
 int x = 10 ;
 int y = 10 ;
 System.out.println(x==y); //true
eg：
 String str1 = "Hello" ;
 String str = new String("Hello") ;
 System.out.println(str1.equals(str));
 str1不能为空
 
 
实例化区别(我们一般会采取第一种方式即直接赋值。)
1.直接赋值：只会开辟一块堆内存空间，并且该字符串对象可以自动保存在对象池中以供下次使用。
2.构造方法：会开辟两块堆内存空间，其中一块成为垃圾空间，不会自动保存在对象池中，可以使用 intern()方法手工入池。

 String str1 = "hello" ;
 String str2 = "hello" ;
 String str3 = "hello" ;               //堆空间开辟一个内存块，字符串池共享
 String str4 = new String("hello") ;    //堆空间上开辟两个内存块
 System.out.println(str1 == str2); // true
 System.out.println(str1 == str3); // true
 System.out.println(str2 == str3); // true
 System.out.println(str2 == str4);  // false  
 
 
在String类中提供有方法入池操作 
public String intern() ;
  String str1 = new String("hello").intern() ;   //开辟一个内存块 ，存入共享池
  String str2 = "hello" ;     //在共享池找到同样的字符串，所以为true
  String str3 = new String("hello");
  str3=str3.intern();
  String str4 = "hello" ;
  System.out.println(str1 == str2); // true
  System.out.println(str3 == str4); // true
  
  
字符串一旦定义不可改变(如果对字符串进行更改，开创建新的字符串对象)
  String str = "hello" ;    //1
  str = str + " world" ;    //2
  str += "!!!" ;            //2
  System.out.println(str);  // hello world!!!
  创建了五个字符串对象（产生了大量的垃圾内存）
  
 字符串与字符数组的转换
 String str = "helloworld" ;
	Q/+/ 将字符串变为字符数组
 char[] data = str.toCharArray() ;
 for (int i = 0; i < data.length; i++) {
    System.out.print(data[i]+"、");
 }        // 字符数组转为字符串
 System.out.println(new String(data)); // 全部转换
 System.out.println(new String(data,5,5)); // 部分转换

  
  
  

 
 
 
 
 