package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f13480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ z[] f13481b;

    static {
        z zVar = new z("Default", 0);
        f13480a = zVar;
        f13481b = new z[]{zVar, new z("UserInput", 1), new z("PreventUserInput", 2)};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f13481b.clone();
    }
}
