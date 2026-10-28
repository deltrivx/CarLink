package v9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: Fake field, exist only in values array */
    d EF5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f13696b = {new d("Function", 0), new d("SuspendFunction", 1), new d("KFunction", 2), new d("KSuspendFunction", 3), new d("UNKNOWN", 4)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n4.e f13695a = new n4.e(19);

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f13696b.clone();
    }
}
