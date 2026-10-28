package o9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f9570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f9571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f9572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ y[] f9573d;

    static {
        y yVar = new y("INVARIANT", 0);
        f9570a = yVar;
        y yVar2 = new y("IN", 1);
        f9571b = yVar2;
        y yVar3 = new y("OUT", 2);
        f9572c = yVar3;
        f9573d = new y[]{yVar, yVar2, yVar3};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f9573d.clone();
    }
}
