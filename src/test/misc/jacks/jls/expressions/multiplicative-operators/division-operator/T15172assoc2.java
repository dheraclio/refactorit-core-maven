
class T15172assoc2 {
    void foo(int i) {
        switch (i) {
            case 0:
            case ((10.0 / 3.0 / 2.0 == 1.6666666666666667) ? 1 : 0):
            case ((10.0 / (3.0 / 2.0) == 6.666666666666667) ? 2 : 0):
        }
    }
}
