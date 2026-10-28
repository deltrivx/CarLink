package t5;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f12786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f12787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f12788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f12789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f12790i;

    public f(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f12782a = f10;
        this.f12783b = f13;
        this.f12784c = f16;
        this.f12785d = f11;
        this.f12786e = f14;
        this.f12787f = f17;
        this.f12788g = f12;
        this.f12789h = f15;
        this.f12790i = f18;
    }

    public static f a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        f fVarB = b(f10, f11, f12, f13, f14, f15, f16, f17);
        float f26 = fVarB.f12786e;
        float f27 = fVarB.f12790i;
        float f28 = fVarB.f12787f;
        float f29 = fVarB.f12789h;
        float f30 = (f26 * f27) - (f28 * f29);
        float f31 = fVarB.f12788g;
        float f32 = fVarB.f12785d;
        float f33 = (f28 * f31) - (f32 * f27);
        float f34 = (f32 * f29) - (f26 * f31);
        float f35 = fVarB.f12784c;
        float f36 = fVarB.f12783b;
        float f37 = (f35 * f29) - (f36 * f27);
        float f38 = fVarB.f12782a;
        float f39 = (f27 * f38) - (f35 * f31);
        float f40 = (f31 * f36) - (f29 * f38);
        float f41 = (f36 * f28) - (f35 * f26);
        float f42 = (f35 * f32) - (f28 * f38);
        float f43 = (f38 * f26) - (f36 * f32);
        f fVarB2 = b(f18, f19, f20, f21, f22, f23, f24, f25);
        float f44 = fVarB2.f12782a;
        float f45 = fVarB2.f12785d;
        float f46 = fVarB2.f12788g;
        float f47 = (f46 * f41) + (f45 * f37) + (f44 * f30);
        float f48 = (f46 * f42) + (f45 * f39) + (f44 * f33);
        float f49 = f46 * f43;
        float f50 = f49 + (f45 * f40) + (f44 * f34);
        float f51 = fVarB2.f12783b;
        float f52 = fVarB2.f12786e;
        float f53 = fVarB2.f12789h;
        float f54 = (f53 * f41) + (f52 * f37) + (f51 * f30);
        float f55 = (f53 * f42) + (f52 * f39) + (f51 * f33);
        float f56 = f53 * f43;
        float f57 = f56 + (f52 * f40) + (f51 * f34);
        float f58 = fVarB2.f12784c;
        float f59 = fVarB2.f12787f;
        float f60 = f37 * f59;
        float f61 = fVarB2.f12790i;
        return new f(f47, f48, f50, f54, f55, f57, (f41 * f61) + f60 + (f30 * f58), (f42 * f61) + (f39 * f59) + (f33 * f58), (f61 * f43) + (f59 * f40) + (f58 * f34));
    }

    public static f b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new f(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float f25 = ((f23 * f18) - (f21 * f19)) / f24;
        float f26 = ((f20 * f19) - (f18 * f22)) / f24;
        return new f((f25 * f12) + (f12 - f10), (f26 * f16) + (f16 - f10), f10, (f25 * f13) + (f13 - f11), (f26 * f17) + (f17 - f11), f11, f25, f26, 1.0f);
    }
}
