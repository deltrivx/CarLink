package z9;

import i9.l;
import java.util.Collection;
import lb.r;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15784b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15785c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f15786d = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15787a;

    public /* synthetic */ a(int i7) {
        this.f15787a = i7;
    }

    @Override // z9.d
    public boolean a(x9.e eVar, r rVar) {
        switch (this.f15787a) {
            case 1:
                l.e(eVar, "classDescriptor");
                return true;
            default:
                l.e(eVar, "classDescriptor");
                return !rVar.getAnnotations().i(e.f15788a);
        }
    }

    @Override // z9.b
    public Collection b(x9.e eVar) {
        return w.f13122a;
    }

    @Override // z9.b
    public Collection c(wa.e eVar, x9.e eVar2) {
        l.e(eVar, "name");
        l.e(eVar2, "classDescriptor");
        return w.f13122a;
    }

    @Override // z9.b
    public Collection d(x9.e eVar) {
        return w.f13122a;
    }

    @Override // z9.b
    public Collection e(x9.e eVar) {
        l.e(eVar, "classDescriptor");
        return w.f13122a;
    }
}
