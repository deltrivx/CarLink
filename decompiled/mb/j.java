package mb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f8622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f8623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f8624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j[] f8625d;

    static {
        j jVar = new j("NOT_COMPUTED", 0);
        f8622a = jVar;
        j jVar2 = new j("COMPUTING", 1);
        f8623b = jVar2;
        j jVar3 = new j("RECURSION_WAS_DETECTED", 2);
        f8624c = jVar3;
        f8625d = new j[]{jVar, jVar2, jVar3};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f8625d.clone();
    }
}
