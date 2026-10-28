package g3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f5894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f5895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f5896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f5897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ y[] f5898e;

    static {
        y yVar = new y("StartInput", 0);
        f5894a = yVar;
        y yVar2 = new y("StopInput", 1);
        f5895b = yVar2;
        y yVar3 = new y("ShowKeyboard", 2);
        f5896c = yVar3;
        y yVar4 = new y("HideKeyboard", 3);
        f5897d = yVar4;
        f5898e = new y[]{yVar, yVar2, yVar3, yVar4};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f5898e.clone();
    }
}
