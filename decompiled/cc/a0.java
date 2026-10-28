package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends Error {
    public a0() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(int i7, String str) {
        super(str);
        switch (i7) {
            case 3:
                i9.l.e(str, "message");
                super(str);
                break;
            default:
                i9.l.e(str, "message");
                break;
        }
    }
}
