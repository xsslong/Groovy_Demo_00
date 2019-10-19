package mypackage

class SecondGroovy {

    // 成员变量
    def cont = "SecondGroovy"

    static void main(String[] args) {

        // 局部变量
        def i = 1820
        int i2 = 868

        def l = 1820l
        long l2 = 1820l

        def b = false
        boolean b2 = false

        def f = 12.58f
        float f2 = 12.58f

        def d = 8.54d
        double d2 = 8.54d

        def bd = 3.1415926
        BigDecimal bd2 = 3.1415926

        def c = '你看我捶不捶死你'
        Character c2 = '你'

        def s = "你是想笑死我？"
        String s2 = "你是想笑死我？"

        println i.class
        println i2.class
        println l.class
        println b.class
        println f.class
        println d.class
        println bd.class
        println c.class
        println c2.class
        println s.class
        println "hello, groovy!"
    }
}
