package k7;

import fc.h0;
import fc.y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kb.d f7353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f7354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f7355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f7356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f7357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f7358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f7359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f7360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ h[] f7361i;

    static {
        h hVar = new h("Idle", 0);
        f7355c = hVar;
        h hVar2 = new h("Init", 1);
        f7356d = hVar2;
        h hVar3 = new h("Playing", 2);
        f7357e = hVar3;
        h hVar4 = new h("Paused", 3);
        f7358f = hVar4;
        h hVar5 = new h("Stopped", 4);
        f7359g = hVar5;
        h hVar6 = new h("Error", 5);
        f7360h = hVar6;
        f7361i = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6};
        f7353a = new kb.d(22);
        f7354b = y.b(Boolean.FALSE);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f7361i.clone();
    }
}
