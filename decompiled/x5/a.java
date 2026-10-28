package x5;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f14592b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f14594d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f14591a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f14593c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f14595e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f14592b = cArr;
        f14594d = cArr;
    }

    public static void a(int i7, int i10, int[] iArr) {
        int i11 = ((i7 << 8) + i10) - 1;
        int i12 = i11 / 1600;
        iArr[0] = i12;
        int i13 = i11 - (i12 * 1600);
        int i14 = i13 / 40;
        iArr[1] = i14;
        iArr[2] = i13 - (i14 * 40);
    }

    public static int b(int i7, int i10) {
        int i11 = i7 - (((i10 * 149) % 255) + 1);
        return i11 >= 0 ? i11 : i11 + 256;
    }
}
