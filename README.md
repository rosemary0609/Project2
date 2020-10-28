# Project2  计G201 李青青 2020322064
## 学生选课系统
### 一、实验目的
1、从学生角度了解系统中的实体及其关系，学会定义类中的属性及方法。  
2、掌握面向对象的类中设计方法（属性、方法）。  
3、掌握类的继承用法，通过构造方法实例化对象。  
4、学会使用super()，用于实例化子类。  
5、掌握使用Objcet根类的toString()方法，应用在相关对象的信息输出中。
### 二、实验要求  
1、编写上述实体类以及测试主类（需注意类之间的继承关系的适用）。  
2、在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师等）；  模拟学生退课操作，在打印课程信息。
### 三、实验过程  
1、首先，设置了五个类，分别为：Test主类、Staff人员类，并将Staff人员类设置为父类、将Teacher类和Student类设置为继承父类的子类。  
2、在Teacher类里设置了课程、年龄、课程数量这三个属性，再设置这三个属性的get、set方法，再设置有参构造方法，用super语句继承父类staff中子类与父类相同的属性。 
  再对当前类中设置的属性调用当前对象。设置退课、选课不成功的judge方法，用if、else进行判断，最后用tostring方法将所设置的这些属性进行输出。  
3、在Student类里设置院系、课程编号，再设置这些属性的get、set方法，接着设置有参构造方法，用super语句继承父类staff中子类与父类相同的属性。再对当前类中设置的属性调用当前对象。
定义course类型的course，让其与course相关联，定义Teacher类型的t1，让其与teacher相关联。定义main属性，让其与course类相关联，能够输出课程信息。   
4、在Staff父类里设置人数、姓名、性别、年级这四个属性，再设置这些属性的get、set方法，接着设置有参构造方法，再对当前类中设置的属性调用当前对象。最后用tostring方法将所设置的这些属性进行输出。  
5、在Course课程类里设置人数、课程、上课地点、指导老师、上课时间以及学分的这些属性，再设置这些属性的get、set方法，接着设置有参构造方法，再对当前类中设置的属性调用当前对象。
最后用tostring方法将所设置的这些属性进行输出。  
6、在Test主类先对Teacher、Course、Student按照所设置有参的顺序进行赋值，将course对象里的内容赋值给student的setCourse方法，将student对象里的内容赋值给teacher的setT1方法。
调用Teacher类里设置的judge方法判断选课数量。在对象里设置tuike方法，将test实例化，使对象调用实例方法。用if-else if进行选课成功与否的判断，在tuike方法里将课程数量进行选课成功与否的
判断前提。
### 四、核心代码  
1、![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/ruAMsa53pVQWN7FLK88i5jc*b91U34O2XRg5gKrMbSSKJ3ZOT2TDIsk.IBjFL5w4eZ9wrJVIuLMmUM1Jj8WpvCKj7IkOA.3k*qfuZdvAsew!/b&bo=ZgJwAQAAAAADBzc!&rf=viewer_4)  
2、![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/ruAMsa53pVQWN7FLK88i5m8qxH9ZYzkHLIe4VS*dzHELBe*YhZO4Avspuj9fvqeNAna9BUpzO4Sr6Ffq1.TsPg0zF836cl.b5.kCPGRXnjY!/b&bo=BALFAAAAAAADB.E!&rf=viewer_4)    
3、![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/ruAMsa53pVQWN7FLK88i5m8qxH9ZYzkHLIe4VS*dzHFjvlUCCMKtBFRi58m3TI3Jpi9wBpvC.zDnBcFyzvinR4BYQdI0dHOkyjJE.*XI*0g!/b&bo=mgF.AAAAAAADB8c!&rf=viewer_4)    
4、![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/ruAMsa53pVQWN7FLK88i5m8qxH9ZYzkHLIe4VS*dzHF52NAR64flox0vy39NHRC7IT3nOcT5XfoX5RmfssX0Q0.I2GS6GLttYU5HHcgz4BE!/b&bo=IQN8AAAAAAADB3w!&rf=viewer_4)
### 五、系统运行截图  
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/ruAMsa53pVQWN7FLK88i5iUc4cHuEdBBvs*DMoKArb9gESTeNwwz9C07xO9xNKIxHpzwe5Jx1rb9av3EDDU1eM1CAikhRf8ow.ZJxPX0hxM!/b&bo=.gP0AAAAAAADBy8!&rf=viewer_4)
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/ruAMsa53pVQWN7FLK88i5iUc4cHuEdBBvs*DMoKArb9msQ3I7vXfW32*92TdNUbgFnZSUlIXxYXEGLaygKmPlqbcsm9NvONsjRdkt05tz9M!/b&bo=hgO2AAAAAAADBxE!&rf=viewer_4)
### 六、编程感想
在这次编程中，已掌握定义类中的属性及方法，学会使用super()，用于实例化子类的方法，也会使用tostring方法对所设的属性进行输出，掌握了类的继承用法，通过构造方法实例化对象。但是在编程的过程中，也遇到了问题，不知道如何将Teacher类和Student类与Course类相关联，但在老师的指导下，只需要定义course类型的course，让其与course相关联即可，便能打印出学生成功选课所对应的选课信息，再实现逻辑判断退课、选课不成功的功能，最终完成学生选课这一系统。
