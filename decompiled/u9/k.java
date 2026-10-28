package u9;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum k {
    BOOLEAN(0),
    CHAR(1),
    BYTE(2),
    SHORT(3),
    INT(4),
    FLOAT(5),
    LONG(6),
    DOUBLE(7);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wa.e f13157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa.e f13158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f13148e = u8.l.M0(new k[]{CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE});

    k(int i7) {
        this.f13157a = wa.e.e(str);
        this.f13158b = wa.e.e(str.concat("Array"));
        j jVar = new j(this, 0);
        t8.i iVar = t8.i.f12827a;
        this.f13159c = t8.a.c(iVar, jVar);
        this.f13160d = t8.a.c(iVar, new j(this, 1));
    }
}
