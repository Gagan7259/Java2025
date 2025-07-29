package sealedclasses;

sealed class A permits  B,C {

}

final  class B extends A {

}

final class C extends A {

}

class D {

}

public class FInalKeyword {
}
