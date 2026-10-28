package x;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14316c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EdgeEffect f14317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f14318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f14319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EdgeEffect f14320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EdgeEffect f14321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EdgeEffect f14322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EdgeEffect f14323j;
    public EdgeEffect k;

    public b0(Context context, int i7) {
        this.f14314a = context;
        this.f14315b = i7;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? k.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(z.x0 x0Var) {
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f14314a;
        EdgeEffect edgeEffectA = i7 >= 31 ? k.a(context) : new e0(context);
        edgeEffectA.setColor(this.f14315b);
        if (!n3.m.a(this.f14316c, 0L)) {
            if (x0Var == z.x0.f15591a) {
                long j5 = this.f14316c;
                edgeEffectA.setSize((int) (j5 >> 32), (int) (4294967295L & j5));
                return edgeEffectA;
            }
            long j10 = this.f14316c;
            edgeEffectA.setSize((int) (4294967295L & j10), (int) (j10 >> 32));
        }
        return edgeEffectA;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f14318e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(z.x0.f15591a);
        this.f14318e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f14319f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(z.x0.f15592b);
        this.f14319f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f14320g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(z.x0.f15592b);
        this.f14320g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f14317d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(z.x0.f15591a);
        this.f14317d = edgeEffectA;
        return edgeEffectA;
    }
}
