package test

class TestCommand {

    String s0
    String s1
    String s2
    String s3
    String s4
    String s5
    String s6
    String s7
    String s8
    String s9

    Integer i0
    Integer i1
    Integer i2
    Integer i3
    Integer i4
    Integer i5
    Integer i6
    Integer i7
    Integer i8
    Integer i9

    boolean b0
    boolean b1
    boolean b2
    boolean b3
    boolean b4
    boolean b5
    boolean b6
    boolean b7
    boolean b8
    boolean b9

    static constraints = {

        s0(maxSize: 40, blank: false)
        s1(maxSize: 40, blank: false)
        s2(maxSize: 40, nullable: true)
        s3(maxSize: 40, nullable: true)
        s4(maxSize: 40, nullable: true)
        s5(maxSize: 40, nullable: true)
        s6(maxSize: 40, nullable: true)
        s7(maxSize: 40, nullable: true)
        s8(maxSize: 40, nullable: true)
        s9(maxSize: 40, nullable: true)

        i0(nullable: true)
        i1(nullable: true)
        i2(nullable: true)
        i3(nullable: true)
        i4(nullable: true)
        i5(nullable: true)
        i6(nullable: true)
        i7(nullable: true)
        i8(nullable: true)
        i9(nullable: true)

    }
}
