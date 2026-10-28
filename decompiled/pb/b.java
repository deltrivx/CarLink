package pb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b[] f10365a = {new b("ERROR_CLASS", 0), new b("ERROR_FUNCTION", 1), new b("ERROR_SCOPE", 2), new b("ERROR_MODULE", 3), new b("ERROR_PROPERTY", 4), new b("ERROR_TYPE", 5), new b("PARENT_OF_ERROR_SCOPE", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    b EF5;

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f10365a.clone();
    }
}
