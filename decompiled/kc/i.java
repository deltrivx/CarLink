package kc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f7532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f7533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f7534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f7535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i[] f7536e;

    static {
        i iVar = new i("SUCCESSFUL", 0);
        f7532a = iVar;
        i iVar2 = new i("REREGISTER", 1);
        f7533b = iVar2;
        i iVar3 = new i("CANCELLED", 2);
        f7534c = iVar3;
        i iVar4 = new i("ALREADY_SELECTED", 3);
        f7535d = iVar4;
        f7536e = new i[]{iVar, iVar2, iVar3, iVar4};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f7536e.clone();
    }
}
