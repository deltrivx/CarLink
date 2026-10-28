package o9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f9562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f9563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f9564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ m[] f9565d;

    static {
        m mVar = new m("INSTANCE", 0);
        f9562a = mVar;
        m mVar2 = new m("EXTENSION_RECEIVER", 1);
        f9563b = mVar2;
        m mVar3 = new m("VALUE", 2);
        f9564c = mVar3;
        f9565d = new m[]{mVar, mVar2, mVar3};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f9565d.clone();
    }
}
