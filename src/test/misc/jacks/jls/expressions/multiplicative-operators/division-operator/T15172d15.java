
class T15172d15 {
    void foo(int i) {
        switch (i) {
            case 0:
            case ((0x30000000000004L / 3d == 0x10000000000001L) ? 1 : 0):
            case ((0x30000000000008L / 3d == 0x10000000000003L) ? 2 : 0):
            case ((2.5e-323 / 2d == 1e-323) ? 3 : 0):
            case ((3.5e-323 / 2d == 2e-323) ? 4 : 0):
        }
    }
}
