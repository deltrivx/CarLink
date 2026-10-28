package m3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f8416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f8417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j[] f8418c;

    static {
        j jVar = new j("Ltr", 0);
        f8416a = jVar;
        j jVar2 = new j("Rtl", 1);
        f8417b = jVar2;
        f8418c = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f8418c.clone();
    }
}
