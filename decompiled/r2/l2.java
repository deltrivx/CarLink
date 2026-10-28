package r2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l2 implements q2.r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Float f11324c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f11325d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y2.h f11326e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y2.h f11327f = null;

    public l2(int i7, ArrayList arrayList) {
        this.f11322a = i7;
        this.f11323b = arrayList;
    }

    @Override // q2.r1
    public final boolean p() {
        return this.f11323b.contains(this);
    }
}
