package ya;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum h {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f15198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f15199c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15214a;

    static {
        h[] hVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (h hVar : hVarArrValues) {
            if (hVar.f15214a) {
                arrayList.add(hVar);
            }
        }
        f15198b = u8.p.M0(arrayList);
        f15199c = u8.l.M0(values());
    }

    h(boolean z10) {
        this.f15214a = z10;
    }
}
