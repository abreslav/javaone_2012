class HelloK(val name: String) {
    fun sayHello() {
        println("Hello, I'm $name")
    }
}


/*
$ javap -p HelloK
Compiled from "hello.kt"
public final class HelloK extends java.lang.Object implements jet.JetObject{
    private final java.lang.String name;
    public final void sayHello();
    public final java.lang.String getName();
    public HelloK(java.lang.String);
}
*/

/*
public HelloK(java.lang.String);
  Code:
   0:	aload_0
   1:	invokespecial	#52; //Method java/lang/Object."<init>":()V
   4:	aload_0
   5:	aload_1
   6:	putfield	#32; //Field name:Ljava/lang/String;
   9:	return
*/

class HelloK2(val name: String = "Joe") {
    fun sayHello() {
        println("Hello, I'm $name")
    }
}

/*
$ javap -p HelloK2
Compiled from "hello.kt"
public final class HelloK2 extends java.lang.Object implements jet.JetObject{
    private final java.lang.String name;
    public final void sayHello();
    public final java.lang.String getName();
    public HelloK2(java.lang.String);
    public HelloK2(java.lang.String, int);
}
*/