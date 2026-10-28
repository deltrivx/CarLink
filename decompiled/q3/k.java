package q3;

import androidx.lifecycle.t;
import cc.s;
import q2.h0;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends i9.n implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f10921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f10922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f10923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f10924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f10925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f10926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f10927h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10928a;

    static {
        int i7 = 2;
        f10921b = new k(i7, 0);
        f10922c = new k(i7, 1);
        f10923d = new k(i7, 2);
        f10924e = new k(i7, 3);
        f10925f = new k(i7, 4);
        f10926g = new k(i7, 5);
        f10927h = new k(i7, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i7, int i10) {
        super(i7);
        this.f10928a = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7;
        switch (this.f10928a) {
            case 0:
                androidx.compose.ui.viewinterop.a.c((h0) obj).setUpdateBlock((h9.k) obj2);
                return z.f12851a;
            case 1:
                androidx.compose.ui.viewinterop.a.c((h0) obj).setReleaseBlock((h9.k) obj2);
                return z.f12851a;
            case 2:
                androidx.compose.ui.viewinterop.a.c((h0) obj).setModifier((r1.p) obj2);
                return z.f12851a;
            case 3:
                androidx.compose.ui.viewinterop.a.c((h0) obj).setDensity((n3.c) obj2);
                return z.f12851a;
            case 4:
                androidx.compose.ui.viewinterop.a.c((h0) obj).setLifecycleOwner((t) obj2);
                return z.f12851a;
            case 5:
                androidx.compose.ui.viewinterop.a.c((h0) obj).setSavedStateRegistryOwner((a5.g) obj2);
                return z.f12851a;
            default:
                q qVarC = androidx.compose.ui.viewinterop.a.c((h0) obj);
                int iOrdinal = ((n3.o) obj2).ordinal();
                if (iOrdinal != 0) {
                    i7 = 1;
                    if (iOrdinal != 1) {
                        throw new s();
                    }
                } else {
                    i7 = 0;
                }
                qVarC.setLayoutDirection(i7);
                return z.f12851a;
        }
    }
}
