
class T15181f6 {
    void foo(int i) {
        switch (i) {
            case 0:
            case (("" + 123456768f == "1.2345677E8") ? 1 : 0):
            case (("" + 123456776f == "1.23456776E8") ? 2 : 0):
            case (("" + 123456784f == "1.2345678E8") ? 3 : 0):
            case (("" + 123456792f == "1.2345679E8") ? 4 : 0):
            case (("" + 123456800f == "1.234568E8") ? 5 : 0):
        }
    }
}