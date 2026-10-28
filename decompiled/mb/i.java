package mb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class i extends h implements l {
    @Override // mb.h, h9.a
    public final Object invoke() throws Throwable {
        Object objInvoke = super.invoke();
        if (objInvoke != null) {
            return objInvoke;
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue", "invoke"));
    }
}
